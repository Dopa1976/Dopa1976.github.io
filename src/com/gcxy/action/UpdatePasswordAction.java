package com.gcxy.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.gcxy.dao.UpdatePasswordDao;
import com.gcxy.domain.UserInfo;
import com.gcxy.service.UpdatePasswordService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
@Controller("UpdatePasswordAction")
@Scope("prototype")
public class UpdatePasswordAction extends ActionSupport {
@Autowired
private UpdatePasswordService updatePasswordService;
private UserInfo userInfo;
private Integer id;
private List<UserInfo> userlist;
 

public String updatePassword() {
	
	UserInfo user = updatePasswordService.updatePassword(userInfo);
	ActionContext.getContext().getSession().put("user", user);
	return SUCCESS;

}
public String querypasswordById(){
	/*UserInfo user = (UserInfo) ActionContext.getContext().getSession().get("user");
	userInfo=updatePasswordService.querypasswordByis(user.getId());*/
	
	return SUCCESS;
}

public UserInfo getUserInfo() {
	return userInfo;
}


public void setUserInfo(UserInfo userInfo) {
	this.userInfo = userInfo;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public List<UserInfo> getUserlist() {
	return userlist;
}
public void setUserlist(List<UserInfo> userlist) {
	this.userlist = userlist;
}




}