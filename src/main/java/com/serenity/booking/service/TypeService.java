package com.serenity.booking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.serenity.booking.model.CourseType;
import com.serenity.booking.repository.TypeRepository;

@Service
public class TypeService {
	
	@Autowired
	TypeRepository rType;
	
	public List<CourseType> getCourseTypes(){
		return rType.findAll();
	}
	
	public CourseType save(CourseType courseType){
		return rType.save(courseType);
	}
	
	public void delete(CourseType courseType){
		rType.delete(courseType);
	}
	
	

}
