package com.gcxy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gcxy.dao.BatchDao;
import com.gcxy.domain.Batch;
import com.gcxy.domain.BatchCourseWare;
import com.gcxy.domain.UserInfo;
import com.gcxy.vo.BatchCouVo;
import com.gcxy.vo.BatchPeoVo;

@Service("batchService")
@Transactional
public class BatchServicelmpl implements BatchService {
   @Autowired
   private BatchDao batchDao;

@Override
public List<Batch> queryAll() {
	// TODO Auto-generated method stub
	return batchDao.queryAll();
}

@Override
public void delete(int ids) {
	// TODO Auto-generated method stub
	batchDao.delete(ids);
}

@Override
public void save(Batch batch) {
	// TODO Auto-generated method stub
	batchDao.save(batch);
}

@Override
public List<Batch> queryName(String batchName) {
	// TODO Auto-generated method stub
	return batchDao.queryName(batchName);
}

@Override
public List<BatchCourseWare> bcQueryAll() {
	
	return batchDao.bcQueryAll();
}

@Override
public Batch queryBatch(Integer ids) {
	
	return batchDao.queryBatch(ids);
}

@Override
public List<BatchPeoVo> queryBp(Integer ids) {
	// TODO Auto-generated method stub
	return batchDao.queryBp(ids);
}

@Override
public void deletePeo(Integer userId, Integer batchId) {
	batchDao.deletePeo(userId, batchId);
}

@Override
public List<BatchPeoVo> queryAddPeo(Integer batchId) {
	
	return batchDao.queryAddPeo(batchId);
}

@Override
public void batPeoAdd(Integer userId, Integer batchId) {
	batchDao.batPeoAdd(userId,batchId);
}

@Override
public List<BatchPeoVo> queryBPName(String name, Integer batchId) {
	
	return batchDao.queryBPName(name,batchId);
}

@Override
public List<BatchCouVo> queryCw(Integer c) {
	// TODO Auto-generated method stub
	return batchDao.queryCw(c);
}

@Override
public void deleteCou(Integer cwId, Integer batchId) {
	batchDao.deleteCou(cwId,batchId);
}

@Override
public List<BatchCouVo> queryBCName(String na, Integer batchId) {
	
	return batchDao.queryBCName(na,batchId);
}

@Override
public List<BatchCouVo> queryAddCou(Integer batchId) {
	
	return batchDao.queryAddCou(batchId);
}

@Override
public void batCouAdd(Integer cwId, Integer batchId) {
	batchDao.batCouAdd(cwId,batchId);
	
}


}
