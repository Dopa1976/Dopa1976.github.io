package com.gcxy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.gcxy.dao.UserManagerDao;
import com.gcxy.domain.Menu;
import com.gcxy.domain.Role;
import com.gcxy.domain.RoleControl;
import com.gcxy.domain.UserInfo;
import com.gcxy.vo.UserManagerVo;
@Service("userManagerService")
@Transactional
public class UserManagerServiceImpl implements UserManagerService {
	@Autowired
    private UserManagerDao userManagerDao;
	@Override
	public List<UserManagerVo> queryAll() {
		return userManagerDao.queryAll();
	}
	@Override
	public List<UserManagerVo> queryByCondition(String name) {
		// TODO Auto-generated method stub
		return userManagerDao.queryByCondition(name);
	}
	@Override
	public void delete(int ids) {
		userManagerDao.delete(ids);
		
	}
	@Override
	public List<Menu> queryByUserId(int id) {
		// TODO Auto-generated method stub
		return userManagerDao.queryByUserId(id);
	}
	@Override
	public List<UserInfo> queryUserAll() {
		// TODO Auto-generated method stub
		return userManagerDao.queryUserAll();
	}
	@Override
	public List<Role> queryAllRole() {
		// TODO Auto-generated method stub
		return userManagerDao.queryAllRole();
	}
	@Override
	public List<Menu> queryCanById(int id) {
		// TODO Auto-generated method stub
		return userManagerDao.queryCanById(id);
	}
	@Override
	public void addUserManager(Integer roleId, Integer ids) {
		userManagerDao.addUserManager(roleId,ids);
		
	}

}
