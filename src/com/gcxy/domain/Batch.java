package com.gcxy.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
/*
 * 学习批次类
 */
public class Batch {
   private Integer id;//学习批次id
   private String batchName;//批次名称
   private Date starTime;//开始时间
   private Date endTime;//结束时间
   private int score;//资格分数
   private Set<Score> scores=new HashSet<Score>();//成绩
   private Set<LeaRecord> leaRecords=new HashSet<LeaRecord>();//学习记录
   private Set<BatchCourseWare> batchCoursewares=new HashSet<BatchCourseWare>();//批次课件

   
   
   

public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getBatchName() {
	return batchName;
}
public void setBatchName(String batchName) {
	this.batchName = batchName;
}
public Date getStarTime() {
	return starTime;
}
public void setStarTime(Date starTime) {
	this.starTime = starTime;
}
public Date getEndTime() {
	return endTime;
}
public void setEndTime(Date endTime) {
	this.endTime = endTime;
}
public int getScore() {
	return score;
}
public void setScore(int score) {
	this.score = score;
}
public Set<Score> getScores() {
	return scores;
}
public void setScores(Set<Score> scores) {
	this.scores = scores;
}
public Set<LeaRecord> getLeaRecords() {
	return leaRecords;
}
public void setLeaRecords(Set<LeaRecord> leaRecords) {
	this.leaRecords = leaRecords;
}
public Set<BatchCourseWare> getBatchCoursewares() {
	return batchCoursewares;
}
public void setBatchCoursewares(Set<BatchCourseWare> batchCoursewares) {
	this.batchCoursewares = batchCoursewares;
}

   
   
}
