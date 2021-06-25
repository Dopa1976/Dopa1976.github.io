package com.gcxy.action;

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.gcxy.domain.Course;

import com.gcxy.service.CourseService;
import com.opensymphony.xwork2.ActionSupport;


@Controller("CourseAction")
@Scope("prototype")
public class CourseAction extends ActionSupport {
   private Course course;
   private String courseName;
   private Integer ids;
   @Autowired
   private CourseService courseService;
  
   public List<Course> courseList;

   
/**
 * 根据课程名查询课程信息
 * @return
 */
   public String CoursequeryName() {
	   String name = null;
	try {
		name = java.net.URLDecoder.decode(courseName, "UTF-8");
	} catch (UnsupportedEncodingException e) {
		
		e.printStackTrace();
	}
	   courseList = courseService.query(name);  
	
	   return SUCCESS;
   }
   
   /**
    * 查询课程信息
    * @return
    */
   public String courseQuery(){
	   ActionValidate session=new ActionValidate();
	   if(session.ValidateSession()) {
		   courseList=courseService.query();
			 return SUCCESS; 
		   
	   }else {
		   return "index";			 
	   }
   }
   
   /**
    * 添加课程信息
    * @return
    */
   public String Courseadd(){
	   courseService.save(course);
	return SUCCESS;   
   }
   
   /**
    * 修改课程信息
    * @return
    */
   public String courseModify() {
	   course = courseService.courseModify(ids);
	   return SUCCESS;
   }
   /**
    * 保存修改信息
    * @return
    */
   public String courseUpdate() {
	 
	   courseService.update(course);
	   return SUCCESS;
   }
   /**
    * 删除课程信息
    * @return
    */
   public String Coursedelete(){
	   courseService.delete(ids);
	   return SUCCESS;
   }
   
   

public String getCourseName() {
	return courseName;
}

public void setCourseName(String courseName) {
	this.courseName = courseName;
}

public Integer getIds() {
	return ids;
}
public void setIds(Integer ids) {
	this.ids = ids;
}
public List<Course> getCourseList() {
	return courseList;
}
public void setCourseList(List<Course> courseList) {
	this.courseList = courseList;
}
public Course getCourse() {
	return course;
}
public void setCourse(Course course) {
	this.course = course;
}


   
   
}
