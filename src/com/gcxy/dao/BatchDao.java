package com.gcxy.dao;

import java.util.List;

import com.gcxy.domain.Batch;
import com.gcxy.domain.BatchCourseWare;
import com.gcxy.domain.UserInfo;
import com.gcxy.vo.BatchCouVo;
import com.gcxy.vo.BatchPeoVo;

public interface BatchDao {
	//查询所有数据
   public List<Batch> queryAll();
   //删除数据
   public void delete(int ids);
   //添加数据
   public void save(Batch batch);
   //根据批次名称查询
   public List<Batch> queryName(String batchName);
   
   public List<BatchCourseWare> bcQueryAll();
   public Batch queryBatch(Integer ids);
public List<BatchPeoVo> queryBp(Integer ids);
public void deletePeo(Integer userId, Integer batchId);
public List<BatchPeoVo> queryAddPeo(Integer batchId);
public void batPeoAdd(Integer userId, Integer batchId);
public List<BatchPeoVo> queryBPName(String name, Integer batchId);
public List<BatchCouVo> queryCw(Integer c);
public void deleteCou(Integer cwId, Integer batchId);
public List<BatchCouVo> queryBCName(String na, Integer batchId);
public List<BatchCouVo> queryAddCou(Integer batchId);
public void batCouAdd(Integer cwId, Integer batchId);
}
