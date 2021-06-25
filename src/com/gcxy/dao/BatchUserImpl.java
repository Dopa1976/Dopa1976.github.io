/**
 * 
 */
package com.gcxy.dao;

import java.util.List;

import org.apache.xmlbeans.impl.xb.xsdschema.RestrictionDocument.Restriction;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gcxy.domain.BatchCourseWare;
import com.gcxy.domain.Courseware;
import com.gcxy.domain.LeaRecord;
import com.gcxy.domain.Menu;
import com.gcxy.domain.Score;
import com.gcxy.vo.UserManagerVo;

/**
 * @author chengliang
 *
 */
@Repository
public class BatchUserImpl implements BatchUserDao {
	@Autowired
	private SessionFactory sessionFactory;
	@SuppressWarnings("unchecked")
	@Override
	public List<Score> queryBatch1(int id) {
		Session session = sessionFactory.getCurrentSession();
		List<Score> list=session.createCriteria(Score.class)
				                .createAlias("batch","b")
				                .createAlias("userinfo","u")
				                .add(Restrictions.eq("u.id", id))
				                .list();;
		// 返回一个list集合
		return list;
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<BatchCourseWare> queryBatchCourseWareByUserId(int id) {
		Session session = sessionFactory.getCurrentSession();
		List<BatchCourseWare> list=session.createCriteria(BatchCourseWare.class)
				                .createAlias("courseware", "c")
				                .createAlias("batch", "b")
				                .add(Restrictions.eq("b.id", id))
				                .list();;
		// 返回一个list集合
		return list;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<LeaRecord> queryLeaRecordByBatchId(int batchId,int UserId) {
		Session session = sessionFactory.getCurrentSession();
		List<LeaRecord> list=session.createCriteria(LeaRecord.class)
				.add(Restrictions.eq("finish","1"))
				.createAlias("user", "u")
				.add(Restrictions.eq("u.id",UserId))
				.createAlias("courseware", "c")
				.createAlias("batch", "b")
				.add(Restrictions.eq("b.id",batchId))
				                .list();;
		// 返回一个list集合
		return list;
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<LeaRecord> queryLeaRecord(int batchId, int UserId, int courseWareId) {
		Session session = sessionFactory.getCurrentSession();
		List<LeaRecord> list=session.createCriteria(LeaRecord.class)
				.createAlias("user", "u")
				.add(Restrictions.eq("u.id",UserId))
				.createAlias("courseware", "c")
				.add(Restrictions.eq("c.id",courseWareId))
				.createAlias("batch", "b")
				.add(Restrictions.eq("b.id",batchId))
				                .list();;
		// 返回一个list集合
		return list;
	}
	@Override
	public void save(LeaRecord leaRecord) {
		Session session = sessionFactory.getCurrentSession();
		session.save(leaRecord);
	}
	@Override
	public void update(LeaRecord leaRecord) {
		Session session = sessionFactory.getCurrentSession();
		session.clear();
		session.update(leaRecord);
		
	}
	private void addScore(LeaRecord leaRecord) {
		Session session = sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<LeaRecord> list = session.createCriteria(LeaRecord.class) 
		                              .createAlias("user","u")
		                                 .add(Restrictions.eq("u.id",leaRecord.getUser().getId() ))
		                              .createAlias("batch","b") 
		                                 .add(Restrictions.eq("b.id",leaRecord.getBatch().getId() ))
		                              .createAlias("courseware","cw") 
		                                 .add(Restrictions.eq("cw.id",leaRecord.getCourseware().getId() ))
		                              .list();
		
		LeaRecord lea = list.get(0);
		if(lea.getFinish().equals("1")) {
			//取视频分数
			Courseware cw = (Courseware) session.get(Courseware.class,leaRecord.getCourseware().getId()); 
			Integer credit = cw.getCwCredit();
			
			//查成绩
			@SuppressWarnings("unchecked")
			List<Score> scoreList = session.createCriteria(Score.class) 
			                              .createAlias("user","u")
			                                 .add(Restrictions.eq("u.id",leaRecord.getUser().getId() ))
			                              .createAlias("batch","b") 
			                                 .add(Restrictions.eq("b.id",leaRecord.getBatch().getId() ))
			                              .list();
			Score scores = scoreList.get(0);
			
			//修改成绩
			scores.setScore(scores.getScore()+credit);
			session.update(scores);
		}
		
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Courseware> queryCourseware(int cw_id) {
		Session session = sessionFactory.getCurrentSession();
		List<Courseware> list=session.createCriteria(Courseware.class)
				.add(Restrictions.eq("id", cw_id))
				.list();
		return list;
	}

}
