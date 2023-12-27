package day7.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import day7.entities.Restaurant;
import day7.utils.HibernateUtils;

public class HibernateAnnotationMain {

	public static void main(String[] args) {
	
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.openSession();
		Restaurant rst = new Restaurant(150, "Coco Ichibaniya", "Japanese", 10);
		Transaction tx = session.beginTransaction();
			session.save(rst);
		tx.commit();
		session.close();
		factory.close();
		System.out.println("Record added.");
		
		
		

	}

}
