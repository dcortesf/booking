package com.serenity.booking.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.Repository;

import com.serenity.booking.model.Course;

public interface CourseRepository extends Repository<Course, Integer> {
	
	
	List<Course> findAllByOrderByDdateAscIdCourseTypeAsc();
	//List<Course> findAllByActiveOrderByDdateAsc(Integer active);
	List<Course> findAllByActiveAndDdateGreaterThanOrderByDdateAsc(Integer active, Date ddate);

}
