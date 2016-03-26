package com.example.hp.materialtabs.socialTravelClasses;

import java.util.Date;

public class Lift {
private byte noOfSeatsBooked;
private int bookingDate;
private Date unBookDate;
public byte getNoOfSeatsBooked() {
	return noOfSeatsBooked;
}
public void setNoOfSeatsBooked(byte noOfSeatsBooked) {
	this.noOfSeatsBooked = noOfSeatsBooked;
}
public int getBookingDate() {
	return bookingDate;
}
public void setBookingDate(int i) {
	this.bookingDate = i;
}
public Date getUnBookDate() {
	return unBookDate;
}
public void setUnBookDate(Date unBookDate) {
	this.unBookDate = unBookDate;
}

}
