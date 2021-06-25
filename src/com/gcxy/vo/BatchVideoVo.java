package com.gcxy.vo;


public class BatchVideoVo {
	private Integer id;// 课件id
	private String cwName;// 名称
	private int cwCredit;// 学分
	private String cwAddress;// 地址
	private String cwType;// 种类
	private String finish;//完成情况
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public String getCwAddress() {
		return cwAddress;
	}
	public void setCwAddress(String cwAddress) {
		this.cwAddress = cwAddress;
	}
	public String getCwType() {
		return cwType;
	}
	public void setCwType(String cwType) {
		this.cwType = cwType;
	}
	public String getFinish() {
		return finish;
	}
	public void setFinish(String finish) {
		this.finish = finish;
	}
	
	
}
