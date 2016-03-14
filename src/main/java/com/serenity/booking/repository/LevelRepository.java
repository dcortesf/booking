package com.serenity.booking.repository;


import java.util.List;
import org.springframework.data.repository.Repository;

import com.serenity.booking.model.CourseLevel;

public interface LevelRepository extends Repository<CourseLevel, Integer> {
	
	List<CourseLevel> findAll();

}
