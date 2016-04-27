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
import com.serenity.booking.model.Course;
import com.serenity.booking.model.CourseType;
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
	
	@CrossOrigin
	@RequestMapping(value="/activecourses", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Course> getActiveCourses(){
		return courseServ.getActiveCourses();
	}
	
	
	@CrossOrigin
	@RequestMapping(value="/courses/{id}",method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Course getCourseById(@PathVariable Integer id){
		System.out.println("id: "+id);
		return courseServ.findOne(id);
	}	
	
	@CrossOrigin
	@RequestMapping(value="/course/new", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public void save(@RequestBody Course course){
		System.out.println("plazas:" +course.getPlaces());
		System.out.println("fecha:"+course.getDdate());
		System.out.println("nivel: "+course.getCourseLevel().getIdCourseLevel());
		System.out.println("tipoCurso: "+course.getCourseType().getIdCourseType());
		
		courseServ.save(course);

	}
	
	@CrossOrigin
	@RequestMapping(value="/course/delete",method=RequestMethod.DELETE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public void deleteCourseType(@RequestBody Course course){
		System.out.println(course.getIdCourse());
		System.out.println(course.getPlaces());
		courseServ.deleteCourse(course);
	}

	

}
