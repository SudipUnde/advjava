package ToDo1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

public class CourseDao implements DaoInterface<Course, Integer> {

	public CourseDao() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Collection<Course> getAll() {
		String sqlQuery = "select course_id,course_title,course_duration,course_provider,course_fees  from course_master";
		Collection<Course> allCourses = new ArrayList<>();
		try(
				Connection conn = JdbcUtils.buildConnection();
				Statement stmt  = conn.createStatement();
				ResultSet rs =stmt.executeQuery(sqlQuery);
				){
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int duration = rs.getInt(3);
				String provider = rs.getString(4);
				int fees= rs.getInt(5);
				
				Course currentCourse = new Course(id, name, duration, provider, fees);
				allCourses.add(currentCourse);
				
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		// TODO Auto-generated method stub
		return allCourses;
	}

	@Override
	public Course getOne(Integer id) {
		// TODO Auto-generated method stub
		Course foundCourse = null;		
		try(
				Connection conn =JdbcUtils.buildConnection();
				){
			String sqlQuery = "select course_id,course_title,course_duration,course_provider,course_fees  from course_master where course_id = ?";
		PreparedStatement pstmt =	conn.prepareStatement(sqlQuery);
		pstmt.setInt(1, id);
		ResultSet rs  =pstmt.executeQuery();
		if(rs.next()) {
			int c_id = rs.getInt(1);
			String name = rs.getString(2);
			int duration = rs.getInt(3);
			String provider = rs.getString(4);
			int fees= rs.getInt(5);
			
			foundCourse = new Course(c_id, name, duration, provider, fees);
			
		}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return foundCourse;
		
	}

	@Override
	public void create(Course t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteOne(Integer key) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Course t) {
		// TODO Auto-generated method stub
		
	}

}
