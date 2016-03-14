package com.serenity.booking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.serenity.booking.model.Booking;
import com.serenity.booking.service.BookingService;

@RestController
public class BookingController {
	
	@Autowired
	BookingService bookingSrv;
	
	
	@RequestMapping(value="/bookingbycourse/{id}",method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Booking> getBookings(@PathVariable Integer id){
		System.out.println(id);
		return bookingSrv.getBookingByIdCourse(id);
	}
		
		
	

}
