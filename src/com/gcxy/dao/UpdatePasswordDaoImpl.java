package com.gcxy.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gcxy.domain.Batch;
import com.gcxy.domain.Role;
import com.gcxy.domain.UserInfo;

@Repository
public class UpdatePasswordDaoImpl implements UpdatePasswordDao {
	@Autowired
	   private SessionFactory sessionFactory;

	@Override
	public UserInfo updatePassword(UserInfo userInfo) {
		Session session = sessionFactory.getCurrentSession();
	    UserInfo uInfo = (UserInfo) session.get(UserInfo.class, userInfo.getId());
	    uInfo.setUserPassword(userInfo.getUserPassword());
		session.update(uInfo);
		return uInfo;
	}

	@Override
	public UserInfo querypasswordByis(int id) {
		Session session = sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<UserInfo> list = session.createCriteria(UserInfo.class)
		.add(Restrictions.eq("id", id))
		.list(); 
			return list.get(0);
		
	}
	
	
	
}
