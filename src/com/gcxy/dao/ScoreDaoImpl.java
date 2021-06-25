package com.gcxy.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.gcxy.domain.Batch;
import com.gcxy.domain.Score;
import com.gcxy.domain.UserInfo;
import com.gcxy.vo.scoreManageVo;
@Repository("scoreDao")
public class ScoreDaoImpl implements ScoreDao {
	@Autowired
	   private SessionFactory sessionFactory;


	@Override
	public List<UserInfo> querybyname(String userAccount) {
		Session session=sessionFactory.getCurrentSession();
		String hql = "from UserInfo where userAccount=:userAccount";
		Query query = session.createQuery(hql);
		query.setString("userAccount",userAccount);
		List<UserInfo> list =  query.list();
		return list;
	}

	@Override
	public List<Batch> querybybatchname(String batchName) {
		Session session=sessionFactory.getCurrentSession();
		String hql = "from Batch where batchName=:batchName";
		Query query = session.createQuery(hql);
		query.setString("batchName",batchName);
		List<Batch> list =  query.list();
	
		return list;
	}

	@Override
	public void addScore(Score score,Integer userId,Integer batchId) {
		Session session=sessionFactory.getCurrentSession();
		String hql = "from Score s where s.userinfo.id=:userId and s.batch.id =:batchId ";
		Query query = session.createQuery(hql);
		query.setInteger("userId", userId);
		query.setInteger("batchId", batchId);
		List<Score> list =  query.list();
		Score  scores = list.get(0); 
		scores.setScore(score.getScore());
		session.update(scores);
		
	}

	@Override
	public List<scoreManageVo> scoreQuery() {
		Session session=sessionFactory.getCurrentSession();
		String hql = "select new com.gcxy.vo.scoreManageVo(s.id,u.userAccount,s.score,b.batchName) "
				+ " from Score s left join s.userinfo u left join s.batch b where 1=1 ";
		Query query = session.createQuery(hql);
		List<scoreManageVo> list = query.list();
		return list;
	}

	@Override
	public List<scoreManageVo> userScoreQuery(String userAccount) {
		Session session=sessionFactory.getCurrentSession();
		String hql = "select new com.gcxy.vo.scoreManageVo(s.id,u.userAccount,s.score,b.batchName) "
				+ " from Score s left join s.userinfo u left join s.batch b where u.userAccount like :userAccount ";
		Query query = session.createQuery(hql);
		query.setString("userAccount", "%"+userAccount+"%");
		List<scoreManageVo> list = query.list();
		return list;
	}

	@Override
	public void scoreDelete(Integer id) {
		Session session=sessionFactory.getCurrentSession();
		Score score = (Score) session.get(Score.class,id);
		session.delete(score);
	}

	@Override
	public List<Batch> scoreAddQuery() {
		Session session=sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Batch> list = session.createCriteria(Batch.class).list(); 
		return list;
	}

	@Override
	public UserInfo sUserQuery(String userAccount) {
		Session session=sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<UserInfo> list = session.createCriteria(UserInfo.class)
		.add(Restrictions.eq("userAccount", userAccount))
		.list();
		return list.get(0);
	}

	@Override
	public Batch sBatchQuery(Integer batchId) {
		Session session=sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Batch> list = session.createCriteria(Batch.class)
		.add(Restrictions.eq("id", batchId))
		.list(); 
		
		return list.get(0);
	}

	@Override
	public void scoreAdd(Score sc) {
		Session session=sessionFactory.getCurrentSession();
		session.save(sc);
	}

	@Override
	public List<scoreManageVo> scoreModifyQuery(Integer id) {
		Session session=sessionFactory.getCurrentSession();
		String hql = "select new com.gcxy.vo.scoreManageVo(s.id,u.userAccount,s.score,b.batchName) "
				+ " from Score s left join s.userinfo u left join s.batch b where s.id=:id ";
		Query query = session.createQuery(hql);
		query.setInteger("id", id);
		List<scoreManageVo> list = query.list();
		return list;
	}

	@Override
	public void scoreModify(Integer id, int scores) {
		Session session=sessionFactory.getCurrentSession();
		Score score = (Score) session.get(Score.class,id);
		score.setScore(scores);
		session.update(score);
	}

}
