package com.example.hp.materialtabs.socialTravelClasses;

import java.util.Date;
import java.util.List;

public class CarPool {
	private Date createdDate;
	private String to;
	private String from;
	private Date effectiveFrom;
	private Date effectiveTo;
	private byte noOFSeats;
	private float costperSeat;
	private boolean roundTrip;
	private byte waitTime;
	private String description;
	private float approximateReachTime;
	private boolean  smoking;
	private boolean food;
	
	
	private class Lists{
		private List<User> userGoingInCarpoolList;
	}


	public byte getNoOFSeats() {
		return noOFSeats;
	}


	public void setNoOFSeats(byte noOFSeats) {
		this.noOFSeats = noOFSeats;
	}


	public Date getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}


	public String getFrom() {
		return from;
	}


	public void setFrom(String from) {
		this.from = from;
	}


	public Date getEffectiveFrom() {
		return effectiveFrom;
	}


	public void setEffectiveFrom(Date effectiveFrom) {
		this.effectiveFrom = effectiveFrom;
	}


	public Date getEffectiveTo() {
		return effectiveTo;
	}


	public void setEffectiveTo(Date effectiveTo) {
		this.effectiveTo = effectiveTo;
	}


	public String getTo() {
		return to;
	}


	public void setTo(String to) {
		this.to = to;
	}


	public float getCostperSeat() {
		return costperSeat;
	}


	public void setCostperSeat(float costperSeat) {
		this.costperSeat = costperSeat;
	}


	public boolean isRoundTrip() {
		return roundTrip;
	}


	public void setRoundTrip(boolean roundTrip) {
		this.roundTrip = roundTrip;
	}


	public byte getWaitTime() {
		return waitTime;
	}


	public void setWaitTime(byte waitTime) {
		this.waitTime = waitTime;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public float getApproximateReachTime() {
		return approximateReachTime;
	}


	public void setApproximateReachTime(float approximateReachTime) {
		this.approximateReachTime = approximateReachTime;
	}


	public boolean isSmoking() {
		return smoking;
	}


	public void setSmoking(boolean smoking) {
		this.smoking = smoking;
	}


	public boolean isFood() {
		return food;
	}


	public void setFood(boolean food) {
		this.food = food;
	}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "No of seats :"+this.getNoOFSeats()+" Cost per seat: "+this.getCostperSeat();
		}
}
