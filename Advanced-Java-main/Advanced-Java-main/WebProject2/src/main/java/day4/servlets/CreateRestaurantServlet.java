package day4.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Response;

import day4.beans.Restaurant;
import day4.dao.DaoInterface;
import day4.dao.RestaurantDao;

/**
 * Servlet implementation class CreateRestaurantServlet
 */
@WebServlet("/createRestaurant")
public class CreateRestaurantServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();		
		
		//Capturing Restaurant specific information:
		String rest_id = request.getParameter("restaurantId") ;
		String rest_name = request.getParameter("restaurantName") ;
		String rest_cuisine = request.getParameter("restaurantCuisine") ;
		String rest_branches = request.getParameter("restaurantBranchCount") ;

		//Converting the Strings into Integers as required
		int r_id = Integer.parseInt(rest_id);
		int r_brCount = Integer.parseInt(rest_branches);
		//System.out.println(rest_id + " " + rest_name + " " + rest_cuisine + " " + rest_branches);

		//Populating a Restaurant object based upon the information coming from client
		Restaurant rst = new Restaurant(r_id, rest_name ,rest_cuisine,r_brCount);
		
		//Populating RestaurantDao object to perform Record Insertion
		DaoInterface<Restaurant, Integer>daoRef = new RestaurantDao();
		daoRef.create(rst);
		out.println("<h>Restaurant created successfully..</h>");
		
	}

}
