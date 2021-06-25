/**
 * 
 */
package com.gcxy.vo;

/**
 * @author chengliang
 *
 */
public class UserManagerVo {
private Integer id;
private String roleName;
private String menuName;

public UserManagerVo() {
	
}

public UserManagerVo(Integer id, String roleName, String menuName) {
	super();
	this.id = id;
	this.roleName = roleName;
	this.menuName = menuName;
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
public String getMenuName() {
	return menuName;
}
public void setMenuName(String menuName) {
	this.menuName = menuName;
}



}
