<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@page import="com.gcxy.domain.UserInfo"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="x-ua-compatible" content="ie=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<link rel="stylesheet" href="css/app.css">
<link rel="stylesheet" href="css/theme.css">
<link rel="stylesheet" href="css/font-awesome.min.css">
<link
	href='https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700,800'
	rel='stylesheet' type='text/css'>
<link rel="stylesheet" type="text/css"
	href="layerslider/css/layerslider.css">
<link rel="stylesheet" href="css/owl.carousel.min.css">
<link rel="stylesheet" href="css/owl.theme.default.min.css">
<link rel="stylesheet" href="css/responsive.css">
<link rel="stylesheet" href="css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
.xg {
	width: 150px;
	height: 30px;
	background-color: #3496d8;
	border: 1px solid #3496d8;
	color: white;
	font-size: 14px;
	border-radius: 25px;
	outline: none;
	cursor: pointer;
}
.cz {
	width: 150px;
	height: 30px;
	background-color: #3496d8;
	border: 1px solid #3496d8;
	color: white;
	font-size: 14px;
	border-radius: 25px;
	outline: none;
	cursor: pointer;
}

table {
	width: 80%;
	margin-left: auto;
	margin-right: auto;
	margin-top: 130px;
	margin-bottom: 90px;
}

#password{
 margin-left:-320px;
}

</style>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript">
$(function(){

	$("#oldPassword").keyup(function(){
		var userPassword = "${sessionScope.user.userPassword}";
		var oldpassword = $(this).val();
		if (userPassword != oldpassword){
			var span = "<span class='tip1' style='color: red;'>密码错误</span>";
			$(".old").html(span);
		

		}else{
			$(".old").html("");
		
		}
		if(oldpassword==""){
			var span="<span class='tip1' style='color: red;'>请输入原密码</span>";
			$(".old").html(span);
		}
});
	$("#newpassword").keyup(function(){
		var userPassword = "${sessionScope.user.userPassword}";
		var newpassword=$(this).val();
		if(userPassword==newpassword){
			var span1="<span class='tip2' style='color: red;'>不能与原密码一致</span>";
		$(".new").html(span1);
		}else{
			$(".new").html("");
		}
		
		if(newpassword==""){
			var span1="<span class='tip2' style='color: red;'>密码不能为空</span>";
			$(".new").html(span1);
		}
		
		
	});
	$("#renewpassword").keyup(function(){
	
		var renewpassword=$("#newpassword").val();
		var newpassword=$(this).val();
		if(renewpassword!=newpassword){
			var span2="<span class='tip3' style='color: red;'>两次输入的密码不一致</span>";
		$(".new1").html(span2);
		}else{
			$(".new1").html("");
		}
		if(renewpassword==""){
			var span2="<span  style='color: red;'>密码不能为空</span>";
			$(".new1").html(span1);
		}
		
		
	});
	$("#update").click(function(){
		
		var userPassword = "${sessionScope.user.userPassword}";
		var oldpassword = $("#oldPassword").val();
		var newpassword=$("#newpassword").val();
		var renewpassword=$("#renewpassword").val();
		if(userPassword==oldpassword&&newpassword!=oldpassword&&renewpassword==newpassword&&newpassword!=""){
			$("#form").attr("action","updatePassword");
			alert("修改成功！！！")
		}else{

			
		alert("修改失败！！！")
		}
		
	
	});  
	
});

