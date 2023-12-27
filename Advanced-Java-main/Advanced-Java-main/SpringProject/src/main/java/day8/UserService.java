package day8;

import day7.GreetingService;

public class UserService implements GreetingService {

	public UserService() {
		System.out.println("UserService instantiated");
	}
	
	
	@Override
	public String sayGreeting() {
		// TODO Auto-generated method 
		return "user Service";
	}
	

}
