/**
 * 
 */
package com.gcxy.action;

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.gcxy.service.UserInfoManagerService;
import com.gcxy.vo.UserInfoManagerVo;

/**
 * @author chengliang
 *
 */
@Controller("UserInfoManagerAction")
@Scope("prototype")
public class UserInfoManagerAction {
 @Autowired
 private UserInfoManagerService userInfoManagerService;
 private List<UserInfoManagerVo> userInfoList;
 private String name;
 private String menuName;
 public String queryAll() {
	 userInfoList=userInfoManagerService.queryUserInfo();
	 return "success";
 }
 public String queryBuCondition() {
	 String name = null;
		try {
			name = java.net.URLDecoder.decode(menuName, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			
			e.printStackTrace();
		}
	 userInfoList=userInfoManagerService.queryByCondition(name);
	 return "success";
 }

public List<UserInfoManagerVo> getUserInfoList() {
	return userInfoList;
}

public void setUserInfoList(List<UserInfoManagerVo> userInfoList) {
	this.userInfoList = userInfoList;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMenuName() {
	return menuName;
}
public void setMenuName(String menuName) {
	this.menuName = menuName;
}


}
