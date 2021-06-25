<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@page import="com.gcxy.domain.UserInfo" %>

<%	
	UserInfo user1 = (UserInfo)session.getAttribute("user");
	if(user1==null){
		response.sendRedirect("index.jsp");
	}
	%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html class="no-js" lang="en">
<head>
  <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>课件管理</title>
    <link rel="stylesheet" href="css/app.css">
    <link rel="stylesheet" href="css/theme.css">
    <link rel="stylesheet" href="css/font-awesome.min.css">
    <link href='https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700,800' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" type="text/css" href="layerslider/css/layerslider.css">
    <link rel="stylesheet" href="css/owl.carousel.min.css">
    <link rel="stylesheet" href="css/owl.theme.default.min.css">
    <link rel="stylesheet" href="css/responsive.css">
    <link rel="stylesheet" href="css/bootstrap.min.css">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="off-canvas-wrapper">
    <div class="off-canvas-wrapper-inner" data-off-canvas-wrapper>
        <!--header-->
        <div class="off-canvas position-left light-off-menu dark-off-menu" id="offCanvas" data-off-canvas>
            <div class="off-menu-close">
                <h3>菜单</h3>
                <span data-toggle="offCanvas"><i class="fa fa-times"></i></span>
            </div>
           <ul class="vertical menu off-menu" data-responsive-menu="drilldown">
             <c:forEach var="menu1" items="${session.menu}" varStatus="vs"> 
             <li>
                 <a href="${menu1.address}"><i class="fa fa-film"></i>${menu1.menuName}</a> 
          
                           <c:if test="${fn:length(menu1.children) > 0}"><!-- 判断是否有子菜单   二级菜单-->
                           <ul class="submenu menu vertical" data-submenu data-animate="slide-in-down slide-out-up">
                             <c:forEach var="menu2" items="${menu1.children}" varStatus="e"> 
	                               <li><a href="${menu2.address }"><i class="fa fa-home"></i>${menu2.menuName}</a>
	                               
	                               </li>
	                              </c:forEach> 
	                               </ul>
	                           </c:if> 
	                       </li>
                    </c:forEach>
                   </ul>

        </div>
        <div class="off-canvas-content" data-off-canvas-content>
            <header>
                <!--Navber-->
                <section id="navBar">
                    <nav class="sticky-container" data-sticky-container>
                        <div class="sticky topnav topnav-dark" data-sticky data-top-anchor="navBar" data-btm-anchor="footer-bottom:bottom" data-margin-top="0" data-margin-bottom="0" style="width: 100%; background: #303030;" data-sticky-on="large">
                            <div class="title-bar" data-responsive-toggle="beNav" data-hide-for="large">
                                <button class="menu-icon" type="button" data-toggle="offCanvas"></button>
                                <div class="title-bar-title"><img src="images/logo-small.png" alt="logo"></div>
                            </div>
                            <div class="show-for-large topbar-full topbar-dark clearfix" id="beNav" style="width: 100%;">
                                <div class="top-bar-left btn-toggle">
                                    <button type="button" data-toggle="offCanvas" class="secondary-button"><i class="fa fa-bars"></i></button>
                                </div>
                                <div class="top-bar-left toplogo">
                                    <ul class="menu">
                                        <li class="menu-text">
                                            <a href="#"><img src="images/logo-small.png" alt="logo"></a>
                                        </li>
                                    </ul>
                                </div>
                                <div class="top-bar-left topnews">
                                    <div class="newsTicker">
                                        <i class="fa fa-video-camera"></i>
                                        <span>标题</span>
                                        <ul id="newsBar">
                                            <li><a href="#">java两周速成班</a></li>
                                            <li><a href="#">北大名师一对一在线教学</a></li>
                                            <li><a href="#">清华博士生导师免费授课</a></li>
                                            <li><a href="#">重工老师教你面试技巧</a></li>
                                            <li><a href="#">托佛雅思集训班 </a></li>
                                        </ul>
                                    </div>
                                </div>
                                <div class="top-bar-left topsearch" style="color: white">
                                    <h4>在线学习后台管理系统</h4>
                                </div>
                                <div class="top-bar-left topbtn">
                                    <div class="top-button">
                                        <ul class="menu float-right">
                                            <li>
                                                <a href="cancel">注销</a>
                                            </li>

                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </nav>
                </section>
            </header><!-- End Header -->
            <!-- caroslider-->
              <div id="app" style="height: 590px">

					<div class="panel panel-primary" STYLE="width: 100%; height: 20%;">
						<div class="panel-heading">
							<h3 class="panel-title" STYLE="margin-left: 730px">课件管理</h3>
						</div>
	
						<div STYLE="width: 23%; height: 100%; float: left; margin-left: 100px;">
							<form>
								<label style="margin-top:20px;">
								<input type="text" placeholder="课件名" name="courseware.cwName"  class="form-control"	v-model="keywords" id="search" v-focus v-color="'green'" >
								</label> 
								<input  type="button" value="查询" class="btn btn-primary" onclick="queryName()" />
								          
								          
								          
							</form>
					    </div>
							   <div STYLE="width: 18%; height: 50%; float: left;margin-left: 5px; margin-top:20px;">
                                  <input type="button" class="btn btn-primary" onclick="window.location='queryCourseAction'" value="上传课件"/>
                            </div>
                           
