package com.gcxy.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gcxy.dao.LoginDao;
import com.gcxy.domain.Menu;
import com.gcxy.domain.Role;
import com.gcxy.domain.UserInfo;
@Service("loginservice")
@Transactional
public class LoginServiceImpl implements LoginSevice {
	@Autowired
	private LoginDao logindao;
	@Override
	public List<UserInfo> queryLogin(String useraccount) {
		
		return logindao.queryLogin(useraccount);
	}
	@Override
	public void test(UserInfo userinfo) {
		logindao.test(userinfo);
		
	}
	@Override
	public List<Role> queryAllRelo() {
		
		return logindao.queryAllRelo();
	}
	@Override
	public List<UserInfo> login(UserInfo user) {
		return logindao.login(user);
	}
	@Override
	public List<Menu> selectUserMenu(Integer userId) {
		List<Menu> rootMenus = logindao.selectUserMenu(userId);
		// 最后的结果
		List<Menu> menuList = new ArrayList<Menu>();
		// 先找到所有的一级菜单
		for (int i = 0; i < rootMenus.size(); i++) {
			// 一级菜单的排序号为1
			if (rootMenus.get(i).getSortNo()==1) {
				menuList.add(rootMenus.get(i));
			}
		}
		// 为一级菜单设置子菜单，getChild是递归调用的
		for (Menu menu : menuList) {
			menu.setChildren(getChild(menu.getId(), rootMenus));
		}
		return menuList;
	}
	/*
	 * 递归调用查询
	 * */
	private List<Menu> getChild(int id, List<Menu> rootMenus) {
		// 子菜单
		List<Menu> childList = new ArrayList<Menu>();
		for (Menu menu : rootMenus) {
			// 遍历所有节点，将父菜单id与传过来的id比较
			if (menu.getMenu()!=null) {
				if (menu.getMenu().getId()==id) {
					childList.add(menu);
				}
			}
		}
		// 把子菜单的子菜单再循环一遍
		for (Menu menu : childList) {
			//递归
			menu.setChildren(getChild(menu.getId(), rootMenus));
		} // 递归退出条件
		if (childList.size() == 0) {
			return null;
		}
		return childList;
	}
	@Override
	public List<UserInfo> queryRegister(String useraccount) {
		// TODO Auto-generated method stub
		return logindao.queryLogin(useraccount);
	}

}