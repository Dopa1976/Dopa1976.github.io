package com.gcxy.domain;
/*
 * 用户角色类
 */
public class UserRole {
   private Integer id;//用户角色id
   private Role role;//角色
   private UserInfo userinfo;//用户
   private String roleName;
   

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public Role getRole() {
	return role;
}

public void setRole(Role role) {
	this.role = role;
}

public UserInfo getUserinfo() {
	return userinfo;
}

public void setUserinfo(UserInfo userinfo) {
	this.userinfo = userinfo;
}

public String getRoleName() {
	return roleName;
}

public void setRoleName(String roleName) {
	this.roleName = roleName;
}
   
   
}
