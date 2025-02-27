Full Name: Kirill Klimashenko

Student ID: 10622092 

Course Name: Software Testing and Quality Assessment 

Date of Submission: February 27, 2025  




**Title of the Report**  
Design and Testing of a Grading System Using Java and JUnit 5  

---

### Study Explanation

#### Objective  
The purpose of this project was to design and implement a grading system using Java, focusing on two core classes: `Student` and `Course`. My goal was to create a system where students could enroll in courses, have their grades calculated based on weighted assessments, and compute their overall GPA. Beyond implementation, I aimed to validate the system’s functionality through unit tests and a test suite using JUnit 5, ensuring every component performed as intended. This project was an opportunity to strengthen my skills in object-oriented programming, test-driven development, and the practical application of Java in a real-world context.

#### Methodology  
I started by designing the `Student` and `Course` classes based on the assignment requirements. For the `Student` class, I included attributes such as `studentId`, `name`, and a list to track enrolled courses. I wrote methods to:
- Add courses to a student’s enrollment.
- Retrieve grades for specific courses.
- Calculate the GPA as the average of all course grades.

For the `Course` class, I defined attributes like `courseId`, `courseName`, and grades for five assessments: two assignments, a midterm exam, a final exam, and a final project. The methods I implemented allowed:
- Setting individual assessment grades.
- Calculating the final course grade using a weighted average, with weights assigned as follows:
  - Assignments: 20% (10% each)
  - Midterm Exam: 30%
  - Final Exam: 40%
  - Final Project: 10%

Next, I developed unit tests to verify the behavior of both classes. For the `Student` class, I tested:
- Adding courses and confirming they were stored correctly.
- Retrieving grades accurately.
- Calculating the GPA, including an edge case where the GPA should return 0.0 if no courses were enrolled.

For the `Course` class, I tested:
- Setting grades for all assessments.
- Computing the weighted course grade correctly.

To make the tests more robust, I used JUnit 5’s parameterized testing feature with `@CsvSource`, allowing me to check the `getCourseGrade()` method with different scenarios, such as high, average, and low grades. Early on, some tests failed because my expected values for the weighted grades were slightly off (e.g., expecting 67.5 when the actual result was 66.0). After recalculating manually, I corrected the test expectations, and they passed.

I organized all the tests into a test suite using JUnit 5’s `@Suite` and `@SelectClasses` annotations. This let me run everything in one go, ensuring full coverage efficiently. To present my results professionally, I used the Maven Surefire Report Plugin. After updating my `pom.xml` file and running the commands in PowerShell, I generated an HTML report. It displayed a clear table showing all 8 tests passed, offering a polished summary of my testing efforts.

#### Conclusion  
This project resulted in a working grading system that met all the assignment’s requirements. The `Student` and `Course` classes were successfully implemented with the necessary attributes and methods. Through unit tests, a test suite, and parameterized testing, I confirmed that the system handled course enrollment, grade calculations, and GPA computation accurately, even in edge cases. Adjusting the test expectations after troubleshooting the weighted grade logic ensured precision in the results. The HTML test report, generated via Maven, provided a professional validation of my work and highlighted the value of automated testing tools. Overall, this experience enhanced my understanding of Java, JUnit 5, and the critical role of thorough testing in building reliable software.
