package example.hibernate.annotation.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import example.hibernate.annotations.entity.Course;
import example.hibernate.annotations.utils.HibernateUtils;

public class RetrieveCourseMain {
	public static void main(String[] args) {
		try (
				SessionFactory factory = 
				HibernateUtils.getSessionFactory();
				 Session sessionObj = factory.openSession()		
				){
			//finding a single course against Id
			//Class<Course> courseType = Course.class;
			//Object ID = 1;//new Integer(1);=>Auto Boxing
			 Course foundCourse = 
			sessionObj.find(Course.class,3);
			if(foundCourse!= null) {
			System.out.println(foundCourse);
			 }
			 else {
				 System.out.println("Course With Given ID doesn't exist");
			 }
			 
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}

