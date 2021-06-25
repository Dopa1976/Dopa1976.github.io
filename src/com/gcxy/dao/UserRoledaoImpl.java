package com.gcxy.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gcxy.domain.Role;
import com.gcxy.domain.RoleControl;
import com.gcxy.domain.UserInfo;
import com.gcxy.domain.UserRole;
import com.gcxy.vo.UserManagerVo;
import com.gcxy.vo.UserRoleVo;
@Repository
public class UserRoledaoImpl implements UserRoledao {
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public List<UserRoleVo> queryUserRoleAll() {
		Session session = sessionFactory.getCurrentSession();
		String hql = "select new com.gcxy.vo.UserRoleVo(u.id,r.roleName,u1.userAccount) from UserRole u left join u.role r left join u.userinfo u1 where 1=1   ";
		Query q1 = session.createQuery(hql);
		List<UserRoleVo> list=q1.list();
		return list;
	}
	//通过用户账号查询
	@Override
	public List<UserRoleVo> queryByName(String name) {
		Session session = sessionFactory.getCurrentSession();
		String hql = "select new com.gcxy.vo.UserRoleVo(u.id,r.roleName,u1.userAccount) from UserRole u left join u.role r left join u.userinfo u1 where r.roleName like:name   ";
		Query query= session.createQuery(hql);
		query.setString("name", "%" + name + "%");
		List<UserRoleVo> list=query.list();
		if (list.size() == 0) {
			String hql1="select new com.gcxy.vo.UserRoleVo(u.id,r.roleName,u1.userAccount) from UserRole u left join u.role r left join u.userinfo u1 where u1.userAccount like:name ";
			Query query2= session.createQuery(hql1);
			query2.setString("name", "%" + name + "%");
			List<UserRoleVo> list1=query2.list();
			list=list1;
		}
		for(UserRoleVo user : list){
			System.out.println("输入id是"+user.getId());
		}
		return list;
	}
	@Override
	public void delete(int ids) {
		Session session=sessionFactory.getCurrentSession();
		UserRole userRole=(UserRole) session.get(UserRole.class, ids);
		session.delete(userRole);
		
	}
	//增加
	@Override
	public void addUserRole(UserRole userRole) {
		Session session = sessionFactory.getCurrentSession();
		session.save(userRole);
	}
	@Override
	public List<Role> queryAllRole() {
		Session session = sessionFactory.getCurrentSession();
		// sql语句
		String hql = "from Role where 1=1";
		
		// 利用hql的createQuery进行查询
		Query q = session.createQuery(hql);
		List<Role> list=q.list();
		// 返回一个list集合
		return list;
		
	}
	@Override
	public List<Role> queryRoleById(int id) {
		Session session = sessionFactory.getCurrentSession();
		// sql语句
		String hql = "from Role where id=:id";
		
		// 利用hql的createQuery进行查询
		Query q = session.createQuery(hql);
		q.setInteger("id", id);
		List<Role> list=q.list();
		return list;
	}
	@Override
	public List<UserInfo> queryUserById(int id) {
		Session session = sessionFactory.getCurrentSession();
		String hql = "from UserInfo where id=:id";
		Query q = session.createQuery(hql);
		q.setInteger("id", id);
		List<UserInfo> list=q.list();
		return list;
	}
	@Override
	public List<UserInfo> qUserInfos() {
		Session session = sessionFactory.getCurrentSession();
		// sql语句
		String hql = "from UserInfo where 1=1";
		
		// 利用hql的createQuery进行查询
		Query q = session.createQuery(hql);
		List<UserInfo> list=q.list();
		// 返回一个list集合
		return list;
		
	}
}
