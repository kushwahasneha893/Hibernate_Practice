package example.hibernate.associations.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.associations.entity.Person;
import example.hibernate.associations.utils.HibernateUtils;

public class CreatePersonMain {

	public static void main(String[] args) {
		try(
			SessionFactory factory =
			HibernateUtils.getSessionFactory();
			Session sessionobj = factory.openSession()
			)
		{
			Person personObj = new Person(null,"Amit","amit@gmail.com",null);
			Person personObj2 = new Person(null,"Sumit","sumit@gmail.com",null);
			Person personObj3 = new Person(null,"RAM","ram@gmail.com",null);
			
			Transaction tx = sessionobj.beginTransaction();
			sessionobj.persist(personObj);
			sessionobj.persist(personObj2);
			sessionobj.persist(personObj3);
			tx.commit();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		

	}

}
