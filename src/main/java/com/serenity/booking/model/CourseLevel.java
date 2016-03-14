package com.serenity.booking.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="course_level")
public class CourseLevel {
	
	@Id
	@Column(name="idLevel")
	private int idCourseLevel;
	
	private String name;
		
	public int getIdLevel() {
		return idCourseLevel;
	}
	public void setIdLevel(int idLevel) {
		this.idCourseLevel = idLevel;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
