package com.gcxy.dao;

import java.util.List;

import com.gcxy.domain.Role;

public interface RoleDao {
    //添加
	public void addRole(Role role);
	//获取id
	public Role  queryRoleById(Integer id);
	//删除
	public void deleteRole(int ids);
	//修改
	public  void updateRole(Role role);
	//查询
	public List<Role> query();
	//模糊查询
	public  List<Role> queryByName(String roleName);
	
	public Role roleModify(Integer ids);
}
