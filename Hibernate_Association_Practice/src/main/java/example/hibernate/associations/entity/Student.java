package example.hibernate.associations.entity;

import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity

@Table(name = "Student_Master")

public class Student {

	@Id

	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "student_id")

	private Integer studentId;

	@Column(name = "name")

	private String name;

	@ManyToMany (cascade =CascadeType.ALL)

	private List<Student> students;
	public Student(Integer studentId, String name, List<Student> students) {

		super();

		this.studentId = studentId;

		this.name = name;

		this.students = students;

	}
	
	@Override
	public String toString() {
	return "Student [studentId=" + studentId + ", name=" + name + ", students=" + students + "]";

	}

	public Integer getCertificationId() {

		return studentId;

	}

	public void setCertificationId(Integer certificationId) {

		this.studentId = certificationId;

	}

	public String getName() {

		return name;

	}
	public void setName(String name) {

		this.name = name;

	}

	public List<Student> getStudents() {

		return students;

	}
	public void setStudents(List<Student> students) {

		this.students = students;
	}
	public void addStudent(Student student) {
	students.add(student);
	}
	

}

