package com.gcxy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gcxy.dao.CoursewareDao;
import com.gcxy.domain.Course;
import com.gcxy.domain.Courseware;

@Service("coursewareService")
@Transactional
public class CoursewareServicelmpl implements CoursewareService {
	@Autowired
	private CoursewareDao coursewareDao;

	@Override
	public List<Courseware> queryAll() {
		// TODO Auto-generated method stub
		return coursewareDao.queryAll();
	}

	@Override
	public void delete(int ids) {
		// TODO Auto-generated method stub
		coursewareDao.delete(ids);
	}


	@Override
	public Course courseName(String coursename) {
		// TODO Auto-generated method stub
		return coursewareDao.courseName(coursename);
	}

	@Override
	public List<Courseware> queryName(String cwName) {
		// TODO Auto-generated method stub
		return coursewareDao.queryName(cwName);
	}

	@Override
	public void saveCwInfo(Courseware courseware) {
		
		coursewareDao.saveCwInfo(courseware);
	}
}
