package ToDo4.main;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import ToDo4.beans.Course;

public class HibernateToDo_CRUDMain {
	
	private static void createNewCourse() {
		Configuration hibernateConfig = new Configuration();
		
		SessionFactory sessionFactory = hibernateConfig.configure().buildSessionFactory();
		
		 Session session = sessionFactory.openSession();
		 
		 Course cr = new Course(103, "C++", 84, "CourseERA",7584);
		 
		 Transaction tranx = session.beginTransaction();
		 
		 session.save(cr);
		 
		 tranx.commit();
		 
		 session.clear();
		 
		 sessionFactory.close();
		 
		 System.out.println("Entry of Course is Created successfully");
	}
	
	private static void showOneCourse() {
		
		Configuration hibernateConfig = new Configuration();
		
		SessionFactory sessionFactory = hibernateConfig.configure().buildSessionFactory();
		
		 Session session = sessionFactory.openSession();
		 
		 Class<Course>entityClassType = Course.class;
		 Serializable entityId = 101;
		 Course foundCourse  = session.load(entityClassType, entityId);
		  
		 System.out.println(foundCourse);
		    
		  session.close();
		  
		 sessionFactory.close();
		
		System.out.println("Course Found Successfully");
	}

	
	private static void updateCourse() {
		
		Configuration hibernateConfig = new Configuration();
		
		SessionFactory sessionFactory = hibernateConfig.configure().buildSessionFactory();
		
		 Session session = sessionFactory.openSession();
		 
		 Class<Course>entityClassType = Course.class;
		 Serializable entityId = 101;
		 Course foundCourse  = session.load(entityClassType, entityId);
		 
		  Transaction tranx =  session.beginTransaction();
		  				foundCourse.setCourseProvider("YouTube");
		  				foundCourse.setCourseTitle("PYTHON");
		 tranx.commit();
		 session.close();
		 sessionFactory.close();
		 System.out.println("Record Update Successfully");
		 
	}
	
	private static void deleteCourse() {
Configuration hibernateConfig = new Configuration();
		
		SessionFactory sessionFactory = hibernateConfig.configure().buildSessionFactory();
		
		 Session session = sessionFactory.openSession();
		 
		 Class<Course>entityClassType = Course.class;
		 Serializable entityId = 103;
		 Course foundCourse  = session.load(entityClassType, entityId);
		 
		Transaction tx = session.beginTransaction();
			session.delete(foundCourse);
		tx.commit();
		session.close();
		sessionFactory.close();
		System.out.println("Record deleted");
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		//createNewCourse();
		//showOneCourse();
		//updateCourse();
		deleteCourse();
	}

}
