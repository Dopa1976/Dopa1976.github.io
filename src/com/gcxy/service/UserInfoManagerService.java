package com.gcxy.service;

import java.util.List;

import com.gcxy.vo.UserInfoManagerVo;

public interface UserInfoManagerService {
	public List<UserInfoManagerVo> queryUserInfo();
	List<UserInfoManagerVo> queryByCondition(String name);;
}
