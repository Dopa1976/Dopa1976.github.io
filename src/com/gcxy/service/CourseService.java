package com.gcxy.service;

import java.util.List;

import com.gcxy.domain.Course;
import com.gcxy.domain.Score;

public interface CourseService {
	public List<Course> query(String courseName);
	 public List<Course> query();
	 public void save(Course course);
	 public void update(Course course);
	 public void delete(int ids);
	public Course courseModify(Integer ids);
	
}
