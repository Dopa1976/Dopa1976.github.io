package com.gcxy.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gcxy.domain.Batch;
import com.gcxy.domain.Course;
import com.gcxy.domain.Score;
@Repository
public class CourseDaolmpl implements CourseDao{
   @Autowired
   private SessionFactory sessionFactory;

/**
 * 查询所有课程
 */
@Override
public List<Course> query() {
	// TODO Auto-generated method stub
	Session session=sessionFactory.getCurrentSession();
	String hql = "from Course";
	Query query= session.createQuery(hql);
	List<Course> list=query.list();
	return list;
}

/**
 * 查询所有课程
 */
@Override
public void save(Course course) {
	// TODO Auto-generated method stub
	Session session=sessionFactory.getCurrentSession();
	session.save(course);
}

/**
 * 修改课程
 */
@Override
public void update(Course course) {
	// TODO Auto-generated method stub
	Session session=sessionFactory.getCurrentSession();
	 Course ou = (Course) session.get(Course.class, course.getId());
	 ou.setCourseName(course.getCourseName());
	 ou.setCourseNumber(course.getCourseNumber());
	 session.update(ou);
}

/**
 * 删除课程
 */
@Override
public void delete(int ids) {
	// TODO Auto-generated method stub
	Session session=sessionFactory.getCurrentSession();
	Course ou = (Course) session.get(Course.class, ids);
		session.delete(ou);
	
}


/**
 * 模糊查询课程
 */
@Override
public List<Course> query(String courseName) {
	// TODO Auto-generated method stub
	Session session=sessionFactory.getCurrentSession();
	String hql = "from Course where courseName like :courseName";	
	Query query= session.createQuery(hql);
	query.setString("courseName", "%" + courseName + "%");
	List<Course> list=query.list();
	if(list.size() == 0) {
		String hql2 = "from Course where courseNumber like :courseNumber";
		Query query2= session.createQuery(hql2);
		query2.setString("courseNumber", "%" + courseName + "%");
		List<Course> list2=query2.list();
		list = list2;
	}
	return list;
}

@Override
public void save(Score score) {
	Session session=sessionFactory.getCurrentSession();
	session.save(score);
}

@Override
public Course courseModify(Integer ids) {
	Session session=sessionFactory.getCurrentSession();
	Course course = (Course) session.get(Course.class,ids);
	return course;
}









	
}
