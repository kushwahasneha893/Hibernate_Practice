package example.hibernate.associations.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name = "Department_Master")
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "dept_no")
	private Integer deptno;
	@Column(name = "dept_name")
	private String name;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "dept_no")//Indicates foreign key column from Employee_Master referring to Primary key of Department_Master
	private List<Employee> employees;
	
	public Department() {}

	public Department(Integer deptno, String name, List<Employee> employees) {
		super();
		this.deptno = deptno;
		this.name = name;
		this.employees = employees;
	}
	public void addEmployee(Employee emp) {
		//this is an utility method meant for adding one employee at a time
		employees.add(emp);
	}

	@Override
	public String toString() {
		return "Department [deptno=" + deptno + ", name=" + name + ", employees=" + employees + "]";
	}

	public Integer getDeptno() {
		return deptno;
	}

	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	

}
