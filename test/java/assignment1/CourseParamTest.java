package assignment1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CourseParamTest {

    @ParameterizedTest
    @CsvSource({
            "90, 95, 85, 80, 100, 86.0",  // High scores (fixed from 87.5)
            "70, 75, 65, 60, 80, 66.0",   // Average scores
            "50, 55, 45, 40, 60, 46.0"    // Lower scores (fixed from 47.5)
    })
    void testGetCourseGradeParameterized(double a1, double a2, double mid, double fin, double proj, double expected) {
        Course course = new Course("CS101", "Intro to CS");
        course.setGrades(a1, a2, mid, fin, proj);
        assertEquals(expected, course.getCourseGrade(), 0.01);
    }
}