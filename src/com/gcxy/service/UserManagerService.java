package com.gcxy.service;

import java.util.List;

import com.gcxy.domain.Menu;
import com.gcxy.domain.Role;
import com.gcxy.domain.UserInfo;
import com.gcxy.vo.UserManagerVo;

public interface UserManagerService {
	List<UserManagerVo> queryAll();
	List<UserManagerVo> queryByCondition(String name);
	public void delete(int ids);
	public List<Menu> queryByUserId(int id);
	public List<UserInfo> queryUserAll();
	List<Role> queryAllRole();
	List<Menu> queryCanById(int id);
	void addUserManager(Integer roleId, Integer ids);
}
