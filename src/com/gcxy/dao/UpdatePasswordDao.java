package com.gcxy.dao;

import java.util.List;

import com.gcxy.domain.UserInfo;

public interface UpdatePasswordDao {
	// 修改用户密码
		public UserInfo updatePassword(UserInfo userInfo);
   //通过id查询密码
		public UserInfo querypasswordByis(int id);
}
