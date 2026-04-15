package example.hibernate.associations.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.associations.entity.Department;
import example.hibernate.associations.utils.HibernateUtils;

public class CreateDepartmentMain {

	public static void main(String[] args) {
		try(
				SessionFactory factory =
				HibernateUtils.getSessionFactory();
				Session sessionobj = factory.openSession()
				) {
			Department deptObj = new Department(null,"IT",null);
			Department deptObj2 = new Department(null,"HR",null);
			Transaction tx = sessionobj.beginTransaction();
			sessionobj.persist(deptObj);
			sessionobj.persist(deptObj2);
			tx.commit();
			System.out.println("Department Created");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
