
/*
TODO 3:
		Create a main menu page that shows 2 Hyperlinks:
			1. Create New Course
			2. View Course
		
		When the 1st link is clicked, it should display another HTML for new course creation.
		This page must accept information about the course and upon SUBMIT, it must add a new record into the
		relevant database table. Display appropriate message after insertion.
		(Use Drop down Combo for Provider)
		
		When the 2nd link is clicked, it should display another HTML for accepting Course ID.
		When SUBMIT is clicked, it must display the remaining details of that course.
		Display appropriate message if the entered ID is invalid.
*/

package ToDo3.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ToDo3.beans.Course;
import ToDo3.dao.CourseDao;
import ToDo3.dao.DaoInterface;

/**
 * Servlet implementation class CreateCourseServlet
 */
@WebServlet(name = "myCreateCourseServlet", urlPatterns = { "/createCourse" })
public class CreateCourseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		//Capturing Restaurant specific information:
		String course_id = request.getParameter("courseId");
		String course_title = request.getParameter("courseName");
		String course_duration = request.getParameter("courseDuration");
		String course_provider = request.getParameter("courseProvider");
		String course_fees = request.getParameter("courseFees");
		
		//Converting the Strings into Integers as required
				int cr_id = Integer.parseInt(course_id);
				int cr_duration = Integer.parseInt(course_duration);
				int cr_fees= Integer.parseInt(course_fees);
				
		//Populating a Restaurant object based upon the information coming from client
		Course currentCourse = new Course(cr_id,course_title,cr_duration,course_provider,cr_fees);
	
		//Populating RestaurantDao object to perform Record Insertion
		DaoInterface<Course, Integer>daoRef = new CourseDao();
		//Invoking 'create()' method to insert the record
		daoRef.create(currentCourse);
		out.println("<h2>Course Entry is created successfully....!</h2>");


		
		
	
	}

}
