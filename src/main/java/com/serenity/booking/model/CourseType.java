package com.serenity.booking.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="course_type")
public class CourseType {

	@Id
	@Column(name="idCourseType")
	private int idCourseType;

	private String name;

	public int getIdCourseType() {
		return idCourseType;
	}

	public void setIdCourseType(int idCourseType) {
		this.idCourseType = idCourseType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
