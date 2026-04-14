package example.hibernate.annotation.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.annotations.entity.Course;
import example.hibernate.annotations.utils.HibernateUtils;

public class CreateCourseMain {
	public static void main(String[] args) {
	try (
			SessionFactory factory = 
			HibernateUtils.getSessionFactory();
			 Session sessionObj = factory.openSession()		
			){
		 
		Course courseObj = new Course("OOP Concept", 80, 8000);
		Transaction tx = sessionObj.beginTransaction();
		sessionObj.persist(courseObj);
		tx.commit();
		System.out.println("Course Added Successfully");
		
	}
	catch(Exception ex) {
		ex.printStackTrace();
	}
	}
}