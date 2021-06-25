package com.gcxy.domain;
/*
 *成绩类 
 */
public class Score {
    private Integer id;//成绩id
    private int score;//成绩
    private UserInfo userinfo;//用户
    private Batch batch;//学习批次
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score1) {
		this.score = score1;
	}
	public UserInfo getUserinfo() {
		return userinfo;
	}
	public void setUserinfo(UserInfo userinfo) {
		this.userinfo = userinfo;
	}
	public Batch getBatch() {
		return batch;
	}
	public void setBatch(Batch batch) {
		this.batch = batch;
	}

    
    
    
}
