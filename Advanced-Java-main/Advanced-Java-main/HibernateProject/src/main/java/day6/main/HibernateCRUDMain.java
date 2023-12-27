package day6.main;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import day6.beans.Restaurant;
import day6.utils.HibernateUtils;

public class HibernateCRUDMain {
	
	private static void createNewRestaurant() {
		//Building Configuration Object
		Configuration hibernateConfig = new Configuration();//Looks for hibernate.properties
		//Obtaining SessionFactory
		hibernateConfig = hibernateConfig.configure();//Looks for hibernate.cfg.xml
		SessionFactory hibernateFactory = hibernateConfig.buildSessionFactory();
		//Obtaining Session
		Session hibernateSession = hibernateFactory.openSession();
		//Creating Entity Class Object
		Restaurant rst = new Restaurant(103, "Hotel Mishrajii", "nimbu pani", 2);
		//Obtaining and Starting 'Transaction' using 'Session'
		Transaction hibernateTransaction = hibernateSession.beginTransaction();
		//Attaching the Entity Class Object to the "Session'
			hibernateSession.save(rst);
		//Committing the 'Transaction'
		hibernateTransaction.commit();
		//Closing the Session
		hibernateSession.close();
		//Closing the SessionFactory
		hibernateFactory.close();
		System.out.println("Restaurant created successfully.");
	}

	
	private static void showOneRestaurant() {
		SessionFactory sessFactory = HibernateUtils.getSessionFactory();
		Session session =  sessFactory.openSession();
			
			//Specifying the entity specific Class type using a reference of type 'Class' class
		Class<Restaurant> entityClassType = Restaurant.class;
		
		//Specifying the identity in the form of java.io.Serializable
		Serializable entityId = 101;//Serializable entityId  = new Integer(101);
		
		Restaurant foundRestaurant = session.load(entityClassType, entityId);
		System.out.println(foundRestaurant);
		session.close();
		sessFactory.close();
		System.out.println("Restaurant found successfully.");

	}
	
	 private static void updateRestaurant() {
		 SessionFactory sessFactory = HibernateUtils.getSessionFactory();
		 Session session = sessFactory.openSession();
	
	
		 Class<Restaurant>entityClassType = Restaurant.class;
		 Serializable entityId = 101;
		 Restaurant foundRestaurant = session.load(entityClassType, entityId);
		 
		 
		   Transaction tranx = session.beginTransaction();
		   				foundRestaurant.setName("Namo Nammo ");
		   				foundRestaurant.setCuisine("Puran poli");
		   	tranx.commit();
		   	session.close();
		   	sessFactory.close();
			System.out.println("Record updated");	 
	 }

	 private static void deleteRestaurant() {
			SessionFactory factory = HibernateUtils.getSessionFactory();
			Session session = factory.openSession();
			Class<Restaurant> entityClassType = Restaurant.class;
			Serializable entityId = 103;//Serializable entityId  = new Integer(101);
			Restaurant foundRestaurant = session.load(entityClassType, entityId);
			
			Transaction tx = session.beginTransaction();
				session.delete(foundRestaurant);
			tx.commit();
			session.close();
			factory.close();
			System.out.println("Record deleted");
		}
	 
	public static void main(String[] args) {
		//createNewRestaurant();
		//showOneRestaurant();
		//updateRestaurant();
		deleteRestaurant();
	}

}
