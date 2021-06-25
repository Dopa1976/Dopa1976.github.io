package com.gcxy.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.gcxy.domain.LeaRecord;


@Repository
public class LeaRecordDaolmpl implements LeaRecordDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	public List<LeaRecord> LeaqueryAll() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<LeaRecord> list = session.createCriteria(LeaRecord.class) 
		                              .createAlias("user","u")
		                              .createAlias("batch","b") 
		                              .createAlias("courseware","cw") 
		.list(); 
		return list;
	}

	public void delete(int ids) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		LeaRecord le = (LeaRecord) session.get(LeaRecord.class, ids);
		if(le != null) {
			session.delete(le);
		}
		
	}

	@Override
	public List<LeaRecord> userqueryName(String userAccount) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<LeaRecord> list=session.createCriteria(LeaRecord.class)
				.createAlias("user", "u")
				.add(Restrictions.like("u.userAccount", "%"+userAccount+"%"))
				.createAlias("batch", "b")
				.createAlias("courseware", "cw")
				.list();
		
		        
		return list;
	}

	
	



}
