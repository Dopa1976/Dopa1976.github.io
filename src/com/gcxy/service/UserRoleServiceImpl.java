package com.gcxy.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gcxy.dao.UserRoledao;
import com.gcxy.domain.Role;
import com.gcxy.domain.UserInfo;
import com.gcxy.domain.UserRole;
import com.gcxy.vo.UserRoleVo;
@Service("userRoleService")
@Transactional
public class UserRoleServiceImpl implements UserRoleService{
	@Autowired
	private  UserRoledao userRoledao;

	@Override
	public List<UserRoleVo> queryUserRoleAll() {
		// TODO Auto-generated method stub
		return userRoledao.queryUserRoleAll();
	}

	@Override
	public List<UserRoleVo> queryByName(String name) {
		
		return userRoledao.queryByName(name);
	}

	@Override
	public void delete(int ids) {
		userRoledao.delete(ids);
		
		
	}

	@Override
	public void addUserRole(UserRole userRole) {
		userRoledao.addUserRole(userRole);
	}

	@Override
	public List<Role> queryAllRole() {
		
		return userRoledao.queryAllRole();
	}

	@Override
	public List<Role> queryRoleById(int id) {
		
		return userRoledao.queryRoleById(id);
	}

	@Override
	public List<UserInfo> queryUserById(int id) {
		// TODO Auto-generated method stub
		return userRoledao.queryUserById(id);
	}

	@Override
	public List<UserInfo> qUserInfos() {
		// TODO Auto-generated method stub
		return userRoledao.qUserInfos();
	}
	
	
}
