package com.serenity.booking.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
	
	@Id
	private int idCourse;
	private int places;
	private Date ddate;
	private int idCourseType;
	private int idCourseLevel;
	private int active;
	
	public int getIdCourse() {
		return idCourse;
	}
	public void setIdCourse(int idCourse) {
		this.idCourse = idCourse;
	}
	public int getPlaces() {
		return places;
	}
	public void setPlaces(int places) {
		this.places = places;
	}
	public Date getDdate() {
		return ddate;
	}
	public void setDdate(Date ddate) {
		this.ddate = ddate;
	}
	public int getIdCourseType() {
		return idCourseType;
	}
	public void setIdCourseType(int idCourseType) {
		this.idCourseType = idCourseType;
	}
	public int getIdCourseLevel() {
		return idCourseLevel;
	}
	public void setIdCourseLevel(int idCourseLevel) {
		this.idCourseLevel = idCourseLevel;
	}
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
	
	

}
