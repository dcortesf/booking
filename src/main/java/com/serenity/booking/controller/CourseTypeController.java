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
import com.serenity.booking.model.CourseType;
import com.serenity.booking.service.TypeService;

@RestController
public class CourseTypeController {
	
	@Autowired
	TypeService typeServ;
	
	@RequestMapping("/")
	String test(){
		return "Test ok";
	}
	
	
	
	
	@CrossOrigin
	@RequestMapping(value="/types",method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<CourseType> getCourseTypes(){
		
		List<CourseType> typeList = typeServ.getCourseTypes();
		
		return typeList;
		
	}

}
