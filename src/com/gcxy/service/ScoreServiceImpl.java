package com.gcxy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gcxy.dao.ScoreDao;
import com.gcxy.domain.Batch;
import com.gcxy.domain.Score;
import com.gcxy.domain.UserInfo;
import com.gcxy.vo.scoreManageVo;
@Service("scoreService")
@Transactional
public class ScoreServiceImpl implements ScoreService {
	@Autowired
    private ScoreDao scoreDao;

	@Override
	public List<UserInfo> querybyname(String userAccount) {
		return scoreDao.querybyname(userAccount);
	}

	@Override
	public List<Batch> querybybatchname(String batchName) {
		return scoreDao.querybybatchname(batchName);
	}

	@Override
	public void addScore(Score score,Integer userId,Integer batchId) {
		scoreDao.addScore(score,userId,batchId);
		
	}

	@Override
	public List<scoreManageVo> scoreQuery() {
		
		return scoreDao.scoreQuery();
	}

	@Override
	public List<scoreManageVo> userScoreQuery(String userAccount) {
		
		return scoreDao.userScoreQuery(userAccount);
	}

	@Override
	public void scoreDelete(Integer id) {
		scoreDao.scoreDelete(id);
	}

	@Override
	public List<Batch> scoreAddQuery() {
		
		return scoreDao.scoreAddQuery();
	}

	@Override
	public UserInfo sUserQuery(String userAccount) {
		
		return  scoreDao.sUserQuery(userAccount);
	}

	@Override
	public Batch sBatchQuery(Integer batchId) {
	
		return  scoreDao.sBatchQuery(batchId) ;
	}

	@Override
	public void scoreAdd(Score sc) {
		
		scoreDao.scoreAdd( sc);
	}

	@Override
	public List<scoreManageVo> scoreModifyQuery(Integer id) {
		
		return scoreDao.scoreModifyQuery(id);
	}

	@Override
	public void scoreModify(Integer id, int scores) {
		scoreDao.scoreModify(id, scores);
		
	}



}
