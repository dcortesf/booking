package com.serenity.booking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.serenity.booking.model.Booking;
import com.serenity.booking.repository.BookingRepository;

@Service
public class BookingService {
	
	@Autowired
	BookingRepository rBooking;
	
	public List<Booking> getBookingByIdCourse(Integer idCourse){
		
		return rBooking.findByIdCourseOrderByName(idCourse);
		
	}
	
	public void delete(Booking booking){
		rBooking.delete(booking);
	}
	
	public boolean save(Booking booking){
		
		List<Booking> list = rBooking.findByIdCourseOrderByName(booking.getIdCourse());
		if(list.size()<21) rBooking.save(booking);
		else return false;
		
		return true;
	}

}
