package com.example.hp.materialtabs.socialTravelClasses;

import java.util.ArrayList;
import java.util.List;

public class Manager {
	private List<User> userslist;
	//private User user;
	private static Manager manager=new Manager();


	private Manager() {
		//user=new User();
		userslist= new ArrayList<User>();


	}
	public boolean addUser(User obj){
		userslist.add(obj);
		return true;
	}
	public User verifyUser(){ // Authentication class object is created here *sort out this method* 
		//	Login.userLogin();	// call if user click Login
		User user=Login.userRegister();	//Call when user is going to register
		//for the sample all users will be unregistered
		/*
		 * Refactor this method
		 */
		return user;
	}
	public boolean addCarpool(CarPool obj){
			
		
		    User user=verifyUser();
			System.out.println("User is registerd");
			user.getLists().getCarpoolList().add(obj);
			
		return true;
	}
	public boolean addLift(Lift obj){
		 User user=verifyUser();
		 System.out.println("User is logged in");
		 user.getLists().getLiftList().add(obj);
		 return true;
	}
	public static Manager getManager(){
		return Manager.manager;
	}
	public List<User> getUserslist() {
		return userslist;
	}




}
