package assignment1;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String studentId;
    private String name;
    private List<Course> courses = new ArrayList<>();

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public List<Double> getCourseGrades() {
        List<Double> grades = new ArrayList<>();
        for (Course course : courses) {
            grades.add(course.getCourseGrade());
        }
        return grades;
    }

    public double getGPA() {
        if (courses.isEmpty()) {
            return 0.0;
        }
        double sum = 0;
        for (Course course : courses) {
            sum += course.getCourseGrade();
        }
        return sum / courses.size();
    }
}
