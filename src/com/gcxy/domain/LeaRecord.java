package com.gcxy.domain;
/**
 * 学习记录
 * 
 */
import java.util.Date;


public class LeaRecord {
private Integer id; //学习记录id
private String playTime;//播放时间
private Date times; //时间
private String totalLength;//总时长
private String finish;//是否学完（0：未完成，1：已完成）
private UserInfo user;//用户id
private Batch batch;//学习批次id
private Courseware courseware;//课件id
private Integer cwCredit;//学分

public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getPlayTime() {
	return playTime;
}
public void setPlayTime(String playTime) {
	this.playTime = playTime;
}
public Date getTimes() {
	return times;
}
public void setTimes(Date times) {
	this.times = times;
}
public String getTotalLength() {
	return totalLength;
}
public void setTotalLength(String totalLength) {
	this.totalLength = totalLength;
}
public String getFinish() {
	return finish;
}
public void setFinish(String finish) {
	this.finish = finish;
}
public UserInfo getUser() {
	return user;
}
public void setUser(UserInfo user) {
	this.user = user;
}
public Batch getBatch() {
	return batch;
}
public void setBatch(Batch batch) {
	this.batch = batch;
}
public Courseware getCourseware() {
	return courseware;
}
public void setCourseware(Courseware courseware) {
	this.courseware = courseware;
}
public Integer getCwCredit() {
	return cwCredit;
}
public void setCwCredit(Integer cwCredit) {
	this.cwCredit = cwCredit;
}

}