</script>
<title>修改密码</title>
</head>
<body>


	<div class="off-canvas-wrapper">
		<div class="off-canvas-wrapper-inner" data-off-canvas-wrapper>
			<!--header-->
			<div class="off-canvas position-left light-off-menu dark-off-menu"
				id="offCanvas" data-off-canvas>
				<div class="off-menu-close">
					<h3>菜单</h3>
					<span data-toggle="offCanvas"><i class="fa fa-times"></i></span>
				</div>
				<ul class="vertical menu off-menu" data-responsive-menu="drilldown">
					 <c:forEach var="menu1" items="${session.menu}" varStatus="vs">
						<li><a href="${menu1.address }"><i class="fa fa-film"></i>${menu1.menuName}</a>


							<c:if test="${fn:length(menu1.children) > 0}">
								<!-- 判断是否有子菜单 -->
								<ul class="submenu menu vertical" data-submenu
									data-animate="slide-in-down slide-out-up">
									<c:forEach var="menu2" items="${menu1.children}" varStatus="e">
										<li><a href="${menu2.address }"><i class="fa fa-home"></i>${menu2.menuName}</a></li>
									</c:forEach>
								</ul>
							</c:if></li>
					</c:forEach>
				</ul>


			</div>
			<div class="off-canvas-content" data-off-canvas-content>
				<header> <!--Navber--> <section id="navBar"> <nav
					class="sticky-container" data-sticky-container>
				<div class="sticky topnav topnav-dark" data-sticky
					data-top-anchor="navBar" data-btm-anchor="footer-bottom:bottom"
					data-margin-top="0" data-margin-bottom="0"
					style="width: 100%; background: #303030;" data-sticky-on="large">
					<div class="title-bar" data-responsive-toggle="beNav"
						data-hide-for="large">
						<button class="menu-icon" type="button" data-toggle="offCanvas"></button>
						<div class="title-bar-title">
							<img src="images/logo-small.png" alt="logo">
						</div>
					</div>
					<div class="show-for-large topbar-full topbar-dark clearfix"
						id="beNav" style="width: 100%;">
						<div class="top-bar-left btn-toggle">
							<button type="button" data-toggle="offCanvas"
								class="secondary-button">
								<i class="fa fa-bars"></i>
							</button>
						</div>
						<div class="top-bar-left toplogo">
							<ul class="menu">
								<li class="menu-text"><a href="index.html"><img
										src="images/logo-small.png" alt="logo"></a></li>
							</ul>
						</div>
						<div class="top-bar-left topnews">
							<div class="newsTicker">
								<i class="fa fa-video-camera"></i> <span>标题</span>
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
									<li><a href="#">注销</a></li>

								</ul>
							</div>
						</div>
					</div>
				</div>
				</nav> </section> </header>
				<!-- End Header -->
				<!-- caroslider-->
				<div id="app" style="height: 590px">
				<div class="panel panel-primary" STYLE="width: 100%; height: 20%;">
				
				<div class="panel-heading">
							<h3 class="panel-title" STYLE="margin-left:50%">修改密码</h3>
						</div>
							
	<s:form target="_top" action="" method="post" theme="simple" id="form">
	<table >
	
	<tr>
	<td width="340" style="text-align: right; padding-right: 20px;">输入旧密码:</td>
	<td style="text-align: left;">
	   <input type="password" id="oldPassword" style="width: 275px; height: 25px;" /></td>
	   <td><span class="old"  id="password"></span ></td>
	</tr>
	<tr>
	<td style="text-align: right; padding-right: 20px;">输入新密码:</td>
	<td style="text-align: left;">
 	 <s:password id="newpassword" cssStyle="width: 275px; height: 25px;" name="userInfo.userPassword" value=""></s:password></td>
 	<td><span class="new" id="password"></span ></td>
 	</tr>
	<tr>
	<td style="text-align: right; padding-right: 20px;">确认新密码:</td>
	<td style="text-align: left;"><s:password id="renewpassword" cssStyle="width: 275px; height: 25px;" ></s:password></td>
	<td><span class="new1"  id="password"></span ></td>
	</tr>
<%-- 	 <s:hidden name="userInfo.userPassword"  value="%{#session.user.userPassword}"></s:hidden>
 --%>	 <s:hidden name="userInfo.id"  value="%{#session.user.id}"></s:hidden>
	<tr>
	<td style="text-align: right;"><s:submit value="修改"
	cssClass="xg" id="update"></s:submit></td>
	 
	<td style="text-align:center;" colspan="2"><s:reset value="重置"
     cssClass="cz"></s:reset></td>
    
	</tr>
		</table>
	</s:form>					
<iframe id="id_iframe" name="nm_iframe" style="display:none;"></iframe> 

		
			
		<div id="footer-bottom">
			<div class="logo text-center">
				<img src="images/footerlogo.png" alt="footer logo">
			</div>
			<div class="btm-footer-text text-center">
				<p>2018 © zhaoyunzhu.</p>
			</div>
		</div>
	</div>
	<!--end off canvas content-->
	</div>
	<!--end off canvas wrapper inner-->
	</div>
	<!--end off canvas wrapper-->
	<!-- script files -->
	
	<script src="bower_components/jquery/dist/jquery.js"></script>
	<script src="bower_components/what-input/what-input.js"></script>
	<script src="bower_components/foundation-sites/dist/foundation.js"></script>
	<script src="js/jquery.showmore.src.js" type="text/javascript"></script>
	<script src="js/app.js"></script>
	<script src="layerslider/js/greensock.js" type="text/javascript"></script>
	<!-- LayerSlider script files -->
	<script src="layerslider/js/layerslider.transitions.js"
		type="text/javascript"></script>
	<script src="layerslider/js/layerslider.kreaturamedia.jquery.js"
		type="text/javascript"></script>
	<script src="js/owl.carousel.min.js"></script>
	<script src="js/inewsticker.js" type="text/javascript"></script>
	<script src="js/jquery.kyco.easyshare.js" type="text/javascript"></script>
	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</body>
</html>