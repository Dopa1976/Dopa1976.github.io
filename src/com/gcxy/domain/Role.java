package com.gcxy.domain;

import java.util.HashSet;
import java.util.Set;

/*
 * 角色类
 */
public class Role {
   private Integer id;//角色id
   private String roleName;//角色名称
   private UserInfo userinfo;//用户
   private Batch batch;//学习批次
   private Set<UserRole> userRoles=new HashSet<UserRole>();//用户角色
   private Set<RoleControl> roleControls=new HashSet<RoleControl>();//角色权限
   
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
public UserInfo getUserinfo() {
	return userinfo;
}
public void setUserinfo(UserInfo userinfo) {
	this.userinfo = userinfo;
}
public Batch getBatch() {
	return batch;
}
public void setBatch(Batch batch) {
	this.batch = batch;
}
public Set<UserRole> getUserRoles() {
	return userRoles;
}
public void setUserRoles(Set<UserRole> userRoles) {
	this.userRoles = userRoles;
}
public Set<RoleControl> getRoleControls() {
	return roleControls;
}
public void setRoleControls(Set<RoleControl> roleControls) {
	this.roleControls = roleControls;
}

   
   
}
