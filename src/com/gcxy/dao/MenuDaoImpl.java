package com.gcxy.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gcxy.domain.Menu;

@Repository
public class MenuDaoImpl implements MenuDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Menu> queryAll() {
		Session session = sessionFactory.getCurrentSession();
		// sql语句
		String hql = "from Menu order by sortNo";

		// 利用hql的createQuery进行查询
		Query q = session.createQuery(hql);
		List<Menu> list = q.list();
		// 返回一个list集合
		return list;
	}

	@Override
	public void DeleteMenuById(Integer ids) {
		Session session = sessionFactory.getCurrentSession();
		Menu menu = (Menu) session.get(Menu.class, ids);
		if (menu != null) {
			session.delete(menu);
		}
	}

	@Override
	public void AddMenu(Menu menu) {
		Session session = sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Menu> menuList = session.createCriteria(Menu.class, "m")
				.add(Restrictions.eq("m.menuName", menu.getMenuName()))
				.add(Restrictions.eq("m.sortNo", menu.getSortNo())).list();
		if (menuList == null) {
			session.save(menu);
		}

	}

	@Override
	public void updateMenu(Menu menu) {
		Session session = sessionFactory.getCurrentSession();
		Menu menus = (Menu) session.get(Menu.class,menu.getId());
		menus.setMenuName(menu.getMenuName());
		menus.setAddress(menu.getAddress());
		session.update(menus);
	}

	@Override
	public List<Menu> queryMenuByName(String menuName) {
		Session session = sessionFactory.getCurrentSession();

		// sql语句
		String hql = "from Menu where menuName like :menuName";

		// 利用hql的createQuery进行查询
		Query q = session.createQuery(hql);
		q.setString("menuName", "%" + menuName + "%");
		List<Menu> list = q.list();
		// 返回一个list集合
		return list;
	}

	@Override
	public Menu menuQuMo(Integer ids) {
		Session session = sessionFactory.getCurrentSession();		
		if(ids != null) {
			Menu menu = (Menu) session.get(Menu.class,ids);
			return menu;
		}else {
			return null;
		}
	}

	@Override
	public void menuAdd(Menu menu,Integer ids) {
		Session session = sessionFactory.getCurrentSession();
		if(ids != null) {
			Menu me = (Menu) session.get(Menu.class,ids);
			menu.setMenu(me);
		}	
		session.save(menu);
		
	}

}
