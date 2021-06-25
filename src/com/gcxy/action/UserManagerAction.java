/**
 * 
 */
package com.gcxy.action;

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.gcxy.domain.Menu;
import com.gcxy.domain.Role;
import com.gcxy.domain.RoleControl;
import com.gcxy.domain.UserInfo;
import com.gcxy.service.UserManagerService;
import com.gcxy.vo.UserManagerVo;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author chengliang
 *
 */
@Controller("UserManagerAction")
@Scope("prototype")
public class UserManagerAction extends ActionSupport {
	@Autowired
	private UserManagerService userManagerService;
	private List<UserManagerVo> userManagerList;
	private String menuName;
	private Menu menu;
	private Integer ids;
	private Integer roleId;
	private List<Menu> menuList;
	private Integer UserId;
	private List<UserInfo> userList;
	private UserInfo userInfo;
	private List<Role> roleList;

	public String queryUserManager() {
		ActionValidate session=new ActionValidate();
		if(session.ValidateSession()) {
		userManagerList=userManagerService.queryAll();
		userList=userManagerService.queryUserAll();
		return "success";
		}else {
			return "index";
		}
	}
	public String serch() {
		 String name = null;
			try {
				name = java.net.URLDecoder.decode(menuName, "UTF-8");
			} catch (UnsupportedEncodingException e) {
				
				e.printStackTrace();
			}
			userManagerList = userManagerService.queryByCondition(name);		 
		return "success";
	}
	public String deleteById() {
		userManagerService.delete(ids);
		return "success";
	}

	public String serchMenu() {
		ActionContext.getContext().getSession().put("roleID", ids);
		menuList=userManagerService.queryByUserId(ids);
	    	
		return "success";
	}
	public String addUserManager() {
		roleId = (Integer) ActionContext.getContext().getSession().get("roleID");
		userManagerService.addUserManager(roleId,ids);
		
		return "success";
	}
	public String quertAllRole() {
		roleList=userManagerService.queryAllRole();
		return "success";
	}
	public List<UserManagerVo> getUserManagerList() {
		return userManagerList;
	}

	public void setUserManagerList(List<UserManagerVo> userManagerList) {
		this.userManagerList = userManagerList;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public Menu getMenu() {
		return menu;
	}
	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	public Integer getIds() {
		return ids;
	}
	public void setIds(Integer ids) {
		this.ids = ids;
	}
	public List<Menu> getMenuList() {
		return menuList;
	}
	public void setMenuList(List<Menu> menuList) {
		this.menuList = menuList;
	}
	public Integer getUserId() {
		return UserId;
	}
	public void setUserId(Integer userId) {
		UserId = userId;
	}
	public List<UserInfo> getUserList() {
		return userList;
	}
	public void setUserList(List<UserInfo> userList) {
		this.userList = userList;
	}
	public UserInfo getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	public List<Role> getRoleList() {
		return roleList;
	}
	public void setRoleList(List<Role> roleList) {
		this.roleList = roleList;
	}
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	
	
	
}