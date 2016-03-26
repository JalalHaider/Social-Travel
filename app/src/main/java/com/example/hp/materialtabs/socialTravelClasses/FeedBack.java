package com.example.hp.materialtabs.socialTravelClasses;

import java.util.Date;

public class FeedBack {

	private User toUser;  // User gives feedback to other user
	private Date createdDate;
	private long Time;
	
public FeedBack() {
	// TODO Auto-generated constructor stub
	createdDate=new Date();
	createdDate.getTime(); //this will get current time can calculate elapsed time
}
}
