package com.gcxy.action;

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;


import com.gcxy.domain.Menu;
import com.gcxy.domain.Role;

import com.gcxy.service.RoleService;
import com.opensymphony.xwork2.ActionSupport;

@Controller("RoleAction")
@Scope("prototype")
public class RoleAction extends ActionSupport {
private  String roleName;
private Role role;
private Integer ids;
private List<Role> rolelist;

@Autowired
private  RoleService roleservice;

private List<Menu> menu;

//添加
public String addRole(){
	
	
	roleservice.addRole(role);
	return SUCCESS;
	
	
}
//删除
public String deleteRole(){
	roleservice.deleteRole(ids);
	return SUCCESS;
}
//修改查询
public String roleModify() {
	role = roleservice.roleModify(ids);
	return SUCCESS;
}
//修改
public String updateRole(){
	roleservice.updateRole(role);
	return SUCCESS;
	
}
//查询所有数据
public String queryrole(){
	ActionValidate session=new ActionValidate();
	if(session.ValidateSession()) {
	rolelist=roleservice.query();
	    return SUCCESS;
}else{
		
		return "index";
	}
	
}
//模糊查询
public String queryByname(){
	 String name = null;
		try {
			name = java.net.URLDecoder.decode(roleName, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			
			e.printStackTrace();
		}
	rolelist=roleservice.queryByName(name);
	
	   return SUCCESS;
}





public String getRoleName() {
	return roleName;
}
public void setRoleName(String roleName) {
	this.roleName = roleName;
}
public Role getRole() {
	return role;
}
public void setRole(Role role) {
	this.role = role;
}

public List<Role> getRolelist() {
	return rolelist;
}
public void setRolelist(List<Role> rolelist) {
	this.rolelist = rolelist;
}
public Integer getIds() {
	return ids;
}
public void setIds(Integer ids) {
	this.ids = ids;
}
public List<Menu> getMenu() {
	return menu;
}
public void setMenu(List<Menu> menu) {
	this.menu = menu;
}






}
