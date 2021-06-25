package com.gcxy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gcxy.dao.RoleDao;
import com.gcxy.domain.Role;
@Service("roleservice")
@Transactional
public class RoleServiceImpl  implements RoleService{
	@Autowired
	private RoleDao roledao;
	@Override
	public void addRole(Role role) {
		roledao.addRole(role);
		
	}
	@Override
	public Role queryRoleById(Integer id) {
		// TODO Auto-generated method stub
		return roledao.queryRoleById(id);
	}
	@Override
	public void deleteRole(int id) {
		roledao.deleteRole(id);
		
	}
	@Override
	public void updateRole(Role role) {
		roledao.updateRole(role);
		
	}
	@Override
	public List<Role> query() {
		// TODO Auto-generated method stub
		return roledao.query();
	}
	@Override
	public List<Role> queryByName(String roleName) {
		// TODO Auto-generated method stub
		return roledao.queryByName(roleName);
	}
	@Override
	public Role roleModify(Integer ids) {
		
		return roledao.roleModify(ids);
	}

}
