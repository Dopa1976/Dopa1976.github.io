package com.gcxy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gcxy.dao.MenuDao;
import com.gcxy.domain.Menu;
@Service("menuService")
@Transactional
public class MenuServiceImpl implements MenuService {
	@Autowired
	private MenuDao menuDao;
	
	//查询所有
	@Override
	public List<Menu> queryAll() {
		
		return menuDao.queryAll();
	}
    //删除菜单
	@Override
	public void DeleteMenuById(Integer ids) {
		menuDao.DeleteMenuById(ids);
		
	}
    //添加菜单
	@Override
	public void AddMenu(Menu menu) {
		menuDao.AddMenu(menu);
		
	}
    //修改菜单
	@Override
	public void updateMenu(Menu menu) {
		menuDao.updateMenu(menu);
		
	}
    //模糊查询
	@Override
	public List<Menu> queryMenuByName(String menuName) {
		return menuDao.queryMenuByName(menuName);
	}
	@Override
	public Menu menuQuMo(Integer ids) {
		// TODO Auto-generated method stub
		return menuDao.menuQuMo(ids);
	}
	@Override
	public void menuAdd(Menu menu,Integer ids) {
		menuDao.menuAdd(menu,ids);
		
	}

}
