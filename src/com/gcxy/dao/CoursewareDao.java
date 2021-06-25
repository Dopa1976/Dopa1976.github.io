package com.gcxy.dao;

import java.util.List;

import com.gcxy.domain.Course;
import com.gcxy.domain.Courseware;

public interface CoursewareDao {
    //查询所有课件
   public List<Courseware> queryAll();
   //删除数据
   public void delete(int ids);

   //根据id查询课程名称
   public Course courseName(String coursename);
   //模糊查询
   public List<Courseware> queryName(String cwName);
   public void saveCwInfo(Courseware courseware);
}
