package com.gcxy.domain;


import java.util.List;

/**
 * 菜单类
 * @author 文
 *
 */
public class Menu {
private Integer id;//菜单id
private Integer sortNo;//排序号
private String menuName;//名称
private String address;//url地址
private Menu menu;//菜单id
private List<Menu> children;
private List<RoleControl> roleControls;//角色权限
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public Integer getSortNo() {
	return sortNo;
}
public void setSortNo(Integer sortNo) {
	this.sortNo = sortNo;
}
public String getMenuName() {
	return menuName;
}
public void setMenuName(String menuName) {
	this.menuName = menuName;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Menu getMenu() {
	return menu;
}
public void setMenu(Menu menu) {
	this.menu = menu;
}
public List<Menu> getChildren() {
	return children;
}
public void setChildren(List<Menu> children) {
	this.children = children;
}
public List<RoleControl> getRoleControls() {
	return roleControls;
}
public void setRoleControls(List<RoleControl> roleControls) {
	this.roleControls = roleControls;
}



	
	
}
