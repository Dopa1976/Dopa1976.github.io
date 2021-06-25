package com.gcxy.action;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.gcxy.domain.Score;
import com.gcxy.domain.UserInfo;
import com.gcxy.service.QueryScoreService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@Controller("QueryScorceAction")
@Scope("prototype")
public class QueryScorceAction extends ActionSupport {
	@Autowired
	private QueryScoreService queryScoreService;
	private String userAccount;
	public List<UserInfo> userInfolist;
	private UserInfo userinfo;
	private Set<Score> scores=new HashSet<Score>();//成绩
	private List<Score> scores2;
	
	
	
	public List<Score> getScores2() {
		return scores2;
	}
	public void setScores2(List<Score> scores2) {
		this.scores2 = scores2;
	}
	public String queryScorce(){
		UserInfo user = (UserInfo) ActionContext.getContext().getSession().get("user");
		System.out.println(user.getId()+"========");
		scores2=queryScoreService.qUserInfo(user.getId());
		return SUCCESS;
	}
	public String getUserAccount() {
		return userAccount;
	}
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}
	public Set<Score> getScores() {
		return scores;
	}
	public void setScores(Set<Score> scores) {
		this.scores = scores;
	}
	public List<UserInfo> getUserInfolist() {
		return userInfolist;
	}
	public void setUserInfolist(List<UserInfo> userInfolist) {
		this.userInfolist = userInfolist;
	}
	public UserInfo getUserinfo() {
		return userinfo;
	}
	public void setUserinfo(UserInfo userinfo) {
		this.userinfo = userinfo;
	}
	
	
	
	
	
}
