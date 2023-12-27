package ToDo1;

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
	
	public static void main(String[] args) {
		//getallCourses();
		getOneCourses();
	}

}
