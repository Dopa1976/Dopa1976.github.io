package com.gcxy.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;


import com.gcxy.domain.Batch;
import com.gcxy.domain.Score;
import com.gcxy.domain.UserInfo;
import com.gcxy.service.ScoreService;
import com.gcxy.vo.scoreManageVo;
import com.opensymphony.xwork2.ActionSupport;


@Controller("MyUploadAction")
@Scope("prototype")
public class MyUploadAction extends ActionSupport {
	@Autowired
	private ScoreService scoreService;
	private List<UserInfo> user;
	private List<Batch> batchs;
	private List<scoreManageVo> scoreVoList;
	private String userAccount;
	private Integer id;
	private int scores;
	private Integer batchId;
	private String batchName;
	
	
	//文件的批量上传
			private File upload;
			private String uploadFileName;
			private String uploadContentType;
			
			
			
			public String ScoreUpload(){
				try{
					
					String extName=uploadFileName.substring(uploadFileName.lastIndexOf(".")+1);
					
					InputStream inputStream=new FileInputStream(upload);
					
					if(extName.equals("xls")){
						
						HSSFWorkbook wkb= new HSSFWorkbook(inputStream);
						HSSFSheet sheet=wkb.getSheetAt(0);
						 for (Row row : sheet) {						      
						        for (Cell cell : row) {
						            //读取数据前设置单元格类型
						            cell.setCellType(CellType.STRING);						           
						        }
					
						    }
						for(int rowNum=1;rowNum<=sheet.getLastRowNum();rowNum++){
							HSSFRow row=sheet.getRow(rowNum);
							Score sco=new Score();
							//取用户名
					        String  userAccount = row.getCell(0).getStringCellValue();
					        //取成绩
					        int  scores = Integer.valueOf(row.getCell(1).getStringCellValue());
					        //取批次名
					        String batchName = row.getCell(2).getStringCellValue();
					        
							user=scoreService.querybyname(userAccount);
							batchs=scoreService.querybybatchname(batchName);
							
							sco.setScore(scores);
							sco.setUserinfo(user.get(0));
							sco.setBatch(batchs.get(0));
							scoreService.addScore(sco,user.get(0).getId(),batchs.get(0).getId());
							
					
						}
					}else if(extName.equals("xlsx")){
						XSSFWorkbook wkb=new XSSFWorkbook(inputStream);
						XSSFSheet sheet=wkb.getSheetAt(0);
						 for (Row row : sheet) {						      
						        for (Cell cell : row) {
						            //读取数据前设置单元格类型
						            cell.setCellType(CellType.STRING);						           
						        }
					
						    }

						for(int rowNum=1;rowNum<=sheet.getLastRowNum();rowNum++){
							XSSFRow row=sheet.getRow(rowNum);					
							Score sco=new Score();
							//取用户名
					        String  userAccount = row.getCell(0).getStringCellValue();
					        //取成绩
					        int  scores = Integer.valueOf(row.getCell(1).getStringCellValue());
					        //取批次名
					        String batchName = row.getCell(2).getStringCellValue();
					        
					        user=scoreService.querybyname(userAccount);
							batchs=scoreService.querybybatchname(batchName);
							
							sco.setScore(scores);
							sco.setUserinfo(user.get(0));
							sco.setBatch(batchs.get(0));
							scoreService.addScore(sco,user.get(0).getId(),batchs.get(0).getId());
							
							
						}
					}
				}catch(FileNotFoundException e){
					e.printStackTrace();
					
				}catch (IOException e) {
					e.printStackTrace();
				}
				return "success";
			}
			
		/**
		 * 查询所有成绩	
		 * @return
		 */
		public String scoreQuery() {
			scoreVoList = scoreService.scoreQuery();
			return SUCCESS;
		}	
		/**
		 * 根据用户查询成绩
		 * @return
		 */
		public String userScoreQuery() {
			scoreVoList  = scoreService.userScoreQuery(userAccount);
			return SUCCESS;
		}
		/**
		 * 删除成绩
		 * @return
		 */
		public String scoreDelete() {
			
			scoreService.scoreDelete(id);
			return SUCCESS;
		}
		/**
		 * 修改成绩查询
		 * @return
		 */
		public String scoreModifyQuery() {
			
			scoreVoList = scoreService.scoreModifyQuery(id);
			scoreManageVo sc = scoreVoList.get(0);
			id = sc.getId();
			userAccount = sc.getUserAccount();
			scores = sc.getScore();
			batchName = sc.getBatchName();
			return SUCCESS;
		}
		/**
		 * 修改成绩
		 */
		public String scoreModify() {
			scoreService.scoreModify(id,scores);
			return SUCCESS;
		}
		/**
		 * 查询批次
		 * @return
		 */
		public String scoreAddQuery() {
			batchs =  scoreService.scoreAddQuery();
			return SUCCESS;
		}
		
		/**
		 * 添加成绩
		 * @return
		 */
        public String scoreAdd() {
        	UserInfo user = scoreService.sUserQuery(userAccount);
        	Batch batch =  scoreService.sBatchQuery(batchId);
        	Score sc=new Score();
        	sc.setScore(scores);
        	sc.setBatch(batch);
        	sc.setUserinfo(user);
        	scoreService.scoreAdd(sc);
		   return SUCCESS;
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
			public List<UserInfo> getUser() {
				return user;
			}
			public void setUser(List<UserInfo> user) {
				this.user = user;
			}
			public List<Batch> getBatchs() {
				return batchs;
			}
			public void setBatchs(List<Batch> batchs) {
				this.batchs = batchs;
			}
			public List<scoreManageVo> getScoreVoList() {
				return scoreVoList;
			}
			public void setScoreVoList(List<scoreManageVo> scoreVoList) {
				this.scoreVoList = scoreVoList;
			}

			public String getUserAccount() {
				return userAccount;
			}

			public void setUserAccount(String userAccount) {
				this.userAccount = userAccount;
			}

			public Integer getId() {
				return id;
			}

			public void setId(Integer id) {
				this.id = id;
			}

			
			public int getScores() {
				return scores;
			}

			public void setScores(int scores) {
				this.scores = scores;
			}

			public Integer getBatchId() {
				return batchId;
			}

			public void setBatchId(Integer batchId) {
				this.batchId = batchId;
			}

			public String getBatchName() {
				return batchName;
			}

			public void setBatchName(String batchName) {
				this.batchName = batchName;
			}

			


			

}
