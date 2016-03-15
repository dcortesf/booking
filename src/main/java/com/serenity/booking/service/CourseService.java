package com.serenity.booking.service;

import java.util.List;
import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.serenity.booking.model.Course;
import com.serenity.booking.repository.CourseRepository;


@Service
public class CourseService {
	
	@Autowired
	CourseRepository courseR;
	
	public List<Course> getCourses(){
		return courseR.findAllByOrderByDdateAscIdCourseTypeAsc();
	}
	
	
	
	public List<Course> getActiveCourses(){		
		Date d = new Date(new java.util.Date().getTime());
		return courseR.findAllByActiveAndDdateGreaterThanOrderByDdateAsc(1, d);
	}
	
	

}
