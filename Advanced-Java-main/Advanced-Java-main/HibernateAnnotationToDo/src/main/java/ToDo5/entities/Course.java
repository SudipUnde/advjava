package ToDo5.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //Marks this class as an Entity
@Table(name = "new_course_master")//Maps this Entity class with the relevant table
public class Course {
	@Id //Marks this field as an identity
	@Column(name = "course_Id")
	private int courseID;
	
	@Column(name = "course_title" ,length = 25)
	private String courseTitle;
	
	@Column(name = "course_duration")
	private int courseDuration;
	
	@Column(name = "course_provider" ,length = 25)
	private String courseProvider;
	
	@Column(name = "course_fees")
	private int courseFees;


	public Course() {
		System.out.println("Course no argument");
			}



	public Course(int courseID, String courseTitle, int courseDuration, String courseProvider, int courseFees) {
		super();
		this.courseID = courseID;
		this.courseTitle = courseTitle;
		this.courseDuration = courseDuration;
		this.courseProvider = courseProvider;
		this.courseFees = courseFees;
	}



	public int getCourseID() {
		return courseID;
	}



	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}



	public String getCourseTitle() {
		return courseTitle;
	}



	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}



	public int getCourseDuration() {
		return courseDuration;
	}



	public void setCourseDuration(int courseDuration) {
		this.courseDuration = courseDuration;
	}



	public String getCourseProvider() {
		return courseProvider;
	}



	public void setCourseProvider(String courseProvider) {
		this.courseProvider = courseProvider;
	}



	public int getCourseFees() {
		return courseFees;
	}



	public void setCourseFees(int courseFees) {
		this.courseFees = courseFees;
	}



	@Override
	public String toString() {
		return "Course [courseID=" + courseID + ", courseTitle=" + courseTitle + ", courseDuration=" + courseDuration
				+ ", courseProvider=" + courseProvider + ", courseFees=" + courseFees + "]";
	}

}
