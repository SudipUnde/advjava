package day8;

import day7.GreetingService;

public class UserGreetingService implements GreetingService {
	private String userName;
	private String greetingMessage;
	private int userAge;
	

	public UserGreetingService() {
	}

	public UserGreetingService(String userName, String greetingMessage, int userAge) {
		System.out.println("UserGreetingService(String, String, int)");
		this.userName = userName;
		this.greetingMessage = greetingMessage;
		this.userAge = userAge;
	}

	public UserGreetingService(String greetingMessage, int userAge, String userName) {
		System.out.println("UserGreetingService(String, int, String)");
		this.greetingMessage = greetingMessage;
		this.userAge = userAge;
		this.userName = userName;
	}
	 

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getGreetingMessage() {
		return greetingMessage;
	}

	public void setGreetingMessage(String greetingMessage) {
		this.greetingMessage = greetingMessage;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	@Override
	public String sayGreeting() {
		String finalMessage = greetingMessage + " " + userName + ", your age is " + userAge;
		return finalMessage;
	}
	

}
