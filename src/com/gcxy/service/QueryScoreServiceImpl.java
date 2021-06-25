package com.gcxy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gcxy.dao.QueryScoreDao;
import com.gcxy.domain.Score;

@Service("queryScoreService")
@Transactional
public class QueryScoreServiceImpl implements QueryScoreService {
	@Autowired
	private QueryScoreDao queryScoreDao;

	@Override
	public List<Score> qUserInfo(int id) {
		
		return queryScoreDao.qUserInfo(id);
	}
	
	
}
