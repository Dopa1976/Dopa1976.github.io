package com.gcxy.domain;

import java.util.HashSet;
import java.util.Set;

/*
 * 课程类
 */
public class Course {
    private Integer id;//课程id
    private String courseName;//名称
    private String courseNumber;//编号
    private Set<Courseware> coursewares=new HashSet<Courseware>();//课件
    
    
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseNumber() {
		return courseNumber;
	}
	public void setCourseNumber(String courseNumber) {
		this.courseNumber = courseNumber;
	}
	public Set<Courseware> getCoursewares() {
		return coursewares;
	}
	public void setCoursewares(Set<Courseware> coursewares) {
		this.coursewares = coursewares;
	}
    
    
}
