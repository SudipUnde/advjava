package ToDo5.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import ToDo5.entities.Course;
import ToDo5.utils.HibernateUtils;

public class HibernateAnnotationMain {

	public static void main(String[] args) {
		SessionFactory sessionfactory = HibernateUtils.getSessionFactory();
	   Session session = sessionfactory.openSession();
	   Course cr = new Course(104,"Php",26,"Unstop",5733);
	   Transaction tranx = session.beginTransaction();
	   			session.save(cr);
		tranx.commit();
		session.close();
		sessionfactory.close();
		System.out.println("Record added into database.");
		
	}

}
