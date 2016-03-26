package com.example.hp.materialtabs.socialTravelClasses;

public class Login {
	
	public static boolean userLogin(){
		//get User's Id and password and search from the list
		Main.manager.getUserslist();
		// if user find then return true
		return false;
	}
	public static User userRegister(){
		//Create a new User by getting all the information from user
				/* check mobile number before registering any user
				 * user with same mobile number will not be considered unregistered user
				 * send code to user's mobile 
				 * get confirm etc etc
				 * 
				 * 
				 * Given is a sample
				 */
		
		User user=new User();
		System.out.println("User Name : Jalal , Password: 123");
		user.setName("jalal");
		user.setPassword("123");
		Main.manager.addUser(user);
		return user;
	}
}
