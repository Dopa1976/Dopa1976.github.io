package com.gcxy.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.gcxy.domain.Role;

@Repository
public class RoleDaoImpl implements RoleDao {
	@Autowired
	private SessionFactory sessionFactory;
//添加
	@Override
	public void addRole(Role role) {
		Session session = sessionFactory.getCurrentSession();
		session.save(role);
	}
//获取id
	@Override
	public Role queryRoleById(Integer id) {
		Session session = sessionFactory.getCurrentSession();
		Role role = (Role) session.get(Role.class, id);
		return role;
		
	}
//删除
	@Override
	public void deleteRole(int ids) {
		Session session = sessionFactory.getCurrentSession();
		Role role = (Role) session.get(Role.class, ids);
		if(role != null) {
			session.delete(role);
		}
        
	}
//修改
	@Override
	public void updateRole(Role role) {
		Session session = sessionFactory.getCurrentSession();
		Role updaterole = (Role) session.get(Role.class, role.getId());
		updaterole.setRoleName(role.getRoleName());
		session.update(updaterole);
		
	}
	//查询所有
	@Override
	public List<Role> query() {
		Session session = sessionFactory.getCurrentSession();
		String hql="from Role";
		Query query=session.createQuery(hql);
		List<Role> list=query.list();
		return list;
	}
	//模糊查询
	@Override
	public List<Role> queryByName(String roleName) {
		Session session = sessionFactory.getCurrentSession();
		String hql="from Role where roleName like:roleName";
		Query query=session.createQuery(hql);
		query.setString("roleName", "%" + roleName + "%");
		List<Role> list=query.list();
		return list;
	}
	@Override
	public Role roleModify(Integer ids) {
		Session session = sessionFactory.getCurrentSession();
		Role role = (Role)session.get(Role.class,ids);
		return role;
	}
	
}
