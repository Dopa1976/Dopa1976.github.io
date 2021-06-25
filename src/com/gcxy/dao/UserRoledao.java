package com.gcxy.dao;

import java.util.List;

import com.gcxy.domain.Role;
import com.gcxy.domain.UserInfo;
import com.gcxy.domain.UserRole;
import com.gcxy.vo.UserRoleVo;

public interface UserRoledao {
	// 查询所有
	public List<UserRoleVo> queryUserRoleAll();

	// 通过用户账号查询
	public List<UserRoleVo> queryByName(String name);

	// 商城
	public void delete(int ids);

	// 增加
	public void addUserRole(UserRole userRole);

	public List<Role> queryAllRole();
	public List<UserInfo> qUserInfos();

	public List<Role> queryRoleById(int id);

	public List<UserInfo> queryUserById(int id);

}
