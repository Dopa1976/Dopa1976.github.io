package com.gcxy.vo;

public class scoreManageVo {

	private Integer id;
	private String userAccount;
	private int score;
	private String batchName;

	
	
	public scoreManageVo() {
		super();
	}
	public scoreManageVo(Integer id, String userAccount, int score, String batchName) {
		super();
		this.id = id;
		this.userAccount = userAccount;
		this.score = score;
		this.batchName = batchName;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserAccount() {
		return userAccount;
	}
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getBatchName() {
		return batchName;
	}
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}
	
	
	
	
	
	
}
