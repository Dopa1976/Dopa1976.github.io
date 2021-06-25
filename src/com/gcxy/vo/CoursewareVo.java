package com.gcxy.vo;

public class CoursewareVo {
	 private Integer id;//课件id
	  private String cwName;//名称
	  private int cwCredit;//学分
	  private String cwAddress;//地址
	  private String cwType;//种类
	  private Integer courseId;//课程id
	  private String courseName;//课程名称
	  
	  
	  
	public CoursewareVo() {
		super();
	}

	public CoursewareVo(Integer id, String cwName, int cwCredit,
			String cwAddress, String cwType, Integer courseId, String courseName) {
		super();
		this.id = id;
		this.cwName = cwName;
		this.cwCredit = cwCredit;
		this.cwAddress = cwAddress;
		this.cwType = cwType;
		this.courseId = courseId;
		this.courseName = courseName;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCwName() {
		return cwName;
	}
	public void setCwName(String cwName) {
		this.cwName = cwName;
	}
	public int getCwCredit() {
		return cwCredit;
	}
	public void setCwCredit(int cwCredit) {
		this.cwCredit = cwCredit;
	}
	public String getCwAddress() {
		return cwAddress;
	}
	public void setCwAddress(String cwAddress) {
		this.cwAddress = cwAddress;
	}
	public String getCwType() {
		return cwType;
	}
	public void setCwType(String cwType) {
		this.cwType = cwType;
	}
	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	  
	  
	  
}
