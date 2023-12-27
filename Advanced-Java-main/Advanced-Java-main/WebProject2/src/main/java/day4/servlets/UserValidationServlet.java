package day4.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.el.util.Validation;

import day4.beans.User;
import day4.beans.UserValidator;

/**
 * Servlet implementation class UserValidationServlet
 */
@WebServlet(name = "myUserValidationServlet", urlPatterns = { "/isValidation" })
public class UserValidationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out  = response.getWriter();
		 
		//Fething the request parameters
		String username = request.getParameter("uid");
		String password = request.getParameter("pwd");
		
		//Populating User object based upon username and password
		User appUser = new User(username,password);
		boolean valid = UserValidator.isValid(appUser);
		
		if(valid)
			out.println("<h2 style='color:green'>Congratulations!!, You are IN</h2>");
		else
			out.println("<h2 style='color:red'>Sorry, Access denied due to invalid credentials</h2>");
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	

}
