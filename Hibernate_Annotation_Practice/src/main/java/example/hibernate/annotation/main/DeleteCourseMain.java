package example.hibernate.annotation.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.annotations.entity.Course;
import example.hibernate.annotations.utils.HibernateUtils;

public class DeleteCourseMain {

    public static void main(String[] args) {

        try (
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
            SessionFactory factory = HibernateUtils.getSessionFactory();
            Session sessionObj = factory.openSession()
        ) {

            Course foundCourse = sessionObj.find(Course.class, 3);

            if (foundCourse != null) {
                Transaction tx = sessionObj.beginTransaction();
                sessionObj.remove(foundCourse);
                tx.commit();
                System.out.println("Course Deleted Successfully");
            } else {
                System.out.println("Course with given ID does not exist");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
