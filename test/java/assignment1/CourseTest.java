package assignment1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CourseTest {

    @Test
    void testSetGradesAndGetCourseGrade() {
        Course course = new Course("CS101", "Intro to CS");
        course.setGrades(80, 90, 85, 75, 95);
        assertEquals(82.0, course.getCourseGrade(), 0.01);
    }
}