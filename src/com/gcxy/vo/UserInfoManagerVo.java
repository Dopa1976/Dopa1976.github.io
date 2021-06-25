/**
 * 
 */
package com.gcxy.vo;

/**
 * @author chengliang
 *
 */
public class UserInfoManagerVo {
private Integer id;
private String userAccount;//账号
private String userPassword;//密码
private String status;//用户合法性
private String roleName;//角色名称

public UserInfoManagerVo() {
}
public UserInfoManagerVo(Integer id, String userAccount, String userPassword, String status, String roleName) {
	this.id = id;
	this.userAccount = userAccount;
	this.userPassword = userPassword;
	this.status = status;
	this.roleName = roleName;
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
public String getUserPassword() {
	return userPassword;
}
public void setUserPassword(String userPassword) {
	this.userPassword = userPassword;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getRoleName() {
	return roleName;
}
public void setRoleName(String roleName) {
	this.roleName = roleName;
}



}
