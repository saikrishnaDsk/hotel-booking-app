package com.spts.booking;

public class Booking {
	private int bookingId;
	private int userId;
	private int hotelId;
	private int adultCount;
	private int childrenCount;
	private String checkinDate;
	private String checkoutDate;
	private int singleroomsBooked;
	private int doubleroomsBooked;
	private int suitesBooked;
	private String bookingEmail;
	
	public Booking() {
		
	}
	public Booking(int bookingId, int userId, int hotelId, int adultCount, int childrenCount, String checkinDate,
			String checkoutDate, int singleroomsBooked, int doubleroomsBooked, int suitesBooked, String bookingEmail,
			double finalPrice, String bookingStatus) {
		super();
		this.bookingId = bookingId;
		this.userId = userId;
		this.hotelId = hotelId;
		this.adultCount = adultCount;
		this.childrenCount = childrenCount;
		this.checkinDate = checkinDate;
		this.checkoutDate = checkoutDate;
		this.singleroomsBooked = singleroomsBooked;
		this.doubleroomsBooked = doubleroomsBooked;
		this.suitesBooked = suitesBooked;
		this.bookingEmail = bookingEmail;
		this.finalPrice = finalPrice;
		this.bookingStatus = bookingStatus;
	}
	private double finalPrice;
	private String bookingStatus;
	
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getHotelId() {
		return hotelId;
	}
	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}
	public int getAdultCount() {
		return adultCount;
	}
	public void setAdultCount(int adultCount) {
		this.adultCount = adultCount;
	}
	public int getChildrenCount() {
		return childrenCount;
	}
	public void setChildrenCount(int childrenCount) {
		this.childrenCount = childrenCount;
	}
	public String getCheckinDate() {
		return checkinDate;
	}
	public void setCheckinDate(String checkinDate) {
		this.checkinDate = checkinDate;
	}
	public String getCheckoutDate() {
		return checkoutDate;
	}
	public void setCheckoutDate(String checkoutDate) {
		this.checkoutDate = checkoutDate;
	}
	public int getSingleroomsBooked() {
		return singleroomsBooked;
	}
	public void setSingleroomsBooked(int singleroomsBooked) {
		this.singleroomsBooked = singleroomsBooked;
	}
	public int getDoubleroomsBooked() {
		return doubleroomsBooked;
	}
	public void setDoubleroomsBooked(int doubleroomsBooked) {
		this.doubleroomsBooked = doubleroomsBooked;
	}
	public int getSuitesBooked() {
		return suitesBooked;
	}
	public void setSuitesBooked(int suitesBooked) {
		this.suitesBooked = suitesBooked;
	}
	public String getBookingEmail() {
		return bookingEmail;
	}
	public void setBookingEmail(String bookingEmail) {
		this.bookingEmail = bookingEmail;
	}
	public double getFinalPrice() {
		return finalPrice;
	}
	public void setFinalPrice(double finalPrice) {
		this.finalPrice = finalPrice;
	}
	public String getBookingStatus() {
		return bookingStatus;
	}
	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}
	
	

}
