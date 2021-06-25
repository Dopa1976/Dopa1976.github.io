/**
 * 
 */
package com.gcxy.action;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.gcxy.domain.Menu;
import com.gcxy.domain.UserInfo;
import com.gcxy.service.LoginSevice;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author chengliang
 *
 */
@Controller("RegisterAction")
@Scope("prototype")
public class RegisterLoginAction extends ActionSupport {
	private String userAccount;
	private String password;
	private String remeadpassword;
	private UserInfo user;
	private List<UserInfo> loginList;
	private List<Menu> menu;
	@Autowired
	private LoginSevice loginservice;

	public String register() {
		if (userAccount == null) {
			return "index";

		} else if (password.equals(remeadpassword) == true && password != null && password.length() >= 6
				&& loginservice.queryRegister(userAccount).size() == 0) {
			UserInfo user = new UserInfo();
			user.setUserAccount(userAccount);
			user.setUserPassword(password);
			loginservice.test(user);
			return "success";
		} else {
			return "fail";
		}

	}

	public String login() {
		loginList = loginservice.login(user);
		if (loginList.size() > 0 && loginList.get(0).getStatus() != null) {// 判断是否有账户，并且用户是否合法
			user = loginList.get(0);
			ActionContext.getContext().getSession().put("user", user);

			menu = loginservice.selectUserMenu(user.getId());// 调用登陆方法，通过登陆的ID去查用户权限
			ActionContext.getContext().getSession().put("menu", menu);
			return "success";
		} else {
			return "fail";
		}

	}

	// 注销
	public String cancel() {
		ActionContext.getContext().getSession().remove("user");
		ActionContext.getContext().getSession().remove("menu");
		return "cancel";
	}

	public String getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRemeadpassword() {
		return remeadpassword;
	}

	public void setRemeadpassword(String remeadpassword) {
		this.remeadpassword = remeadpassword;
	}

	public UserInfo getUser() {
		return user;
	}

	public void setUser(UserInfo user) {
		this.user = user;
	}

	public List<UserInfo> getLoginList() {
		return loginList;
	}

	public void setLoginList(List<UserInfo> loginList) {
		this.loginList = loginList;
	}

	public List<Menu> getMenu() {
		return menu;
	}

	public void setMenu(List<Menu> menu) {
		this.menu = menu;
	}

}
