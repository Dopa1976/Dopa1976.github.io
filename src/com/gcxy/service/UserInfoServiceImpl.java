package com.gcxy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gcxy.dao.UserInfoDao;
import com.gcxy.domain.UserInfo;
@Service("userInfoService")
@Transactional
public class UserInfoServiceImpl implements UserInfoService {
@Autowired
private UserInfoDao userInfoDao;
	@Override
	public List<UserInfo> queryAll() {
		// TODO Auto-generated method stub
		return userInfoDao.queryAll();
	}

	@Override
	public List<UserInfo> queryByCondition(String name) {
		// TODO Auto-generated method stub
		return userInfoDao.queryByCondition(name);
	}

	@Override
	public void delete(int id) {
		userInfoDao.delete(id);

	}

	@Override
	public void addUserInfo(UserInfo userinfo) {
		userInfoDao.addUserInfo(userinfo);

	}

	@Override
	public void updateUserInfoLogin(int id1) {
		userInfoDao.updateUserInfoLogin(id1);
		
	}

}
