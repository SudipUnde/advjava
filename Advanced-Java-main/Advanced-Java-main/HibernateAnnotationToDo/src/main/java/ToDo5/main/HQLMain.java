package ToDo5.main;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import ToDo5.beans.CourseTitleAndFees;
import ToDo5.entities.Course;
import ToDo5.utils.HibernateUtils;


public class HQLMain {

	private static void fromClause() {
		
		SessionFactory sessFactory = HibernateUtils.getSessionFactory();
		Session session = sessFactory.openSession();
		
		
		//Builing HQL query
		String hqlQuery = "from Course cr";
		
		//Obtaining a reference of type 'Query'
		 Query<Course> hibernateQuery= session.createQuery(hqlQuery);
		   List<Course>restaurantList   =  hibernateQuery.list();
		   /*
			 * for(Restaurant rst : restaurantList) System.out.println(rst);
			 */
			restaurantList.stream().forEach((rst) -> System.out.println(rst));
			session.close();
			sessFactory.close();

	}
	
	private static void selectClause() {
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.openSession();
		//Builing HQL query for loading name and branchCount
		String hqlQuery = "select cr.courseTitle, cr.courseDuration from Course cr";
		Query<Object[]> hibernateQuery =session.createQuery(hqlQuery);
		List<Object[]> courseDataList = hibernateQuery.list();
		for(Object[] courseData : courseDataList) {
			Object courseTitle = courseData[0];
			Object courseDuration = courseData[1];
			System.out.println(courseTitle + " has " + courseDuration + " hr.");			
		}
		session.close();
		factory.close();
	}
	
	
	private  static void constructorExpression() {
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.openSession();
		String hqlQuery = "select new ToDo5.beans.CourseTitleAndFees(cr.courseTitle, cr.courseDuration) from Course cr";
		Query<CourseTitleAndFees> hibernateQuery = 	session.createQuery(hqlQuery);
		List<CourseTitleAndFees> courseList = hibernateQuery.list();
		for(CourseTitleAndFees data : courseList)
			System.out.println(data);
		session.close();
		factory.close();
	}
	
	
	
	
	
	
	public static void main(String[] args) {

		//fromClause();
		selectClause();
		//constructorExpression();
	}

}
