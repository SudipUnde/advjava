package day6.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	//This is a utility class for obtaining SessionFactory.
	public static SessionFactory getSessionFactory() {
		Configuration hibernateConfig = new Configuration();
		hibernateConfig = hibernateConfig.configure();
		SessionFactory hibernateFactory = hibernateConfig.buildSessionFactory();
		return hibernateFactory;
	}
}
