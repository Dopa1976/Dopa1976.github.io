package com.gcxy.dwr;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.gcxy.domain.UserInfo;
import com.gcxy.service.LoginSevice;

public class UserNameExists {
	@Autowired
	private LoginSevice loginservice;
	private List<UserInfo> list;
	public boolean hasName(String userName){
		ArrayList<String> names = new ArrayList<String>();
		names.add("admin");
		if(names.contains(userName)){
			return true;
		}else{
			return false;
		}
		}
		
}
