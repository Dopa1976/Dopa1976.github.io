package com.test;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gcxy.domain.Batch;
import com.gcxy.domain.BatchCourseWare;
import com.gcxy.domain.Menu;
import com.gcxy.domain.Role;
import com.gcxy.domain.RoleControl;
import com.gcxy.domain.Score;
import com.gcxy.domain.UserInfo;
import com.gcxy.service.BatchUserService;
import com.gcxy.service.CourseService;
import com.gcxy.service.LoginSevice;
import com.gcxy.service.UserInfoManagerService;
import com.gcxy.service.UserInfoService;
import com.gcxy.service.UserManagerService;
import com.gcxy.vo.UserInfoManagerVo;
import com.gcxy.vo.UserManagerVo;

public class Test {
	public ApplicationContext applicationContext;

	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("加载成功");
	}

	@org.junit.Test
	public void testquery(){
		/*LoginSevice loginservice= (LoginSevice) applicationContext.getBean("loginservice");
		//添加一个
		CourseService courseService=(CourseService) applicationContext.getBean("courseService");
		UserManagerService userManagerService=(UserManagerService) applicationContext.getBean("userManagerService");
		UserInfoManagerService userInfoManagerService=(UserInfoManagerService) applicationContext.getBean("UserInfoManagerService");
		UserInfoService userInfoService=(UserInfoService) applicationContext.getBean("userInfoService");*/
		BatchUserService batchUserService=(BatchUserService) applicationContext.getBean("batchUserService");
		/*UserInfo userinfo=new UserInfo();
		userinfo.setUserAccount("account");
		userinfo.setUserPassword("123456");
		loginservice.test(userinfo);*/
		/*List<Role> role =loginservice.queryAllRelo();
		System.out.println(role.get(1).getRoleName());*/
		/*List<UserInfo> userinfolist=loginservice.queryLogin("1600106");
		System.out.println(userinfolist.size()+"条数据");*/
		/*String account="1600106";
		for(int i=0;i<=50;i++) {
			UserInfo userinfo = new UserInfo();
			userinfo.setId(i+2);
			userinfo.setUserAccount(account+i);
			userinfo.setUserPassword("123456");
			loginservice.test(userinfo);
		}*/
		//测试登陆是否能成功
	/*	UserInfo user=new UserInfo();
		user.setUserAccount("root");
		user.setUserPassword("123456");
		List<UserInfo> userinfo=loginservice.login(user);
		System.out.println(userinfo.get(0).getUserAccount());*/
	/*	List<Menu> menu=loginservice.selectUserMenu(1);*///测试页面菜单数据
		/*List<UserInfo> user=loginservice.queryRegister("root");
		System.out.println(user.get(0).getUserPassword());*/
		

		/*courseService. query();
		UserInfo user=new UserInfo();
		user.setUserAccount("root");
		user.setUserPassword("123456");
		Batch bc=new Batch();
		Score score=new Score();
		score.setScore(65);*/

		/*courseService. query();//课程查询
*/	
		/*List<UserManagerVo> list=userManagerService.queryByCondition("业务管理");//用户权限管理查询测试
		System.out.println(list.size());*/
		
		/*List<Menu> list =userManagerService.queryByUserId(1);//测试查询没分配权限的菜单
		System.out.println(list.size());*/
		/*List<Menu> list = userManagerService.queryByUserId(1);
		System.out.println(list.size());
		System.out.println("添加成功");


		score.setUserinfo(user);*/
		/*score.setBatch(1);*/
		/*List<UserInfoManagerVo> list=userInfoManagerService.queryByCondition("root");
		System.out.println(list.size());
		System.out.println(list.get(0).getUserPassword());
		*/
		List<BatchCourseWare> list=batchUserService.queryBatchCourseWareByUserId(1);
		System.out.println(list.size());

	}

	@After
	public void tearDown() throws Exception {
	}

}
