package com.gcxy.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gcxy.domain.Score;
@Repository
public class QueryScoreDaoImpl implements QueryScoreDao {
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public List<Score> qUserInfo(int id) {
		Session session = sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Score> list=session.createCriteria(Score.class)
				.createAlias("userinfo", "user")
				.add(Restrictions.eq("user.id", id))
				.createAlias("batch", "ba")
				.list();
				
			return list;	
		
	}

}
