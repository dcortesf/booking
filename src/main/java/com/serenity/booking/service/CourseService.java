package com.serenity.booking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.serenity.booking.model.Course;
import com.serenity.booking.repository.CourseRepository;

@Service
public class CourseService {
	
	@Autowired
	CourseRepository courseR;
	
	public List<Course> getCourses(){
		return courseR.findAllByOrderByDdateAsc();
	}
	
	

}
