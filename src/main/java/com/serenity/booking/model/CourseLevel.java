package com.serenity.booking.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="course_level")
public class CourseLevel {
	
	@Id
	@Column(name="idCourseLevel")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idCourseLevel;
	
	private String name;
		
	public int getIdCourseLevel() {
		return idCourseLevel;
	}
	public void setIdCourseLevel(int idLevel) {
		this.idCourseLevel = idLevel;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