</div> 

                            <table class="table" style="margin-top: 20px">
                               
                        <tr>
							<th>ID</th>
							<th>课件名称</th>
							<th>学分</th>
							<th>地址</th>
							<th>种类</th>
							<th>课程</th>
							<th>操作</th>
						</tr>
                          <s:iterator var="courseware" value="coursewareList" status="st">
							<tr>
								<td><s:property value="#st.index+1" /></td>
								<td><s:property value="#courseware.cwName" /> </td>
								<td><s:property value="#courseware.cwCredit" /></td>
								<td><s:property value="#courseware.cwAddress" /></td>
								<td>
								    <s:set var="cwt" value="#courseware.cwType"/>
								    <s:if test="#cwt==1">视频</s:if>
								    <s:if test="#cwt==0">其它</s:if>
								</td>
								<td>${courseName}</td>
								<td><a href="Cwdelete?ids=<s:property value="#courseware.id"/>">删除</a></td>
							</tr>
						</s:iterator>
                            </table>
                        </div>
                	<script>
            
            //添加用户
                 function add(){
                	 var addUser = document.forms[0];
                	 addUser.action = "Cwadd";
                	 addUser.method = "post";
                	 addUser.submit();
                 }
            
                function queryName(){
                	 var form = document.forms[0];
                	 var search = encodeURI(encodeURI(document.getElementById("search").value));
                     form.action = "CwqueryName"+"?cwName="+search;
                	 form.method = "post";
                	 form.submit();
                 } 

            </script>






              

                <div id="footer-bottom">
                    <div class="logo text-center">
                        <img src="images/footerlogo.png" alt="footer logo">
                    </div>
                    <div class="btm-footer-text text-center">
                        <p>2018 © zhaoyunzhu.</p>
                    </div>
                </div>
        </div><!--end off canvas content-->
    </div><!--end off canvas wrapper inner-->
</div><!--end off canvas wrapper-->
<!-- script files -->
<script src="bower_components/jquery/dist/jquery.js"></script>
<script src="bower_components/what-input/what-input.js"></script>
<script src="bower_components/foundation-sites/dist/foundation.js"></script>
<script src="js/jquery.showmore.src.js" type="text/javascript"></script>
<script src="js/app.js"></script>
<script src="layerslider/js/greensock.js" type="text/javascript"></script>
<!-- LayerSlider script files -->
<script src="layerslider/js/layerslider.transitions.js" type="text/javascript"></script>
<script src="layerslider/js/layerslider.kreaturamedia.jquery.js" type="text/javascript"></script>
<script src="js/owl.carousel.min.js"></script>
<script src="js/inewsticker.js" type="text/javascript"></script>
<script src="js/jquery.kyco.easyshare.js" type="text/javascript"></script>
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</body>
</html>