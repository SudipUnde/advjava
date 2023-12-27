package day7.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import day7.beans.RestaurantNameAndBranches;
import day7.entities.Restaurant;
import day7.utils.HibernateUtils;

public class HQLMain {
	private  static void constructorExpressionExample() {
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.openSession();
		String hqlQuery = "select new day7.beans.RestaurantNameAndBranches(rs.name, rs.branchCount) from Restaurant rs";
		Query<RestaurantNameAndBranches> hibernateQuery = 	session.createQuery(hqlQuery);
		List<RestaurantNameAndBranches> restaurantList = hibernateQuery.list();
		for(RestaurantNameAndBranches data : restaurantList)
			System.out.println(data);
		session.close();
		factory.close();
	}
	private static void selectClauseExample() {
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.openSession();
		//Builing HQL query for loading name and branchCount
		String hqlQuery = "select rs.name, rs.branchCount from Restaurant rs";
		Query<Object[]> hibernateQuery =session.createQuery(hqlQuery);
		List<Object[]> restaurantDataList = hibernateQuery.list();
		for(Object[] restaurantData : restaurantDataList) {
			Object restName = restaurantData[0];
			Object restBrCount = restaurantData[1];
			System.out.println(restName + " has " + restBrCount + " branches");			
		}
		session.close();
		factory.close();
	}
	private static void fromClauseExample() {
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.openSession();
		
		//Builing HQL query
		String hqlQuery = "from Restaurant rs";
		//Obtaining a reference of type 'Query'
		Query<Restaurant> hibernateQuery  = 	session.createQuery(hqlQuery);
		//Obtaining a List of Restaurant objects
		List<Restaurant> restaurantList = 	hibernateQuery.list();
		/*
		 * for(Restaurant rst : restaurantList) System.out.println(rst);
		 */
		restaurantList.stream().forEach((rst) -> System.out.println(rst));
		session.close();
		factory.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//fromClauseExample();
		//selectClauseExample();
		constructorExpressionExample();

	}

}
