/**
 * 
 */
package com.gcxy.action;

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.gcxy.domain.UserInfo;
import com.gcxy.service.UserInfoService;

/**
 * @author chengliang
 *
 */
@Controller("userInfoAction")
@Scope("prototype")
public class UserInfoAction {
@Autowired
private UserInfoService userInfoService;
private List<UserInfo> userInfoList;
private String menuName;
private Integer id;
private Integer id1;

public String queryAllUserInfo() {
	userInfoList=userInfoService.queryAll();
	return "success";
}
public String queryBuCondition() {
	 String name = null;
		try {
			name = java.net.URLDecoder.decode(menuName, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			
			e.printStackTrace();
		}
	 userInfoList=userInfoService.queryByCondition(name);
	 return "success";
}
public String delete() {
	userInfoService.delete(id);
	return "success";
}
public String auditing() {
	userInfoService.updateUserInfoLogin(id1);
	
	return "success";
}

public List<UserInfo> getUserInfoList() {
	return userInfoList;
}

public void setUserInfoList(List<UserInfo> userInfoList) {
	this.userInfoList = userInfoList;
}
public String getMenuName() {
	return menuName;
}
public void setMenuName(String menuName) {
	this.menuName = menuName;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public Integer getId1() {
	return id1;
}
public void setId1(Integer id1) {
	this.id1 = id1;
}

}
