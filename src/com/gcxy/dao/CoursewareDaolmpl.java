package com.gcxy.dao;

import java.io.File;
import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gcxy.domain.Course;
import com.gcxy.domain.Courseware;


@Repository
public class CoursewareDaolmpl implements CoursewareDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Courseware> queryAll() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		String hql="select new com.gcxy.vo.CoursewareVo(cw.id,cw.cwName,cw.cwCredit,cw.cwAddress,cw.cwType,c.id,c.courseName) "
					+ " from Courseware cw left join cw.course c";
		Query query=session.createQuery(hql);
		List<Courseware> list=query.list();
		return list;
	}

	@Override
	public void delete(int ids) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		Courseware cw = (Courseware) session.get(Courseware.class, ids);
		
		//删除文件
		String realPath=ServletActionContext.getServletContext().getRealPath("/upload")+"/"+cw.getCwAddress();		
		File file = new File(realPath);
		file.delete();
		File file1 = new File("D:\\works\\OLS07\\WebContent\\upload"+"/"+cw.getCwAddress());				
		file1.delete();
		
		//删除数据
		session.delete(cw);
	}

	@Override
	public Course courseName(String coursename) {
		Session session = sessionFactory.getCurrentSession();
		String hql = "from Course where courseName =:courseName";
		Query query= session.createQuery(hql);
		query.setString("courseName",  coursename );
		List<Course> list=query.list();
		if(list.size() != 0){
			Course course=list.get(0);
			return course;
		}else{
			return null;
		}
	}

	

	@Override
	public List<Courseware> queryName(String cwName) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		String hql = "from Courseware where cwName like :cwName";
		Query query= session.createQuery(hql);
		query.setString("cwName", "%" + cwName + "%");
		List<Courseware> list=query.list();
		return list;
	}

	/**
	 * 保存课件信息
	 */
	@Override
	public void saveCwInfo(Courseware courseware) {
		Session session=sessionFactory.getCurrentSession();
		session.save(courseware);	
	}
}
