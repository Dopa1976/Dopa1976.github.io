package com.gcxy.vo;

public class BatchPeoVo {
    private Integer userId;
    private Integer batchId;
    private String  userAccount;
    private String  status;
   
    
	public BatchPeoVo() {
		super();
	}
	public BatchPeoVo(Integer userId,  String userAccount, String status) {
		super();
		this.userId = userId;		
		this.userAccount = userAccount;
		this.status = status;
	}
	public BatchPeoVo(Integer userId, Integer batchId, String userAccount, String status) {
		super();
		this.userId = userId;
		this.batchId = batchId;
		this.userAccount = userAccount;
		this.status = status;
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
	
	public String getUserAccount() {
		return userAccount;
	}
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
    
}
