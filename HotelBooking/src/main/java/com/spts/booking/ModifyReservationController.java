package com.spts.booking;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.spts.signup.User;


@RestController
public class ModifyReservationController{
	@Autowired
	private ModifyReservationImpl modifyReservation;
	
	private final String notLoggedIn = "Must be logged in.";
	
	@DeleteMapping(value = "/deleteBooking")
	public String deleteBooking(@RequestBody Booking booking, HttpServletRequest request) {
		
		User user = (User) request.getSession().getAttribute("user");
        if (user == null) return notLoggedIn;
		
		String json="";
		int code = -2;
		   ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
		code = modifyReservation.deleteBooking(booking,user);
		switch(code) {
		   case 1111 : json = "Booking cancelled succesfully";
		   break;
		   case 2222 : json = "Something went wrong while cancelling your booking";
		   break;
		   case 3333 : json = "Permission denied to delete booking!";
		   break;
		   case 4444 : json = "No booking record exists with provided booking id, Please check";
		   break;
		   case 5555 : json = "One of the mandatory values is null, Please check";
		   break;
		   default: json = "Unknown error";
		   }
		try {
			json = ow.writeValueAsString(json);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		    return json;
	}
	
	@PutMapping(value = "/changeBooking")
	public String changeBooking(@RequestBody Booking newBooking, HttpServletRequest request) {
		User user = (User) request.getSession().getAttribute("user");
        if (user == null) return notLoggedIn;
		String json="";
		int code = -2;
		   ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
		 code  = modifyReservation.changeBooking(newBooking,user);
		 switch(code) {
		 
		 case 0: json = "Problem in modifying booking, try again";
		 break;
		 case 1111: json = "Stay duration more than 7 days, cant book";
		 break;
		 case 2222: json = "Booking email can't be null";
		 break;
		 case 3333: json = "One of the mandatory values in null";
		 break;
		 case 4444 : json = "No booking record exists with provided booking id, Please check";
	     break;
	     case 5555 : json = "Invalid user is, Please check";
	     break;
	     case 6666 : json = "Permission denied to delete booking!";
		 break;
		 case 1: json = "Booking modified successfully";
		 break;
		 default: json = "Unknown error";
		 }
		try {
			json = ow.writeValueAsString(json);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		    return json;
	}

}
