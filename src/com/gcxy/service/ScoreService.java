package com.gcxy.service;

import java.util.List;

import com.gcxy.domain.Batch;
import com.gcxy.domain.Score;
import com.gcxy.domain.UserInfo;
import com.gcxy.vo.scoreManageVo;

public interface ScoreService {
	public List<UserInfo> querybyname(String userAccount);
	public List<Batch> querybybatchname(String batchName);
	public void addScore(Score score, Integer integer, Integer integer2);
	public List<scoreManageVo> scoreQuery();
	public List<scoreManageVo> userScoreQuery(String userAccount);
	public void scoreDelete(Integer id);
	public List<Batch> scoreAddQuery();
	public UserInfo sUserQuery(String userAccount);
	public Batch sBatchQuery(Integer batchId);
	public void scoreAdd(Score sc);
	public List<scoreManageVo> scoreModifyQuery(Integer id);
	public void scoreModify(Integer id, int scores);

}
