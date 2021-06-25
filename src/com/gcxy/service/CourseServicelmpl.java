package com.gcxy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gcxy.dao.CourseDao;
import com.gcxy.domain.Course;
import com.gcxy.domain.Score;

@Service("courseService")
@Transactional
public class CourseServicelmpl implements CourseService {
	@Autowired
    private CourseDao courseDao;

	@Override
	public List<Course> query() {
		return courseDao.query();
}

	@Override
	public void save(Course course) {
	
		courseDao.save(course);
	}

	@Override
	public void delete(int ids) {
		
		courseDao.delete(ids);
	}

	@Override
	public List<Course> query(String courseName) {
		
		return courseDao.query(courseName);
	}

	@Override
	public Course courseModify(Integer ids) {
		
		return courseDao.courseModify(ids);
	}

	@Override
	public void update(Course course) {
		courseDao.update(course);
		
	}


    
}
