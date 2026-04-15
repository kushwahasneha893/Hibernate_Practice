package example.hibernate.associations.main;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import example.hibernate.associations.entity.Department;
import example.hibernate.associations.entity.Employee;
import example.hibernate.associations.utils.HibernateUtils;

public class LinkEmployeeToDepartment {

	public static void main(String[] args) {
		try(
				SessionFactory factory =
				HibernateUtils.getSessionFactory();
				Session sessionobj = factory.openSession()
				)
		{
			Employee emp = sessionobj.find(Employee.class,1);
			Employee emp2 = sessionobj.find(Employee.class,2);
			Employee emp3 = sessionobj.find(Employee.class,3);
			Employee emp4 = sessionobj.find(Employee.class,4);
			Employee emp5 = sessionobj.find(Employee.class,5);
			
			Department dept = sessionobj.find(Department.class,1);
			Department dept2 = sessionobj.find(Department.class,2);
			
			//fetch employee
			Transaction tx = sessionobj.beginTransaction();
			//Creating a list of Employees
			List<Employee> itEmployees = new ArrayList<>();
			itEmployees.add(emp);
			itEmployees.add(emp2);
			itEmployees.add(emp4);
			//Adding These Employee to 1st dept
			dept.setEmployees(itEmployees);
			//Adding Employee 3 & 5 to 2nd Dept
			dept2.addEmployee(emp5);
			dept2.addEmployee(emp3);
			tx.commit();
			System.out.println("Employees are link to Department");
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
