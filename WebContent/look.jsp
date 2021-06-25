<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html class="no-js" lang="en">
<head lang="en">
<base href="<%=basePath %>">
 <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>课件学习</title>
    <link rel="stylesheet" href="css/app.css">
    <link rel="stylesheet" href="css/theme.css">
    <link rel="stylesheet" href="css/font-awesome.min.css">
    <link href='https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700,800' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" type="text/css" href="layerslider/css/layerslider.css">
    <link rel="stylesheet" href="css/owl.carousel.min.css">
    <link rel="stylesheet" href="css/owl.theme.default.min.css">
    <link rel="stylesheet" href="css/responsive.css">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript">
var index=0;
var timer=null;
var stopdragging=null;
var lastTime = 0;
$(function(){
	//初始化视频播放时间
	var finish = $("#finish").val();
	if(finish=='0'){
		document.getElementById("myVideo").currentTime=$("#playTime").val();
		lastTime=$("#playTime").val();
	}else{
		document.getElementById("myVideo").currentTime='0';
		document.getElementById("myVideo").currentTime=$("#playTime").val();
		lastTime=0;
	}
});
//播放结束触发
function updateFinish(){
	var url="lookVideo";
	var currentTime = document.getElementById("myVideo").currentTime;
	var duration = document.getElementById("myVideo").duration;
	//alert(currentTime+","+duration);
	var params = {
			"BatchId":$("#bid").val(),
			"cw_id":$("#cid").val(),
			"leaRecord.cwCredit":$("#cwCredit").val(),
			"leaRecord.playTime":currentTime,
			"leaRecord.totalLength":duration
	};
	$.post(url,params,function(){
		//不记录学习行为
		 window.clearInterval(timer);
		//停止检查进度条是否拖动
		window.clearInterval(stopdragging);
	},"json");
	return true;
}
//对用户的学习行为记录
function saveRecord(){
	
	var currentTime = document.getElementById("myVideo").currentTime;
	if(currentTime<backTime){
		return false;
	}else{
		var url="lookVideo";
		var duration = document.getElementById("myVideo").duration;
		//alert(currentTime+","+duration);
		var params = {
				"BatchId":$("#bid").val(),
				"cw_id":$("#cid").val(),
				"leaRecord.cwCredit":$("#cwCredit").val(),
				"leaRecord.playTime":currentTime,
				"leaRecord.totalLength":duration
		};
		$.post(url,params,function(){
			alert("save ok");
		},"json");
	}
	
}
//视频加载完成时触发
function recordTime(){
	//每隔10记录一下时间
	timer = setInterval(saveRecord,10000);
	//禁止拖动进度条
	//每隔1秒钟检查上一秒的视频播放时间和下一秒的的视频播放时间是否大于0.2秒，
	stopdragging = setInterval(conTime,200);
}
var index=0;
var backTime=0;
var tempTime=0;
//禁止拖动进度条
function conTime(){
	var currentTime = document.getElementById("myVideo").currentTime;
	lastTime = $("#lastTime").val();
	if(backTime<=currentTime){
		var xc = currentTime-lastTime;
		//如果大于3秒则认为用户拖动了进度
		//将视频的当前播放时间设置为上次检查时候的视频播放时间
		$("#xc").val(xc);
		if(xc>2){
			document.getElementById("myVideo").currentTime=lastTime;
		}
		//如果在2秒之间，则认为用户没有拖动进度,小于0不做任何处理
		//上一秒的时间更新为当前的视频播放时间
		if(0<=xc<=2){
			$("#lastTime").val(document.getElementById("myVideo").currentTime);
		}
		if(xc<0){
			tempTime=lastTime;
			if(tempTime>backTime){
				backTime = tempTime;
			}
		}
	}else{
		 $("#lastTime").val(currentTime);
	}
	
}


</script>


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
									<li><a href="cancel">注销</a></li>

								</ul>
							</div>
						</div>
					</div>
				</div>
				</nav> </section> </header>
            <!-- caroslider-->
            <div id="app" style="height:100px;">

					<div class="panel panel-primary" STYLE="width: 100%; height: 20%;">
						<div class="panel-heading">
							<h3 class="panel-title" STYLE="margin-left:900px">学习视频</h3>
						</div>
					
					    <div STYLE="width: 25%; height: 50%; float:left;margin-top: 20px; margin-left: 20px;">
					       <input type="button"  value="返回" class="btn btn-primary" onclick="window.location='queryBatchCourseWare?BatchId=${session.bid}'"/>
					    </div>
		</div>					
</div>
<div align="center">
<div hidden="hidden">
   <input type="text" id="lastTime" value="${leaRecord.playTime }">
xc:<input type="text" id="xc" value="">
</div>
<video width="65%" height="600" id="myVideo" class="test" onended="updateFinish()" onloadeddata="recordTime()" onpause="stopRecord()" autoplay="autoplay" src="upload/${courseware.cwAddress}"
	controls="controls">
</video>
<br/>
<div hidden="hidden">
 批次id：<input type="text" id="bid" value="${BatchId}"><br/>
课程id:<input type="text" id="cid" value="${courseware.id }"><br/>
播放时间：<input type="text" id="playTime" value="${leaRecord.playTime }"><br/>
完成情况：<input type="text" id="finish" value="${leaRecord.finish }"><br/>
学分：<input type="text" id="cwCredit" value="${courseware.cwCredit }"><br/>
</div>
</div>

       
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