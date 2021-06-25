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

import com.gcxy.domain.RoleControl;
import com.gcxy.vo.UserInfoManagerVo;

/**
 * @author chengliang
 *
 */
@Repository
public class UserInfoManagerImpl implements UserInfoManagerDao {
	@Autowired
	private SessionFactory sessionFactory;
	/* (non-Javadoc)
	 * @see com.gcxy.dao.UserInfoManagerDao#queryUserInfo()
	 */
	@Override
	public List<UserInfoManagerVo> queryUserInfo() {
		Session session = sessionFactory.getCurrentSession();
		// sql语句
		String hql = "select new com.gcxy.vo.UserInfoManagerVo(u.id,u.userAccount,u.userPassword,u.status,r.roleName) from UserRole u1 left join u1.userinfo u left join u1.role r where 1=1";
		
		// 利用hql的createQuery进行查询
		Query q = session.createQuery(hql);
		List<UserInfoManagerVo> list=q.list();
		// 返回一个list集合
		return list;
	}
	@Override
	public List<UserInfoManagerVo> queryByCondition(String name) {
		Session session=sessionFactory.getCurrentSession();
		String hql = "select new com.gcxy.vo.UserInfoManagerVo(u.id,u.userAccount,u.userPassword,u.status,r.roleName) from UserRole u1 left join u1.userinfo u left join u1.role r where 1=1";	
		if(name!=null) {
			hql=hql+"and u.userAccount like :name";
		}
		Query query=session.createQuery(hql);
		query.setString("name", "%" + name + "%");
		List<UserInfoManagerVo> list=query.list();
		return list;
	}
	@Override
	public void delete(int ids) {
		Session session=sessionFactory.getCurrentSession();
		RoleControl rl=(RoleControl) session.get(RoleControl.class, ids);
		session.delete(rl);
		
	}

}
