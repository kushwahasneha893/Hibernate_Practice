package example.hibernate.associations.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import example.hibernate.associations.entity.Employee;
import example.hibernate.associations.utils.HibernateUtils;
import org.hibernate.Transaction;


public class CreateEmployeeMain {

	public static void main(String[] args) {
		try(
				SessionFactory factory =
				HibernateUtils.getSessionFactory();
				Session sessionobj = factory.openSession()
				){
			Employee empObj = new Employee(null,"James",10000);
			Employee empObj2 = new Employee(null,"Adams",16000);
			Employee empObj3 = new Employee(null,"Clark",20000);
			Employee empObj4 = new Employee(null,"Jenny",25000);
			Employee empObj5 = new Employee(null,"Senta",30000);
			
			Transaction tx = sessionobj.beginTransaction();
			sessionobj.persist(empObj);
			sessionobj.persist(empObj2);
			sessionobj.persist(empObj3);
			sessionobj.persist(empObj4);
			sessionobj.persist(empObj5);
			tx.commit();
			System.out.println("Employees Created");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
