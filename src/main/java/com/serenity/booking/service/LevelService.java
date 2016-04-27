package com.serenity.booking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.serenity.booking.model.CourseLevel;
import com.serenity.booking.repository.LevelRepository;

@Service
public class LevelService {
	
	@Autowired
	LevelRepository lType;
	
	public List<CourseLevel> getCourseTypes(){
		return lType.findAll();
	}
	
		
	

}
