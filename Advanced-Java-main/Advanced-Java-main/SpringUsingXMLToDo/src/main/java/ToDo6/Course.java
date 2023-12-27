package ToDo6;


public class Course implements CourseInterface{
	private int courseID;
	private String courseTitle;
	private int courseDuration;
	private String courseProvider;
	private int courseFees;



	public Course() {
		
		// TODO Auto-generated constructor stub
	}



	public Course(int courseID, String courseTitle, int courseDuration, String courseProvider, int courseFees) {
		super();
		this.courseID = courseID;
		this.courseTitle = courseTitle;
		this.courseDuration = courseDuration;
		this.courseProvider = courseProvider;
		this.courseFees = courseFees;
	}


	public Course(int courseID, int courseDuration, String courseTitle, String courseProvider, int courseFees) {
		super();
		this.courseID = courseID;
		this.courseDuration = courseDuration;
		this.courseTitle = courseTitle;
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
	public String CourseInfo() {
		String message = "Your Course ID is " + courseID + ",  CourseTitle = "+courseTitle+",  Course Duration is  "+courseDuration+"hrs,"+"Provided By "+courseProvider+", And Fees of COURSE  is "+courseFees;          
		return message;
	}

}
