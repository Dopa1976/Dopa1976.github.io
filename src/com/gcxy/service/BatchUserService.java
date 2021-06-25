package com.gcxy.service;

import java.util.List;

import com.gcxy.domain.BatchCourseWare;
import com.gcxy.domain.Courseware;
import com.gcxy.domain.LeaRecord;
import com.gcxy.domain.Score;

public interface BatchUserService {
List<Score> queryBatch1(int id);
List<BatchCourseWare> queryBatchCourseWareByUserId(int id);
List<LeaRecord> queryLeaRecordByBatchId(int batchId,int UserId);
List<LeaRecord> queryLeaRecord(int batchId,int UserId,int courseWareId);
void save(LeaRecord leaRecord);
void update(LeaRecord leaRecord);
List<Courseware> queryCourseware(int cw_id);
}
