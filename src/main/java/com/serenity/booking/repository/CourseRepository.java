package com.serenity.booking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import com.serenity.booking.model.Course;

public interface CourseRepository extends Repository<Course, Integer> {
	
	
	List<Course> findAllByOrderByDdateAsc();

}
