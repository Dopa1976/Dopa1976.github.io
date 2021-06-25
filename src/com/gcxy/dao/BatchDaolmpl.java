package com.gcxy.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gcxy.domain.Batch;
import com.gcxy.domain.BatchCourseWare;
import com.gcxy.domain.Courseware;
import com.gcxy.domain.Score;
import com.gcxy.domain.UserInfo;
import com.gcxy.vo.BatchCouVo;
import com.gcxy.vo.BatchPeoVo;

@Repository
public class BatchDaolmpl implements BatchDao {
	@Autowired
	 private SessionFactory sessionFactory;

	@Override
	public List<Batch> queryAll() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		String hql="from Batch";
		Query query= session.createQuery(hql);
		List<Batch> list=query.list();
		return list;
	}

	@Override
	public void delete(int ids) {
		Session session=sessionFactory.getCurrentSession();
		Batch ba = (Batch) session.get(Batch.class, ids);
		if( ba != null) {
			session.delete(ba);
		}	
	}

	@Override
	public void save(Batch batch) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.save(batch);
	}

	@Override
	public List<Batch> queryName(String batchName) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		String hql = "from Batch where batchName like :batchName";
		Query query= session.createQuery(hql);
		query.setString("batchName", "%" + batchName + "%");
		List<Batch> list=query.list();
		return list;
	}

	@Override
	public List<BatchCourseWare> bcQueryAll() {
		Session session=sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<BatchCourseWare> list = session.createCriteria(BatchCourseWare.class)
		                              .createAlias("batch","b") 
		                              .createAlias("courseware","cw") 
		.list(); 
		return list;
	}

	@Override
	public Batch queryBatch(Integer ids) {
		Session session=sessionFactory.getCurrentSession();
		Batch batch = (Batch) session.get(Batch.class, ids);
		return batch;
	}

	@Override
	public List<BatchPeoVo> queryBp(Integer ids) {
		Session session=sessionFactory.getCurrentSession();
		String hql = "select new com.gcxy.vo.BatchPeoVo(u.id,b.id,u.userAccount,u.status) from Score s left join s.batch b left join s.userinfo u  "
				+ " where b.id=:bId";
		Query query= session.createQuery(hql);
		query.setInteger("bId", ids);
		List<BatchPeoVo> list=query.list();
		
	/*	
		@SuppressWarnings("unchecked")
		List<Score> list = session.createCriteria(Score.class)
				.createAlias("batch","b") 
		        .add( Restrictions.eq("b.id",ids))
		.list();
		List<UserInfo> userList = new ArrayList<UserInfo>();
		for(Score s : list) {
			@SuppressWarnings("unchecked")
			List<UserInfo> uList = session.createCriteria(UserInfo.class)
					.add( Restrictions.eq("id",s.getUserinfo().getId()))
			.list();
			UserInfo u = uList.get(0);
			userList.add(u);
		}*/
		return list;
	}

	@Override
	public void deletePeo(Integer userId, Integer batchId) {
		Session session=sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Score> list = session.createCriteria(Score.class)
				.createAlias("batch","b") 
		        .add( Restrictions.eq("b.id",batchId))
		        .createAlias("userinfo","u")
		        .add(Restrictions.eq("u.id",userId))
		.list();
		Score s = list.get(0);
		session.delete(s);		
		
	}

	@Override
	public List<BatchPeoVo> queryAddPeo(Integer batchId) {
		Session session=sessionFactory.getCurrentSession();
		
		String hql = "select new com.gcxy.vo.BatchPeoVo(u.id,u.userAccount,u.status) from UserInfo u "
				+ " where u.id not in(select u.id from Score s left join s.userinfo u left join s.batch b where b.id =:batchId)";
		Query query= session.createQuery(hql);
		query.setInteger("batchId", batchId);
		List<BatchPeoVo> list=query.list();	
		return list;
		
	}

	@Override
	public void batPeoAdd(Integer userId, Integer batchId) {
		Session session=sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Score> scoreList = session.createCriteria(Score.class)
				.createAlias("batch","b") 
		        .add( Restrictions.eq("b.id",batchId))
		        .createAlias("userinfo","u")
		        .add(Restrictions.eq("u.id",userId))
		        .list();
		if( scoreList.size() == 0 ) {
			Score s = new Score();
			s.setScore(0);
		    UserInfo u = (UserInfo) session.get(UserInfo.class,userId);
		    s.setUserinfo(u);
		    Batch b = (Batch)session.get(Batch.class,batchId);
		    s.setBatch(b);
		    session.save(s);
		}
		
	}

	@Override
	public List<BatchPeoVo> queryBPName(String name, Integer batchId) {
		Session session=sessionFactory.getCurrentSession();
		String hql = "select new com.gcxy.vo.BatchPeoVo(u.id,b.id,u.userAccount,u.status) from Score s left join s.batch b left join s.userinfo u  "
				+ " where b.id=:bId and u.userAccount like :userAccount ";
		Query query= session.createQuery(hql);
		query.setInteger("bId", batchId);
		query.setString("userAccount", "%"+name+"%");
		List<BatchPeoVo> list=query.list();
		return list;
	}

	@Override
	public List<BatchCouVo> queryCw(Integer c) {
		Session session=sessionFactory.getCurrentSession();
		String hql = "select new com.gcxy.vo.BatchCouVo(b.id,cw.id,cw.cwName,cw.cwCredit,cw.cwType) from BatchCourseWare bc left join bc.batch b left join bc.courseware cw  "
				+ " where b.id=:bId";
		Query query= session.createQuery(hql);
		query.setInteger("bId", c);
		List<BatchCouVo> list=query.list();
	 System.out.println(list.size());
		return list;
	}

	@Override
	public void deleteCou(Integer cwId, Integer batchId) {
		Session session=sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<BatchCourseWare> list = session.createCriteria(BatchCourseWare.class)
				.createAlias("batch","b") 
		        .add( Restrictions.eq("b.id",batchId))
		        .createAlias("courseware","cw")
		        .add(Restrictions.eq("cw.id",cwId))
		.list();
		BatchCourseWare bc = list.get(0);
		if( bc != null) {
			session.delete(bc);	
		}
	}

	@Override
	public List<BatchCouVo> queryBCName(String na, Integer batchId) {
		Session session=sessionFactory.getCurrentSession();
	    String hql="select new com.gcxy.vo.BatchCouVo(b.id,cw.id,cw.cwName,cw.cwCredit,cw.cwType) from BatchCourseWare bc left join bc.batch b left join bc.courseware cw  "
				+ " where b.id=:bId and cw.cwName like :cwname";
		Query query= session.createQuery(hql);
		query.setInteger("bId", batchId);
		query.setString("cwname", "%"+na+"%");
		List<BatchCouVo> list=query.list();
		return list;

	}

	@Override
	public List<BatchCouVo> queryAddCou(Integer batchId) {
		Session session=sessionFactory.getCurrentSession();
		String hql = "select new com.gcxy.vo.BatchCouVo(cw.id,cw.cwName,cw.cwCredit,cw.cwType) from Courseware cw "
				+ " where cw.id not in(select cw.id from BatchCourseWare bc left join bc.courseware cw left join bc.batch b where b.id =:batchId)";
		Query query= session.createQuery(hql);
		query.setInteger("batchId", batchId);
		List<BatchCouVo> list=query.list();	
		return list;
			
		}

	@Override
	public void batCouAdd(Integer cwId, Integer batchId) {
		Session session=sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<BatchCourseWare> List = session.createCriteria(BatchCourseWare.class)
				.createAlias("batch","b") 
		        .add( Restrictions.eq("b.id",batchId))
		        .createAlias("courseware","cw")
		        .add(Restrictions.eq("cw.id",cwId))
		        .list();
		if( List.size() == 0 ) {
			BatchCourseWare bc = new BatchCourseWare();
		    Courseware c = (Courseware) session.get(Courseware.class,cwId);
		    bc.setCourseware(c);
		    Batch b = (Batch)session.get(Batch.class,batchId);
		    bc.setBatch(b);
		    session.save(bc);
		}

	}


}
