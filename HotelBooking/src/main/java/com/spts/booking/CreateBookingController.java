//package com.spts.booking;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.databind.ObjectWriter;
//
//
//@RestController
//public class CreateBookingController {
//	
//	@Autowired
//	CreateBookingImpl createBooking;
//	
//	@PostMapping(value = "/createBooking", consumes = "application/json", produces = "application/json")
//	public String createNewBooking(@RequestBody Booking newBooking){
//	   String json="";
//	   ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
//	   int result = createBooking.makeNewReservation(newBooking);
//	   switch(result) {
//	   case 0 : json = "Something went wrong while booking..Please try again";
//	   break;
//	   case 1 : json = "Booking successful. Your booking confirmation id is - "+createBooking.getCurrentBookingId();
//	   break;
//	   case 1111 : json = "Stay duration is more than 7 days, can't proceed with booking";
//	   break;
//	   case 2222 : json = "Booking email can't be null";
//	   break;
//	   case 3333 : json = "One of the mandatory values is null, please correct";
//	   break;
//	   case 4444 : json = "No user record exists with provided user id, Please check";
//	   break;
//	   case 5555 : json = "No rooms available on your selected dates, please try different dates";
//	   break;
//	   case 6666 : json = "Invalid hotel id";
//	   break;
//	   default: json = "Unknown error";
//	   }
//	   try {
//		json = ow.writeValueAsString(json);
//	} catch (JsonProcessingException e) {
//		e.printStackTrace();
//	}
//	    return json;
//	
//  }
//
//}
