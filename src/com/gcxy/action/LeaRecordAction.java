package com.gcxy.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.gcxy.domain.LeaRecord;
import com.gcxy.service.LeaRecordService;
import com.opensymphony.xwork2.ActionSupport;
@Controller("LeaRecordAction")
@Scope("prototype")
public class LeaRecordAction extends ActionSupport {
   private LeaRecord leaRecord;
   private Integer ids;
   private String userAccount;
   @Autowired
   private LeaRecordService leaRecordService;
   private List<LeaRecord>  leaRecordList;
   
   public String LeaqueryAll(){
	   leaRecordList=leaRecordService.LeaqueryAll();
	   return SUCCESS;
   }
   public String Leadelete(){
	  leaRecordService.delete(ids);
	   return SUCCESS;
   }
   public String userqueryName(){
	    leaRecordList=leaRecordService.userqueryName(userAccount);
	   return SUCCESS;
   }
  

public LeaRecord getLeaRecord() {
	return leaRecord;
}

public void setLeaRecord(LeaRecord leaRecord) {
	this.leaRecord = leaRecord;
}

public LeaRecordService getLeaRecordService() {
	return leaRecordService;
}

public void setLeaRecordService(LeaRecordService leaRecordService) {
	this.leaRecordService = leaRecordService;
}


public List<LeaRecord> getLeaRecordList() {
	return leaRecordList;
}


public void setLeaRecordList(List<LeaRecord	> leaRecordList) {
	this.leaRecordList = leaRecordList;
}
public Integer getIds() {
	return ids;
}
public void setIds(Integer ids) {
	this.ids = ids;
}
public String getUserAccount() {
	return userAccount;
}
public void setUserAccount(String userAccount) {
	this.userAccount = userAccount;
}



   
   
}
