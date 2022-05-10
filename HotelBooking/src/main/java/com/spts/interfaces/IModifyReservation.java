package com.spts.interfaces;

import com.spts.booking.Booking;
import com.spts.signup.User;

public interface IModifyReservation {
	public int deleteBooking(Booking booking, User user);
	public int changeBooking(Booking newBooking, User user);

}
