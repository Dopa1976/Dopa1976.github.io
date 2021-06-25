package com.gcxy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gcxy.dao.LeaRecordDao;
import com.gcxy.domain.LeaRecord;
import com.gcxy.domain.UserInfo;

@Service("leaRecordService")
@Transactional
public class LeaRecordServicelmpl implements LeaRecordService {
	@Autowired
    private LeaRecordDao leaRecordDao;
	
	@Override
	public List<LeaRecord> LeaqueryAll() {
		// TODO Auto-generated method stub
		return leaRecordDao.LeaqueryAll();
	}

	@Override
	public void delete(int ids) {
		// TODO Auto-generated method stub
		leaRecordDao.delete(ids);
	}

	@Override
	public List<LeaRecord> userqueryName(String userAccount) {
		// TODO Auto-generated method stub
		return leaRecordDao.userqueryName(userAccount);
	}

	


}
