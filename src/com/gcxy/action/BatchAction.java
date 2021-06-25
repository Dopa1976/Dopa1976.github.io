package com.gcxy.action;

import java.io.UnsupportedEncodingException;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.gcxy.domain.Batch;
import com.gcxy.domain.BatchCourseWare;
import com.gcxy.domain.UserInfo;
import com.gcxy.service.BatchService;
import com.gcxy.vo.BatchCouVo;
import com.gcxy.vo.BatchPeoVo;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@Controller("BatchAction")
@Scope("prototype")
public class BatchAction extends ActionSupport {
	private Batch batch;
	private Integer ids;
	private String batchName;
	private String name;
	@Autowired
	private BatchService batchService;
	private List<Batch> batchList;
	private List<UserInfo> userList;
	private List<BatchPeoVo> bpList;
	private Integer batchId;
	private Integer userId;
        private Integer peo=0;
	private List<BatchCourseWare> batchCwList;
	private List<BatchCouVo> cwList;
	private Integer cwId;
	private Integer cwo=0;


	// 查询所有批次课件
	public String bcQueryAll() {
		batchCwList = batchService.bcQueryAll();
		return SUCCESS;
	}

	// 查询批次人员
	public String queryBp() {
		if(peo.equals(1)) {
			ActionContext.getContext().getSession().put("batchID",ids);
		}
		Integer a= (Integer) ActionContext.getContext().getSession().get("batchID");
		bpList = batchService.queryBp(a);
		return SUCCESS;
	}
	//删除批次人员
	public String deletePeo() {
		batchService.deletePeo(userId,batchId);
		return SUCCESS;
	}
	//查询可以被添加批次的人员
	public String queryAddPeo() {
		
		bpList = batchService.queryAddPeo(batchId);
		return SUCCESS;
	}
	//添加批次人员
	public String batPeoAdd() {
		batchService.batPeoAdd(userId,batchId);
		return SUCCESS;
	}
	//模糊查询批次人员
	public String queryBPName() {
		batchId = (Integer) ActionContext.getContext().getSession().get("batchID");
	   bpList = batchService.queryBPName(name,batchId);
	   return SUCCESS;
	}
	// 查询批次课件
		public String queryBc() {
			if(cwo.equals(1)){
				ActionContext.getContext().getSession().put("ba", ids);
			}
		    Integer c=(Integer) ActionContext.getContext().getSession().get("ba");
			cwList=batchService.queryCw(c);
			return SUCCESS;
		}
		//删除批次课件
		public String deleteCou(){
			batchService.deleteCou(cwId,batchId);
			return SUCCESS;
			
		}
		//模糊查询批次课件
		public String queryBCName(){
			 String na = null;
		 		try {
		 			 na = java.net.URLDecoder.decode(name, "UTF-8");
		 		} catch (UnsupportedEncodingException e) {
		             e.printStackTrace();
		 		}
			cwList=batchService.queryBCName(na,batchId);
			return SUCCESS;
		}
		//查询可以添加课件
		public String queryAddCou(){
			cwList=batchService.queryAddCou(batchId);
			return SUCCESS;
		}
		//添加批次课件
		public String batCouAdd(){
			batchService.batCouAdd(cwId,batchId);
			return SUCCESS;
		}


	// 查询所有数据
	public String BaqueryAll() {
		batchList = batchService.queryAll();
		return SUCCESS;
	}

	// 删除数据
	public String Badelete() {
		batchService.delete(ids);
		return SUCCESS;
	}

	// 添加数据
	public String Baadd() {
		batchService.save(batch);
		return SUCCESS;
	}

	// 根据名称查询
	public String BaqueryName() {
		String name = null;
		try {
			name = java.net.URLDecoder.decode(batchName, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		batchList = batchService.queryName(name);
		return SUCCESS;
	}

	public Batch getBatch() {
		return batch;
	}

	public void setBatch(Batch batch) {
		this.batch = batch;
	}

	public Integer getIds() {
		return ids;
	}

	public void setIds(Integer ids) {
		this.ids = ids;
	}

	public List<Batch> getBatchList() {
		return batchList;
	}

	public void setBatchList(List<Batch> batchList) {
		this.batchList = batchList;
	}

	public String getBatchName() {
		return batchName;
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

	public List<BatchCourseWare> getBatchCwList() {
		return batchCwList;
	}

	public void setBatchCwList(List<BatchCourseWare> batchCwList) {
		this.batchCwList = batchCwList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<UserInfo> getUserList() {
		return userList;
	}

	public void setUserList(List<UserInfo> userList) {
		this.userList = userList;
	}

	public Integer getBatchId() {
		return batchId;
	}

	public void setBatchId(Integer batchId) {
		this.batchId = batchId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public List<BatchPeoVo> getBpList() {
		return bpList;
	}

	public void setBpList(List<BatchPeoVo> bpList) {
		this.bpList = bpList;
	}

	public Integer getPeo() {
		return peo;
	}

	public void setPeo(Integer peo) {
		this.peo = peo;
	}

	public List<BatchCouVo> getCwList() {
		return cwList;
	}

	public void setCwList(List<BatchCouVo> cwList) {
		this.cwList = cwList;
	}

	public Integer getCwId() {
		return cwId;
	}

	public void setCwId(Integer cwId) {
		this.cwId = cwId;
	}

	public Integer getCwo() {
		return cwo;
	}

	public void setCwo(Integer cwo) {
		this.cwo = cwo;
	}

}
