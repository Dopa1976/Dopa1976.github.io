package com.gcxy.domain;

import java.util.HashSet;
import java.util.Set;

/*
 * 用户类
 */
public class UserInfo {
   private Integer id;//用户id
   private String userAccount;//账号
   private String userPassword;//密码
   private String status;//用户合法性
   private Set<Score> scores=new HashSet<Score>();//成绩
   private Set<UserRole> userRoles =new HashSet<UserRole>();//用户角色
   private Set<LeaRecord> leaRecords=new HashSet<LeaRecord>();//学习记录 
   
   
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
public String getUserPassword() {
	return userPassword;
}
public void setUserPassword(String userPassword) {
	this.userPassword = userPassword;
}
public Set<Score> getScores() {
	return scores;
}
public void setScores(Set<Score> scores) {
	this.scores = scores;
}
public Set<UserRole> getUserRoles() {
	return userRoles;
}
public void setUserRoles(Set<UserRole> userRoles) {
	this.userRoles = userRoles;
}
public Set<LeaRecord> getLeaRecords() {
	return leaRecords;
}
public void setLeaRecords(Set<LeaRecord> leaRecords) {
	this.leaRecords = leaRecords;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}

   
   
   
}
