package com.serenity.booking.repository;

import java.util.List;
import org.springframework.data.repository.Repository;

import com.serenity.booking.model.Booking;

public interface BookingRepository extends Repository<Booking, Integer> {
	
	List<Booking> findAll();
	List<Booking> findByIdCourse(Integer idCourse);

}
