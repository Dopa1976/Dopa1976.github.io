package com.gcxy.vo;

import com.gcxy.domain.UserRole;

public class UserRoleVo {
private Integer id;
private String roleName;
private String userAccount;




public UserRoleVo(){
	
}
public UserRoleVo(Integer id,String roleName ,String userAccount){
	super();
	this.id=id;
	this.roleName=roleName;
	this.userAccount=userAccount;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getRoleName() {
	return roleName;
}
public void setRoleName(String roleName) {
	this.roleName = roleName;
}

public String getUserAccount() {
	return userAccount;
}
public void setUserAccount(String userAccount) {
	this.userAccount = userAccount;
}




}
