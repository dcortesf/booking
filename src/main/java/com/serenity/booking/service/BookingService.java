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
		
		return rBooking.findByIdCourse(idCourse);
		
	}

}
