package com.gcxy.action;

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.gcxy.dao.UserRoledao;
import com.gcxy.domain.Role;
import com.gcxy.domain.UserInfo;
import com.gcxy.domain.UserRole;
import com.gcxy.service.UserRoleService;
import com.gcxy.vo.UserRoleVo;
import com.opensymphony.xwork2.ActionSupport;

@Controller("UserRoleAction")
@Scope("prototype")
public class UserRoleAction extends ActionSupport {
	@Autowired
    private UserRoleService userRoleService;
	private List<UserRoleVo> userRoleVolist;
	private Integer ids;
	private UserRole userRole;
	private UserInfo userInfo;
	private String roleName;
	private String userAccount;
	private List<Role> roleList;
	private List<UserInfo> userInfoList;
	//角色id
		private int roleId;
	//用户id
		private int userId;
	
	
	public String queryUserRoleAll(){
		/* String name = null;
			try {
				name = java.net.URLDecoder.decode(roleName, "UTF-8");
			} catch (UnsupportedEncodingException e) {
				
				e.printStackTrace();
			}*/
			userRoleVolist=userRoleService.queryUserRoleAll();
			return SUCCESS;
	}
	public String queryByName(){
		String name = null;
		try {
			name = java.net.URLDecoder.decode(roleName, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			
			e.printStackTrace();
		}
		userRoleVolist=userRoleService.queryByName(name);
		
		return SUCCESS;	
	}
	
	public String deleteById(){
		
userRoleService.delete(ids);
		return SUCCESS;
	}
	
	public String addUserRole(){
		
	UserRole  userRole=new UserRole();
	userRole.setUserinfo(userRoleService.queryUserById(userId).get(0));
	userRole.setRole(userRoleService.queryRoleById(roleId).get(0));
		userRoleService.addUserRole(userRole);
		return SUCCESS;
	}
	public String addqueryUserRole(){
		userInfoList=userRoleService.qUserInfos();
		roleList=userRoleService.queryAllRole();
		return SUCCESS;
	};
	
	public List<UserRoleVo> getUserRoleVolist() {
		return userRoleVolist;
	}
	public void setUserRoleVolist(List<UserRoleVo> userRoleVolist) {
		this.userRoleVolist = userRoleVolist;
	}
	public Integer getIds() {
		return ids;
	}
	public void setIds(Integer ids) {
		this.ids = ids;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	
	public UserInfo getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	public UserRole getUserRole() {
		return userRole;
	}
	public void setUserRole(UserRole userRole) {
		this.userRole = userRole;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public List<Role> getRoleList() {
		return roleList;
	}
	public void setRoleList(List<Role> roleList) {
		this.roleList = roleList;
	}
	public List<UserInfo> getUserInfoList() {
		return userInfoList;
	}
	public void setUserInfoList(List<UserInfo> userInfoList) {
		this.userInfoList = userInfoList;
	}
	public String getUserAccount() {
		return userAccount;
	}
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}
	
	
	
	
	
	
	
}
