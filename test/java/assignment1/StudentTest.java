package assignment1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;

public class StudentTest {

    @Test
    void testAddCourse() {
        Student student = new Student("S001", "Alice");
        Course course = new Course("CS101", "Intro to CS");
        student.addCourse(course);
        assertEquals(1, student.getCourseGrades().size());
    }

    @Test
    void testGetCourseGrades() {
        Student student = new Student("S001", "Alice");
        Course course1 = new Course("CS101", "Intro to CS");
        course1.setGrades(80, 90, 85, 75, 95); // Grade: 82.0
        Course course2 = new Course("MA102", "Calculus");
        course2.setGrades(70, 75, 65, 60, 80); // Grade: 66.0
        student.addCourse(course1);
        student.addCourse(course2);
        List<Double> grades = student.getCourseGrades();
        assertEquals(2, grades.size());
        assertEquals(82.0, grades.get(0), 0.01);
        assertEquals(66.0, grades.get(1), 0.01); // Fixed from 67.5 to 66.0
    }

    @Test
    void testGetGPA() {
        Student student = new Student("S001", "Alice");
        Course course1 = new Course("CS101", "Intro to CS");
        course1.setGrades(70, 75, 65, 60, 80); // Grade: 66.0
        Course course2 = new Course("MA102", "Calculus");
        course2.setGrades(80, 90, 85, 75, 95); // Grade: 82.0
        student.addCourse(course1);
        student.addCourse(course2);
        assertEquals(74.0, student.getGPA(), 0.01); // Fixed from 74.75 to 74.0
    }

    @Test
    void testGetGPAWithNoCourses() {
        Student student = new Student("S002", "Bob");
        assertEquals(0.0, student.getGPA(), 0.01);
    }
}