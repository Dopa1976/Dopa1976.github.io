package com.gcxy.domain;
/*
 * 角色权限类
 */
public class RoleControl {
   private Integer id;//角色权限id
   private Role role;//角色
   private Menu menu;//菜单

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

public Menu getMenu() {
	return menu;
}

public void setMenu(Menu menu) {
	this.menu = menu;
}


   
   
}
