package day10.model;
public class UserValidator {
	public static boolean isValid(User currentUser) {
		//The code for validation goes here
		boolean success = false;
		String currentUserId = currentUser.getUserId();
		String currentPassword = currentUser.getPassword();
		if(currentUserId.equals("admin") && currentPassword.equals("12345"))
			success = true;
		return success;
	}
}
