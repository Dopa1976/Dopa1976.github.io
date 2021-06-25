package com.gcxy.vo;

public class BatchCouVo {
  private Integer batchId;
  private Integer cwId;
  private String cwName;
  private int cwCredit;
  private String cwType;
  
  public BatchCouVo() {
		super();
	}
  
public BatchCouVo(Integer cwId, String cwName, int cwCredit, String cwType) {
	super();
	this.cwId = cwId;
	this.cwName = cwName;
	this.cwCredit = cwCredit;
	this.cwType = cwType;
}

public BatchCouVo(Integer batchId, Integer cwId, String cwName, int cwCredit,
		String cwType) {
	super();
	this.batchId = batchId;
	this.cwId = cwId;
	this.cwName = cwName;
	this.cwCredit = cwCredit;
	this.cwType = cwType;
}
public Integer getBatchId() {
	return batchId;
}
public void setBatchId(Integer batchId) {
	this.batchId = batchId;
}
public Integer getCwId() {
	return cwId;
}
public void setCwId(Integer cwId) {
	this.cwId = cwId;
}
public String getCwName() {
	return cwName;
}
public void setCwName(String cwName) {
	this.cwName = cwName;
}
public int getCwCredit() {
	return cwCredit;
}
public void setCwCredit(int cwCredit) {
	this.cwCredit = cwCredit;
}
public String getCwType() {
	return cwType;
}
public void setCwType(String cwType) {
	this.cwType = cwType;
}
  
  
}
