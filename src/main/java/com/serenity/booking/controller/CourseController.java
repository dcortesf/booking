package com.serenity.booking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.serenity.booking.model.Course;
import com.serenity.booking.service.CourseService;

@RestController
public class CourseController {
	
	@Autowired
	CourseService courseServ;
	
	@CrossOrigin
	@RequestMapping(value="/courses", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Course> getCourses(){
		return courseServ.getCourses();
	}

}
