package com.serenity.booking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.serenity.booking.model.Booking;
import com.serenity.booking.model.CourseType;
import com.serenity.booking.service.BookingService;

@RestController
public class BookingController {
	
	@Autowired
	BookingService bookingSrv;
	
	@CrossOrigin
	@RequestMapping(value="/bookingbycourse/{id}",method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Booking> getBookings(@PathVariable Integer id){
		return bookingSrv.getBookingByIdCourse(id);
	}
	
	
	@CrossOrigin
	@RequestMapping(value="/booking/delete",method=RequestMethod.DELETE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public void deleteCourseType(@RequestBody Booking booking){
		
		
		bookingSrv.delete(booking);
	}
	
	@CrossOrigin
	@RequestMapping(value="/booking/new", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String newBooking(@RequestBody Booking booking){	
		if(bookingSrv.save(booking)){
			return "Tu suscripción se ha realizado con éxito";
		}else return "Lo sentimos, el curso que solicitas tiene todas las plazas cubiertas. Estamos preparando más convocatorias.";
		
	}
		
		
	

}
