/**
 * 
 */
package com.gcxy.action;

import com.gcxy.domain.UserInfo;
import com.opensymphony.xwork2.ActionContext;

/**
 * @author chengliang
 *
 */
public class ActionValidate {
public Boolean ValidateSession() {
	UserInfo user=(UserInfo) ActionContext.getContext().getSession().get("user");
     if(user==null) {
    	 return false;
     }else {
    	 return true;
     }
}
}
