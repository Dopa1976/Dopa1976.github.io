package com.gcxy.service;

import java.util.List;

import com.gcxy.domain.UserInfo;

public interface UserInfoService {
	List<UserInfo> queryAll();
	List<UserInfo> queryByCondition(String name);
	void delete(int id);
	void addUserInfo(UserInfo userinfo);
	void updateUserInfoLogin(int id1);
}
