package com.gcxy.domain;

import java.util.HashSet;
import java.util.Set;

/*
 * 课件类
 */
public class Courseware {
  private Integer id;//课件id
  private String cwName;//名称
  private int cwCredit;//学分
  private String cwAddress;//地址
  private String cwType;//种类
  private Course course;//课程
  private Set<BatchCourseWare> batchCoursewares=new HashSet<BatchCourseWare>();//批次课件
  private Set<LeaRecord> leaRecords=new HashSet<LeaRecord>();//学习记录
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
public Course getCourse() {
	return course;
}
public void setCourse(Course course) {
	this.course = course;
}
public Set<BatchCourseWare> getBatchCoursewares() {
	return batchCoursewares;
}
public void setBatchCoursewares(Set<BatchCourseWare> batchCoursewares) {
	this.batchCoursewares = batchCoursewares;
}
public Set<LeaRecord> getLeaRecords() {
	return leaRecords;
}
public void setLeaRecords(Set<LeaRecord> leaRecords) {
	this.leaRecords = leaRecords;
}


  
}
