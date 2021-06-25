package com.gcxy.service;

import java.util.List;

import com.gcxy.domain.UserInfo;

public interface UpdatePasswordService {
	// 修改用户密码
		public UserInfo updatePassword(UserInfo userInfo);
		public UserInfo querypasswordByis(int id);
}
