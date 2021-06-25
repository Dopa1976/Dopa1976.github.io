package com.gcxy.dao;

import java.util.List;

import com.gcxy.domain.LeaRecord;
import com.gcxy.domain.UserInfo;



public interface LeaRecordDao {
    public List<LeaRecord>  LeaqueryAll();
    public void delete(int ids);
    public List<LeaRecord> userqueryName(String userAccount);
}
