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

import com.gcxy.domain.Menu;
import com.gcxy.domain.Role;
import com.gcxy.domain.RoleControl;
import com.gcxy.domain.UserInfo;
import com.gcxy.vo.UserManagerVo;

/**
 * @author chengliang
 *
 */
@Repository
public class UserManagerImpl implements UserManagerDao {
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public List<UserManagerVo> queryAll() {	
		Session session = sessionFactory.getCurrentSession();
		// sql语句
		String hql = "select new com.gcxy.vo.UserManagerVo(r.id,r1.roleName,m.menuName) from RoleControl r left join r.role r1 left join r.menu m where 1=1   ";
		
		// 利用hql的createQuery进行查询
		Query q = session.createQuery(hql);
		List<UserManagerVo> list=q.list();
		// 返回一个list集合
		return list;
	}
	@Override
	public List<UserManagerVo> queryByCondition(String name) {
		Session session=sessionFactory.getCurrentSession();
		String hql = "select new com.gcxy.vo.UserManagerVo(r.id,r1.roleName,m.menuName) from RoleControl r left join r.role r1 left join r.menu m where r1.roleName like:name";	
		Query query= session.createQuery(hql);
		query.setString("name", "%" + name + "%");
		List<UserManagerVo> list=query.list();
		if(list.size() == 0) {
			String hql2 = "select new com.gcxy.vo.UserManagerVo(r.id,r1.roleName,m.menuName) from RoleControl r left join r.role r1 left join r.menu m where m.menuName like:name";
			Query query2= session.createQuery(hql2);
			query2.setString("name", "%" + name + "%");
			List<UserManagerVo> list2=query2.list();
			list = list2;
		}
		return list;
	}
	@Override
	public void delete(int ids) {
		Session session=sessionFactory.getCurrentSession();
		RoleControl rl=(RoleControl) session.get(RoleControl.class, ids);
		session.delete(rl);
		
	}
	@Override
	public List<Menu> queryByUserId(int id) {
		Session session = sessionFactory.getCurrentSession();
		// sql语句
		String hql = "from Menu m where m.id not in(select r.menu from RoleControl r where r.role=:id)";
		
		// 利用hql的createQuery进行查询
		Query q = session.createQuery(hql);
		q.setInteger("id", id);
		List<Menu> list=q.list();
		// 返回一个list集合
		return list;
	}
	@Override
	public List<UserInfo> queryUserAll() {
		Session session = sessionFactory.getCurrentSession();
		// sql语句
		String hql = "from UserInfo where 1=1";
		
		// 利用hql的createQuery进行查询
		Query q = session.createQuery(hql);
		List<UserInfo> list=q.list();
		// 返回一个list集合
		return list;
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
	public List<Menu> queryCanById(int id) {
		Session session = sessionFactory.getCurrentSession();
		// sql语句
		String hql = "from Menu m where m.id in(select r.menu from RoleControl r where r.role=:id)";
		
		// 利用hql的createQuery进行查询
		Query q = session.createQuery(hql);
		q.setInteger("id", id);
		List<Menu> list=q.list();
		// 返回一个list集合
		return list;
	}

	@Override
	public void addUserManager(Integer roleId, Integer ids) {
		Session session = sessionFactory.getCurrentSession();
		Role role = (Role)session.get(Role.class, roleId);
		Menu menu = (Menu)session.get(Menu.class,ids);
		RoleControl roleControl = new RoleControl();
		roleControl.setRole(role);
		roleControl.setMenu(menu);
		session.save(roleControl);
	}

}
