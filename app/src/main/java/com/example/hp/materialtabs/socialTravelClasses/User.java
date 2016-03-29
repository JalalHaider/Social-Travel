package com.example.hp.materialtabs.socialTravelClasses;

import java.util.ArrayList;
import java.util.List;


public class User{
	private userLists lists;
	private String name;
	private long phoneNo;
	private String email;
	private String password;
	private String description;
	private String gender;
	public User() {
		lists=new userLists();
		// TODO Auto-generated constructor stub
	}
	public User(String Email,String pass) {
		lists=new userLists();
		this.email=Email;
		this.password=pass;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public userLists getLists() {
		return lists;
	}

	public void setLists(userLists lists) {
		this.lists = lists;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name :"+this.name+" Password :"+this.password; 
	}

	public String getEmail() {
		return email;
	}

	protected class userLists

	{
		private List<CarPool> carpoolList;
		private List<Lift> LiftList;
		private List<Address> addressList;
		private List<FeedBack> feedbackList;
		//Lists all Methods Go here
		public userLists() {
			carpoolList=new ArrayList<CarPool>();
			LiftList=new ArrayList<Lift>();
		}
		public List<CarPool> getCarpoolList() {
			return carpoolList;
		}
		public void setCarpoolList(List<CarPool> carpoolList) {
			this.carpoolList = carpoolList;
		}
		public List<Lift> getLiftList() {
			return LiftList;
		}
		public void setLiftList(List<Lift> liftList) {
			LiftList = liftList;
		}

	}

}
