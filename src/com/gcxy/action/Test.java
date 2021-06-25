package com.gcxy.action;

import java.io.File;
import java.io.IOException;

import org.apache.struts2.ServletActionContext;
import org.springframework.util.ResourceUtils;

public class Test {

	public static void main(String[] args) throws IOException {
		//获取跟目录
		/*
*/
		String d = ServletActionContext.getServletContext().getRealPath("");
		System.out.println("upload url:"+d);
	}

}
