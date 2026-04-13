package example.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import example.hibernate.entity.Course;

import org.hibernate.Transaction;


public class CreateCourseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session sessionObj = null;
		SessionFactory factoryObj = null; 
		
		try {
			Configuration conf = new Configuration();
			conf.configure();
			
			//	Obtaining Session-Factory
			factoryObj = conf.buildSessionFactory();
			
			//Obtaining Session
			sessionObj = factoryObj.openSession();
			
			//Obtaining Transaction
			Transaction tx = sessionObj.beginTransaction();
			
			//Creating an entity class object
			
			Course courseObj =
			new Course(102,"Mastering Dotnet", 90 , 10000);
			
			sessionObj.persist(courseObj);
			
			tx.commit();
			System.out.println("Course Created Succesfully");
		}
		catch(Exception ex) {
			ex.printStackTrace();
			
		}
		finally{
			sessionObj.close();
			factoryObj.close();
			
			
		}
		
		}

	}


