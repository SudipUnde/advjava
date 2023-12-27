package day4.beans;
//This class is used to perform validation on the User object
public class UserValidator {
	public static boolean isValid(User currentUser) {
		//The code for validation goes here
		boolean success = false;
		String currentUserId = currentUser.getUserId();
		String currentPassword = currentUser.getPassword();
		
		if(currentUserId.equals("admin") && currentPassword.equals("shubham"))
			success = true;
		return success;
	}

}
