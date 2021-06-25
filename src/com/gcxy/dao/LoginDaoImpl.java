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
import com.gcxy.domain.UserInfo;
import com.gcxy.domain.UserRole;

/**
 * @author chengliang
 *
 */
@Repository
public class LoginDaoImpl implements LoginDao {
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public List<UserInfo> queryLogin(String useraccount) {
		Session session = sessionFactory.getCurrentSession();

		// sql语句
		String hql = "from UserInfo where userAccount like :useraccount";
		
		// 利用hql的createQuery进行查询
		Query q = session.createQuery(hql);
		q.setString("useraccount", "%"+useraccount+"%");
		List<UserInfo> list=q.list();
		// 返回一个list集合
		return list;
	}
	@Override
	public void test(UserInfo userinfo) {
		Session s = sessionFactory.getCurrentSession();
		s.save(userinfo);
		
		
		
	}
	@Override
	public List<Role> queryAllRelo() {
		Session session = sessionFactory.getCurrentSession();
		String hql = "from Role";//创建hql语句
		Query q = session.createQuery(hql);// 利用hql的createQuery进行查询
		List<Role> list=q.list();// 将hql查出来的数据存储到List集合当中
		return list;//返回一个list集合
	}
	@Override
	public List<UserInfo> login(UserInfo user) {
		
      Session s=sessionFactory.getCurrentSession();
		//sql语句
		String hql="from UserInfo where userAccount='"+user.getUserAccount()+"' and userPassword='"+user.getUserPassword()+"'";
	//利用hql的createQuery进行查询
		Query q=s.createQuery(hql);
	//返回一个list集合
		return q.list();
	}
	@Override
	public List<Menu> selectUserMenu(Integer userId) {
		Session s=sessionFactory.getCurrentSession();
		//sql语句
		String hql=" from Menu as m where m.id in(select distinct rm.menu.id from RoleControl as rm where rm.role.id in (select ur.role.id from UserRole ur where ur.userinfo.id=:userId)) order by m.sortNo,m.id asc";
	//利用hql的createQuery进行查询
		Query q=s.createQuery(hql);
		q.setInteger("userId", userId);
	//返回一个list集合
		return q.list();
	}
	@Override
	public List<UserInfo> queryRegister(String useraccount) {
		Session session = sessionFactory.getCurrentSession();
		// sql语句
		String hql = "from UserInfo where userAccount=:useraccount";
		
		// 利用hql的createQuery进行查询
		Query q = session.createQuery(hql);
		q.setString("useraccount", "useraccount");
		List<UserInfo> list=q.list();//
		// 返回一个list集合
		return list;
	}
}
