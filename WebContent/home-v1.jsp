<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn"  uri="http://java.sun.com/jsp/jstl/functions"%>
<%@page import="com.gcxy.domain.UserInfo" %>
	<%	
	UserInfo user1 = (UserInfo)session.getAttribute("user");
	if(user1==null){
		response.sendRedirect("index.jsp");
	}
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>首页</title>

 <link rel="stylesheet" href="css/app.css">
    <link rel="stylesheet" href="css/theme.css">
    <link rel="stylesheet" href="css/font-awesome.min.css">
    <link href='https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700,800' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" type="text/css" href="layerslider/css/layerslider.css">
    <link rel="stylesheet" href="css/owl.carousel.min.css">
    <link rel="stylesheet" href="css/owl.theme.default.min.css">
    <link rel="stylesheet" href="css/responsive.css">
    <link rel="stylesheet" href="css/bootstrap.min.css">
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
               
	<img alt="footer logo" src="images/homeimage.jpg">
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