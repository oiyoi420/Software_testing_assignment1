package assignment1;


public class Course {
    private String courseId;
    private String courseName;
    private double assignment1;
    private double assignment2;
    private double midtermExam;
    private double finalExam;
    private double finalProject;

    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public void setGrades(double assignment1, double assignment2, double midtermExam,
                          double finalExam, double finalProject) {
        this.assignment1 = assignment1;
        this.assignment2 = assignment2;
        this.midtermExam = midtermExam;
        this.finalExam = finalExam;
        this.finalProject = finalProject;
    }

    public double getCourseGrade() {
        double assignmentsAverage = (assignment1 + assignment2) / 2;
        return assignmentsAverage * 0.2 + midtermExam * 0.3 + finalExam * 0.4 + finalProject * 0.1;
    }
}
