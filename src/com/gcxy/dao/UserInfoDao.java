package com.gcxy.dao;

import java.util.List;

import com.gcxy.domain.UserInfo;

public interface UserInfoDao {
List<UserInfo> queryAll();
List<UserInfo> queryByCondition(String name);
void delete(int id);
void addUserInfo(UserInfo userinfo);
void updateUserInfoLogin(int id1);
}
