package com.gcxy.service;

import java.util.List;

import com.gcxy.domain.Menu;
import com.gcxy.domain.Role;
import com.gcxy.domain.UserInfo;

public interface LoginSevice {
	List<UserInfo> queryLogin(String useraccount);
	public void test(UserInfo userinfo);
	List<Role> queryAllRelo();
	List<UserInfo> login(UserInfo user);
	List<Menu> selectUserMenu(Integer userId);
	List<UserInfo> queryRegister(String useraccount);
}
