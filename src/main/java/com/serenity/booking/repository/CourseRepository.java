package com.serenity.booking.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.Repository;

import com.serenity.booking.model.Course;

public interface CourseRepository extends Repository<Course, Integer> {
	
	
	//List<Course> findAllByOrderByDdateAscIdCourseTypeAsc();
	List<Course> findAllByOrderByDdateAsc();
	List<Course> findAllByActiveAndDdateGreaterThanOrderByDdateAsc(Integer active, Date ddate);
	void save(Course course);
	Course findOne(Integer id);
	void delete(Course course);
}
