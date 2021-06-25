package com.gcxy.dao;

import java.util.List;

import com.gcxy.domain.Menu;

public interface MenuDao {
	List<Menu> queryAll();
	void DeleteMenuById(Integer ids);
	void AddMenu(Menu menu);
	void updateMenu(Menu menu);
	List<Menu> queryMenuByName(String menuName);
	Menu menuQuMo(Integer ids);
	void menuAdd(Menu menu, Integer ids);
}
