/**************************/ 
 /* 	Author: 
 /* 	Syed Jalal Haider
 /*		License: ksi ne nahi dia :'(
  * Note : Data Structure Should be selected properly !!!!!!
  *
 */
/**************************/
package com.example.hp.materialtabs.socialTravelClasses;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static Manager manager=Manager.getManager();
	public static void main(String args[]){
		
		
		
		System.out.println("Social Travel !!!! ");
		System.out.println("1. Offer ");
		System.out.println("2. Find ");
		System.out.println("3. show users & their Carpools details ");
		System.out.println("0.  Exit");
		Scanner scan=new Scanner(System.in);
		int choice=scan.nextInt();
		while(choice!=0){
			if(choice==1){
				CarPool carpool=new CarPool();
				carpool.setNoOFSeats((byte)2);
				carpool.setCostperSeat(2.1f);
				if(manager.addCarpool(carpool)){
					System.out.println("Carpool is created");
				}
				else
					System.out.println("Sorry ! Something Went Wrong ");
				
			}
			else if(choice==2){
				System.out.println("option disable");
			/*	In Progress
			 * Lift lift=new Lift();
				lift.setNoOfSeatsBooked((byte)1);
				lift.setBookingDate(new Date().getDate());
				if(manager.addLift(lift)){
					System.out.println("Lift request send");
				}
				else{
					System.out.println("Sorry ! something Went wrong");
				}*/
			}
			else if(choice==3){
			List<User> list=	manager.getUserslist();
				for(User user:list){
					System.out.println(user);
					List<CarPool> carpools= user.getLists().getCarpoolList();
					for(CarPool carpool:carpools)
						System.out.println(carpool);
				}
			}
			
			else
				break;
		choice=scan.nextInt();
		}
	}
	
	public void sampleData(){
		
	}

}
