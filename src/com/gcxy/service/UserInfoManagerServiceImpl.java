/**
 * 
 */
package com.gcxy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gcxy.dao.UserInfoManagerDao;
import com.gcxy.vo.UserInfoManagerVo;

/**
 * @author chengliang
 *
 */
@Service("UserInfoManagerService")
@Transactional
public class UserInfoManagerServiceImpl implements UserInfoManagerService {
   @Autowired
   private UserInfoManagerDao userInfoManagerDao;
	/* (non-Javadoc)
	 * @see com.gcxy.service.UserInfoManagerService#queryUserInfo()
	 */
	@Override
	public List<UserInfoManagerVo> queryUserInfo() {
	
		return userInfoManagerDao.queryUserInfo();
	}
	@Override
	public List<UserInfoManagerVo> queryByCondition(String name) {
		// TODO Auto-generated method stub
		return userInfoManagerDao.queryByCondition(name);
	}

}
