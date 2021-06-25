/**
 * 
 */
package com.gcxy.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gcxy.domain.Role;
import com.gcxy.domain.UserInfo;
import com.gcxy.domain.UserRole;

/**
 * @author chengliang
 *
 */
@Repository("userInfoDao")
public class UserInfoImpl implements UserInfoDao {
@Autowired
private SessionFactory sessionFactory;
	@Override
	public List<UserInfo> queryAll() {
		Session session=sessionFactory.getCurrentSession();
		String hql="from UserInfo where 1=1";
		Query query=session.createQuery(hql);
		List<UserInfo> list=query.list();
		return list;
	}
	@Override
	public List<UserInfo> queryByCondition(String name) {
		Session session=sessionFactory.getCurrentSession();
		String hql = "from UserInfo where 1=1";	
		if(name!=null) {
			hql=hql+"and userAccount like :name";
		}
		Query query=session.createQuery(hql);
		query.setString("name", "%" + name + "%");
		List<UserInfo> list=query.list();
		return list;
	}
	@Override
	public void delete(int id) {
		Session session=sessionFactory.getCurrentSession();
		UserInfo userInfo=(UserInfo) session.get(UserInfo.class, id);
		if(userInfo != null) {
			session.delete(userInfo);
		}
		
		
		
	}
	@Override
	public void addUserInfo(UserInfo userinfo) {
		Session session=sessionFactory.getCurrentSession();
		session.save(userinfo);
		
	}
	@Override
	public void updateUserInfoLogin(int id1) {
		Session session=sessionFactory.getCurrentSession();
		UserInfo userInfo=(UserInfo) session.get(UserInfo.class, id1);
		userInfo.setStatus("1");
		saveUserRole(userInfo);
		session.update(userInfo);
		
	}
	private void saveUserRole(UserInfo userInfo ) {
		Session session=sessionFactory.getCurrentSession();
		Role role = (Role) session.get(Role.class, 2);
		UserRole userRole = new UserRole();
		userRole.setRole(role);
		userRole.setUserinfo(userInfo);
		session.save(userRole);
		
	}

}
