package example.hibernate.associations.main;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.associations.entity.Student;
import example.hibernate.associations.utils.HibernateUtils;


public class CreateStudentMain {

	public static void main(String[] args) {
		try(
				SessionFactory factory = HibernateUtils.getSessionFactory();
				Session sessionobj = factory.openSession()
				)
		{
			Student studentObj  = new Student(null,"Amit",null);
			Student studentObj2  = new Student(null,"Sam",null);
			Student studentObj3 = new Student(null,"Alice",null);
			
			Transaction tx = (Transaction) sessionobj;
			sessionobj.persist(studentObj);
			sessionobj.persist(studentObj2);
			sessionobj.persist(studentObj3);
			tx.commit();
			System.out.println("Students list Created");
				
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}


