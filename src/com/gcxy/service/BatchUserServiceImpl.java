package com.gcxy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gcxy.dao.BatchUserDao;
import com.gcxy.domain.BatchCourseWare;
import com.gcxy.domain.Courseware;
import com.gcxy.domain.LeaRecord;
import com.gcxy.domain.Score;
@Service("batchUserService")
@Transactional
public class BatchUserServiceImpl implements BatchUserService {
	@Autowired
    private BatchUserDao bathUserDao;
	@Override
	public List<Score> queryBatch1(int id) {
		// TODO Auto-generated method stub
		return bathUserDao.queryBatch1(id);
	}
	@Override
	public List<BatchCourseWare> queryBatchCourseWareByUserId(int id) {
		// TODO Auto-generated method stub
		return bathUserDao.queryBatchCourseWareByUserId(id);
	}
	@Override
	public List<LeaRecord> queryLeaRecordByBatchId(int batchId,int UserId) {
		// TODO Auto-generated method stub
		return bathUserDao.queryLeaRecordByBatchId(batchId,UserId);
	}
	@Override
	public List<LeaRecord> queryLeaRecord(int batchId, int UserId, int courseWareId) {
		// TODO Auto-generated method stub
		return bathUserDao.queryLeaRecord(batchId, UserId, courseWareId);
	}
	@Override
	public void save(LeaRecord leaRecord) {
		bathUserDao.save(leaRecord);
		
	}
	@Override
	public void update(LeaRecord leaRecord) {
		bathUserDao.update(leaRecord);
		
	}
	@Override
	public List<Courseware> queryCourseware(int cw_id) {
		// TODO Auto-generated method stub
		return bathUserDao.queryCourseware(cw_id);
	}



}
