package com.serenity.booking.repository;

import java.util.List;

import org.springframework.data.repository.Repository;
import com.serenity.booking.model.CourseType;

public interface TypeRepository extends Repository<CourseType, Integer> {
	
	List<CourseType> findAll();
	CourseType save(CourseType courseType);
	void delete (CourseType courseType);
	
	

}
