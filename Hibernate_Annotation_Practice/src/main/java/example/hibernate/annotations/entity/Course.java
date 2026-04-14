package example.hibernate.annotations.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//Course_Master (Table Name)
@Entity  //Marks this class as Entity
@Table(name = "Course_Details")
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "course_Id")
    private int courseId;
	@Column(name = "course_title")
    private String title;
	@Column(name = "course_duration")
    private int duration;
	@Column(name = "course_fees")
    private double fees;

    public Course() {}

    public Course(String title, int duration, double fees) {
        this.title = title;
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

    public void setTitle(String title) {
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
