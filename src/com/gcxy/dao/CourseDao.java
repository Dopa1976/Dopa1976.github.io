package com.gcxy.dao;

import java.util.List;

import com.gcxy.domain.Course;
import com.gcxy.domain.Score;

public interface CourseDao { 
   //根据编号查询
	public List<Course> query(String courseName);
   //查询
   public List<Course> query();
   //添加
   public void save(Course course);
   //修改
   public void update(Course course);
   //删除
   public void delete(int ids);
   
   public void save(Score score);
   
   public Course courseModify(Integer ids);

}
