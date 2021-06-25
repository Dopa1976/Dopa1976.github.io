package com.gcxy.action;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.gcxy.domain.Course;
import com.gcxy.domain.Courseware;
import com.gcxy.service.CourseService;
import com.gcxy.service.CoursewareService;
import com.opensymphony.xwork2.ActionSupport;
@Controller("CoursewareAction")
@Scope("prototype")
public class CoursewareAction extends ActionSupport {
    private Courseware courseware;
    private Integer ids;
    private String cwName;
    private String coursename;
    @Autowired
    private CoursewareService coursewareService;
    @Autowired
    private CourseService courseService;
    private List<Courseware> coursewareList;
    private List<Course> courseList;
    private Integer courseId;
    
    private File upload;//上传的文件
    private String uploadFileName;//文件名
    private String uploadContentType;//文件类型
    
    //查询所有课件
    public String CwqueryAll(){
    	coursewareList=coursewareService.queryAll();
		return "find";
    }
    //删除数据
    public String Cwdelete(){    //需要修改
    	
    	coursewareService.delete(ids);
    	return "delete";
    }

    
   //模糊查询
    public String CwqueryName(){
    	 String name = null;
 		try {
 			name = java.net.URLDecoder.decode(cwName, "UTF-8");
 		} catch (UnsupportedEncodingException e) {
             e.printStackTrace();
 		}
    	coursewareList=coursewareService.queryName(name);
    	return "queryName";
    }
    
    /**
     * 课件上传
     * @return
     * @throws IOException 
     */
    public String cwUpload() throws IOException {

        
        File file =  new File("D:\\works\\OLS07\\WebContent\\upload\\");
    	if(!file.exists()) {
    		file.mkdirs();
    	}
    	
    	try {
    		  SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmm");
    	      String str=sdf.format(new Date());
    	      String ing = str + uploadFileName;
    		  String address = ing;
    		   FileOutputStream ou = new FileOutputStream("D:\\works\\OLS07\\WebContent\\upload\\"+ing);  
    		   FileInputStream in = new FileInputStream(upload);
    		   byte [] b = new byte[1024];
    		   int len = 0 ;
    		   while((len = in.read(b)) != -1) {
    			   ou.write(b, 0, len);
    		   }
    		   ou.close();
    		   in.close();	
    		   
    		   //保存视频地址
    		   Course course = courseService.courseModify(courseId);
    		      courseware.setCourse(course);
    		      courseware.setCwAddress(address);
    		   coursewareService.saveCwInfo(courseware);
    		   
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
    	
    	return SUCCESS;
    	
    }
    
    /**
     * 查询课程
     * @return
     */
    public String queryCourse() {
    	courseList = courseService.query();
    	return SUCCESS;
    }
    
	public Courseware getCourseware() {
		return courseware;
	}
	public void setCourseware(Courseware courseware) {
		this.courseware = courseware;
	}
	public List<Courseware> getCoursewareList() {
		return coursewareList;
	}
	public void setCoursewareList(List<Courseware> coursewareList) {
		this.coursewareList = coursewareList;
	}
	public Integer getIds() {
		return ids;
	}
	public void setIds(Integer ids) {
		this.ids = ids;
	}
	public String getCwName() {
		return cwName;
	}
	public void setCwName(String cwName) {
		this.cwName = cwName;
	}
	 public String getCoursename() {
			return coursename;
		}
		public void setCoursename(String coursename) {
			this.coursename = coursename;
		}
		public File getUpload() {
			return upload;
		}
		public void setUpload(File upload) {
			this.upload = upload;
		}
		public String getUploadFileName() {
			return uploadFileName;
		}
		public void setUploadFileName(String uploadFileName) {
			this.uploadFileName = uploadFileName;
		}
		public String getUploadContentType() {
			return uploadContentType;
		}
		public void setUploadContentType(String uploadContentType) {
			this.uploadContentType = uploadContentType;
		}
		public List<Course> getCourseList() {
			return courseList;
		}
		public void setCourseList(List<Course> courseList) {
			this.courseList = courseList;
		}
		public Integer getCourseId() {
			return courseId;
		}
		public void setCourseId(Integer courseId) {
			this.courseId = courseId;
		}
    
}
