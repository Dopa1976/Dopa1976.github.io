/**
 * 
 */
package com.gcxy.action;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.gcxy.domain.Batch;
import com.gcxy.domain.BatchCourseWare;
import com.gcxy.domain.Courseware;
import com.gcxy.domain.LeaRecord;
import com.gcxy.domain.Score;
import com.gcxy.domain.UserInfo;
import com.gcxy.service.BatchUserService;
import com.gcxy.vo.BatchVideoVo;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author chengliang
 *
 */
@Controller("BatchUserAction")
@Scope("prototype")
public class BatchUserAction extends ActionSupport {
	@Autowired
	private BatchUserService batchUserService;
	private List<Batch> batchList;
	private List<Score> scoreList;
	private Integer BatchId;
	private List<LeaRecord> leaList;
	private Integer cw_id;
	private List<Courseware> CoursewareList;
	private Courseware courseware;
	private LeaRecord leaRecord = new LeaRecord();
	private List<BatchVideoVo> lookVideoList = new ArrayList<BatchVideoVo>();

	public String queryBatchByUserId() {
		UserInfo user = (UserInfo) ActionContext.getContext().getSession().get("user");
		scoreList = batchUserService.queryBatch1(user.getId());
		batchList = new ArrayList<Batch>();
		for (int i = 0; i < scoreList.size(); i++) {
			Batch b = scoreList.get(i).getBatch();
			System.out.println(b.getBatchName());
			batchList.add(b);
		}
		return "success";
	}

	public String queryBatchCourseWare() {
		UserInfo user = (UserInfo) ActionContext.getContext().getSession().get("user");
		ActionContext.getContext().getSession().put("bid", BatchId);
		List<BatchCourseWare> list = batchUserService.queryBatchCourseWareByUserId(BatchId);
		List<LeaRecord> LeaRcordList = batchUserService.queryLeaRecordByBatchId(BatchId, user.getId());
		
		List<Courseware> courseware1 = new ArrayList<Courseware>();
		for (int i = 0; i < list.size(); i++) {
			Courseware c = list.get(i).getCourseware();
			courseware1.add(c);
		}
		List<Courseware> courseware2 = new ArrayList<Courseware>();
		for (int i = 0; i < LeaRcordList.size(); i++) {
			Courseware c = LeaRcordList.get(i).getCourseware();
			courseware2.add(c);
		}
		for (Courseware courseware : courseware1) {
			BatchVideoVo batchVideoVo = new BatchVideoVo();
			batchVideoVo.setFinish("0");
			BeanUtils.copyProperties(courseware, batchVideoVo);
			for (Courseware c : courseware2) {
				if (courseware.getId() == c.getId()) {
					batchVideoVo.setFinish("1");
					break;
				}
			}
			lookVideoList.add(batchVideoVo);
		}

		return "success";
	}

	public String innerLook() {
		UserInfo user=(UserInfo) ActionContext.getContext().getSession().get("user");
		CoursewareList=batchUserService.queryCourseware(cw_id);
		courseware=CoursewareList.get(0);
		leaList=batchUserService.queryLeaRecord(BatchId, user.getId(),cw_id);
		leaRecord=new LeaRecord();
		if(leaList.size()>0) {
			leaRecord.setFinish(leaList.get(0).getFinish());
			leaRecord.setPlayTime(leaList.get(0).getPlayTime());
		}else {
			leaRecord.setFinish("0");
			leaRecord.setPlayTime("0");
		}
		return "success";
	}
	
	
	public String lookVideo() throws ParseException {
	System.out.println(leaRecord.getPlayTime());
	UserInfo user=(UserInfo) ActionContext.getContext().getSession().get("user");
	leaList=batchUserService.queryLeaRecord(BatchId, user.getId(),cw_id);
	System.out.println(leaList.size());
	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式	
	String date=df.format(new Date());
    Batch batch=new Batch();
    batch.setId(BatchId);
    
    Courseware courseware=new Courseware();
    courseware.setId(cw_id);
	leaRecord.setTimes(df.parse(date));
	leaRecord.setBatch(batch);
	leaRecord.setCourseware(courseware);
	leaRecord.setUser(user);
	System.out.println("11111");
	
	if(leaList.size()==0) {
		System.out.println("save");
		leaRecord.setFinish("0");
		batchUserService.save(leaRecord);
	}else {
		System.out.println("update");
		leaRecord.setId(leaList.get(0).getId());
		if(leaRecord.getPlayTime().equals(leaRecord.getTotalLength())) {
			System.out.println("完成视频播放111111");
			leaRecord.setFinish("1");
			batchUserService.update(leaRecord);
			System.out.println("执行");
		}else {
			System.out.println("完成视频更新");
		leaRecord.setFinish(leaList.get(0).getFinish());
		batchUserService.update(leaRecord);
		}
	}
	return "success";
	}
	

	public List<Batch> getBatchList() {
		return batchList;
	}

	public void setBatchList(List<Batch> batchList) {
		this.batchList = batchList;
	}

	public List<Score> getScoreList() {
		return scoreList;
	}

	public void setScoreList(List<Score> scoreList) {
		this.scoreList = scoreList;
	}

	public Integer getBatchId() {
		return BatchId;
	}

	public void setBatchId(Integer batchId) {
		BatchId = batchId;
	}

	public List<BatchVideoVo> getLookVideoList() {
		return lookVideoList;
	}

	public void setLookVideoList(List<BatchVideoVo> lookVideoList) {
		this.lookVideoList = lookVideoList;
	}

	public List<LeaRecord> getLeaList() {
		return leaList;
	}

	public void setLeaList(List<LeaRecord> leaList) {
		this.leaList = leaList;
	}

	public Integer getCw_id() {
		return cw_id;
	}

	public void setCw_id(Integer cw_id) {
		this.cw_id = cw_id;
	}

	public List<Courseware> getCoursewareList() {
		return CoursewareList;
	}

	public void setCoursewareList(List<Courseware> coursewareList) {
		CoursewareList = coursewareList;
	}

	public LeaRecord getLeaRecord() {
		return leaRecord;
	}

	public void setLeaRecord(LeaRecord leaRecord) {
		this.leaRecord = leaRecord;
	}

	public Courseware getCourseware() {
		return courseware;
	}

	public void setCourseware(Courseware courseware) {
		this.courseware = courseware;
	}
}