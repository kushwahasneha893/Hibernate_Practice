package example.hibernate.associations.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.associations.entity.Passport;
import example.hibernate.associations.entity.Person;
import example.hibernate.associations.utils.HibernateUtils;

public class LinkPassportToPerson {

	public static void main(String[] args) {
		try(
				SessionFactory factory =
				HibernateUtils.getSessionFactory();
				Session sessionobj = factory.openSession()
				)
		{
			//FETCH THE PASSPORTS
			String passportID  = "241ffdc4-e974-4ae2-896f-2001fc60ecfd";
			String passportID2 = "386df51f-6f1a-4780-be85-384b77589005";
			String passportID3 = "7feb5339-92b9-4780-bfae-cbddf1fd9ba6";

			
			Passport passportObj = sessionobj.find(Passport.class,passportID);
			Passport passportObj2 = sessionobj.find(Passport.class,passportID2);
			Passport passportObj3 = sessionobj.find(Passport.class,passportID3);
			

			Person personObj = sessionobj.find(Person.class,1);
			Person personObj2 = sessionobj.find(Person.class,2);
			Person personObj3 = sessionobj.find(Person.class,3);
			
			Transaction tx = sessionobj.beginTransaction();
			personObj.setPassportDetails(passportObj);
			personObj2.setPassportDetails(passportObj2);
			personObj3.setPassportDetails(passportObj3);
			tx.commit();
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		

	}

}
