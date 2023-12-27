package day4.beans;
//This class object holds username and password information
public class User {
	private String userId;
	private String password;
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(String userId, String password) {
		this.userId = userId;
		this.password = password;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
