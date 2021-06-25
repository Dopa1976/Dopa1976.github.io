package com.gcxy.service;

import java.util.List;

import com.gcxy.domain.LeaRecord;



public interface LeaRecordService {
	public List<LeaRecord>  LeaqueryAll();
	public void delete(int ids);
	public List<LeaRecord> userqueryName(String userAccount);
}
