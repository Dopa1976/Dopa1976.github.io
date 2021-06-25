package com.gcxy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.gcxy.dao.UpdatePasswordDao;
import com.gcxy.domain.UserInfo;

@Service("updatePasswordService")
@Transactional
public class UpdatePasswordServiceImpl implements UpdatePasswordService{
	@Autowired
	private UpdatePasswordDao updatePasswordDao;

	@Override
	public UserInfo updatePassword(UserInfo userInfo) {
		
		return updatePasswordDao.updatePassword(userInfo);
	}

	@Override
	public UserInfo querypasswordByis(int id) {
		// TODO Auto-generated method stub
		return updatePasswordDao.querypasswordByis(id);
	}
	
	
	
}
