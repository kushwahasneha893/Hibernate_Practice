package example.hibernate.entity;

public class Course {

    private int courseId;
    private String title;
    private int duration;
    private double fees;

    public Course() {}

    public Course(int courseId, String title, int duration, double fees) {
        this.courseId = courseId;
        this.title =title;
        this.duration = duration;
        this.fees = fees;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String gettitle() {
        return title;
    }

    public void settitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }
}
