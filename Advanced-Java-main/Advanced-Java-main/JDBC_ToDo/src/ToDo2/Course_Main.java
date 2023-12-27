package ToDo2;

import java.util.Collection;

public class Course_Main {

	private static void getallCourses() {
		DaoInterface<Course, Integer> daoRef = new CourseDao();
		Collection<Course> allCourses = daoRef.getAll();
		allCourses.stream().forEach((cor) -> System.out.println(cor));

				//for( Restaurant resta : allAailableRestaurants ) {
				 //	System.out.println(resta);
				//}
	}
	private static void getOneCourses() {
		DaoInterface<Course, Integer> daoRef = new CourseDao();
		Course curretCourse = daoRef.getOne(3);
		if(curretCourse!= null) {
			System.out.println(curretCourse);
		}else {
			System.out.println("Course with this ID does not exist");
		}
	}
	
	private static void createNewCourse() {
		DaoInterface<Course, Integer> daoRef = new CourseDao();
		Course currentCourse = new  Course(110, "AIML", 50, "ONLINE", 5660);
		daoRef.create(currentCourse);

		
	}
	
	public static void main(String[] args) {
		//getallCourses();
		//getOneCourses();
		createNewCourse();
	}

}
