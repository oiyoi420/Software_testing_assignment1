package assignment1;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({StudentTest.class, CourseTest.class, CourseParamTest.class})
public class AllTests {}

//mvn clean test surefire-report:report
