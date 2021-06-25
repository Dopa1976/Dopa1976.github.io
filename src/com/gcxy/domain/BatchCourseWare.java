package com.gcxy.domain;
/**
 * 批次课件
 * @author asus-pc
 *
 */
public class BatchCourseWare {
private Integer id;//批次课件id
private Courseware courseware;//课件id
private Batch batch;//学习批次id

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}



public Courseware getCourseware() {
	return courseware;
}

public void setCourseware(Courseware courseware) {
	this.courseware = courseware;
}



public Batch getBatch() {
	return batch;
}

public void setBatch(Batch batch) {
	this.batch = batch;
}

}
