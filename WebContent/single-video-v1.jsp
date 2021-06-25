<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html class="no-js" lang="en">
<head>
 <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>BeTube video</title>
    <link rel="stylesheet" href="css/app.css">
    <link rel="stylesheet" href="css/theme.css">
    <link rel="stylesheet" href="css/font-awesome.min.css">
    <link href='https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700,800' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" type="text/css" href="layerslider/css/layerslider.css">
    <link rel="stylesheet" href="css/owl.carousel.min.css">
    <link rel="stylesheet" href="css/owl.theme.default.min.css">
    <link rel="stylesheet" href="css/jquery.kyco.easyshare.css">
    <link rel="stylesheet" href="css/responsive.css">
<title>Insert title here</title>
</head>
<body>
<div class="off-canvas-wrapper">
    <div class="off-canvas position-left light-off-menu dark-off-menu" id="offCanvas" data-off-canvas>
        <div class="off-menu-close">
            <h3>菜单</h3>
            <span data-toggle="offCanvas"><i class="fa fa-times"></i></span>
        </div>
        <ul class="vertical menu off-menu" data-responsive-menu="drilldown">
            <li class="has-submenu">
                <a href="#"><i class="fa fa-home"></i>首页</a>
                <!--<ul class="submenu menu vertical" data-submenu data-animate="slide-in-down slide-out-up">-->
                <!--<li><a href="index.html"><i class="fa fa-home"></i>Home page v1</a></li>-->
                <!--<li><a href="home-v2.html"><i class="fa fa-home"></i>Home page v2</a></li>-->
                <!--<li><a href="home-v3.html"><i class="fa fa-home"></i>Home page v3</a></li>-->
                <!--<li><a href="home-v4.html"><i class="fa fa-home"></i>Home page v4</a></li>-->
                <!--<li><a href="home-v5.html"><i class="fa fa-home"></i>Home page v5</a></li>-->
                <!--<li><a href="home-v6.html"><i class="fa fa-home"></i>Home page v6</a></li>-->
                <!--<li><a href="home-v7.html"><i class="fa fa-home"></i>Home page v7</a></li>-->
                <!--<li><a href="home-v8.html"><i class="fa fa-home"></i>Home page v8</a></li>-->
                <!--<li><a href="home-v9.html"><i class="fa fa-home"></i>Home page v9</a></li>-->
                <!--<li><a href="home-v10.html"><i class="fa fa-home"></i>Home page v10</a></li>-->
                <!--</ul>-->
            </li>
            <li class="has-submenu" data-dropdown-menu="example1">
                <a href="profile-video.html"><i class="fa fa-film"></i>我的课程</a>
                <!--<ul class="submenu menu vertical" data-submenu data-animate="slide-in-down slide-out-up">-->
                <!--<li><a href="single-video-v1.html"><i class="fa fa-film"></i>single video v1</a></li>-->
                <!--<li><a href="single-video-v2.html"><i class="fa fa-film"></i>single video v2</a></li>-->
                <!--<li><a href="single-video-v3.html"><i class="fa fa-film"></i>single video v3</a></li>-->
                <!--<li><a href="submit-post.html"><i class="fa fa-film"></i>submit post</a></li>-->
                <!--</ul>-->
            </li>
            <li><a href="categories.html"><i class="fa fa-th"></i>分类</a></li>
            <li>
                <a href="blog.html"><i class="fa fa-edit"></i>博客</a>
                <ul class="submenu menu vertical" data-submenu data-animate="slide-in-down slide-out-up">
                    <li><a href="#"><i class="fa fa-edit"></i>博客单帖</a></li>
                </ul>
            </li>
            <li>
                <a href="#"><i class="fa fa-magic"></i>个人资料</a>
                <ul class="submenu menu vertical" data-submenu data-animate="slide-in-down slide-out-up">

                    <li><a href="profile-about-me.html"><i class="fa fa-magic"></i>关于我的简介</a></li>

                    <li><a href="profile-settings.html"><i class="fa fa-magic"></i>档案设置</a></li>
                </ul>
            </li>
            <li><a href="#"><i class="fa fa-user"></i>关于我们</a></li>
            <li><a href="#"><i class="fa fa-envelope"></i>联系我们</a></li>
        </ul>
        <div class="responsive-search">
            <form method="post">
                <div class="input-group">
                    <input class="input-group-field" type="text" placeholder="在这里输入你想了解的东西">
                    <div class="input-group-button">
                        <button type="submit" name="search"><i class="fa fa-search"></i></button>
                    </div>
                </div>
            </form>
        </div>
        <div class="off-social">
            <h6>马上搜索</h6>
            <a href="#"><i class="fa fa-facebook"></i></a>
            <a href="#"><i class="fa fa-twitter"></i></a>
            <a href="#"><i class="fa fa-google-plus"></i></a>
            <a href="#"><i class="fa fa-instagram"></i></a>
            <a href="#"><i class="fa fa-vimeo"></i></a>
            <a href="#"><i class="fa fa-youtube"></i></a>
        </div>
        <div class="top-button">
            <ul class="menu">
                <li>
                    <a href="#">注销</a>
                </li>
                <li class="dropdown-login">
                    <a href="demo.html">登陆/注册</a>
                </li>
            </ul>
        </div>
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
                                        <a href="index.html"><img src="images/logo-small.png" alt="logo"></a>
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
                            <div class="top-bar-left topsearch">
                                <div class="search-bar-full">
                                    <form method="get">
                                        <div class="input-group">
                                            <input class="input-group-field" type="search" placeholder="输入你想搜索的类容 ...">
                                            <div class="input-group-button icon-btn">
                                                <input class="button" type="submit" name="submit" value="立即搜索">
                                                <i class="fa fa-search"></i>
                                            </div>
                                        </div>
                                    </form>
                                </div>
                            </div>
                            <div class="top-bar-left topbtn">
                                <div class="top-button">
                                    <ul class="menu float-right">
                                        <li>
                                            <a href="#">注销</a>
                                        </li>
                                        <li class="dropdown-login">
                                            <a class="loginReg" data-toggle="example-dropdown" href="#">登陆/注册</a>
                                            <div class="login-form">
                                                <h6 class="text-center">欢迎您回来！</h6>
                                                <form method="post">
                                                    <div class="input-group">
                                                        <span class="input-group-label"><i class="fa fa-user"></i></span>
                                                        <input class="input-group-field" type="text" placeholder="输入您的用户名">
                                                    </div>
                                                    <div class="input-group">
                                                        <span class="input-group-label"><i class="fa fa-lock"></i></span>
                                                        <input class="input-group-field" type="text" placeholder="输入您的密码">
                                                    </div>
                                                    <div class="checkbox">
                                                        <input id="check1" type="checkbox" name="check" value="check">
                                                        <label class="customLabel" for="check1">记住我</label>
                                                    </div>
                                                    <input type="submit" name="submit" value="立即登陆">
                                                </form>
                                                <p class="text-center">新来的？ <a class="newaccount" href="demo.html">点这里加入我们</a></p>
                                            </div>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                </nav>
            </section>
        </header><!-- End Header -->
            <!--breadcrumbs-->
            <section id="breadcrumb">
                <div class="row">
                    <div class="large-12 columns">
                        <nav aria-label="You are here:" role="navigation">
                            <ul class="breadcrumbs">
                                <li><i class="fa fa-home"></i><a href="index.html">首页</a></li>
                                <li><a href="#">前端技术</a></li>
                                <li class="disabled">html5</li>
                                <li>
                                    <span class="show-for-sr">Current: </span> 基础教学
                                </li>
                            </ul>
                        </nav>
                    </div>
                </div>
            </section><!--end breadcrumbs-->
            <!-- full width Video -->
            <section class="fullwidth-single-video">
                <div class="row">
                    <div class="large-12 columns">
                        <div class="flex-video widescreen">


                                <video width="100%" height="100%" controls="controls">

                                    <source src="images/teach_video.mp4" type="video/mp4">

                                </video>


                        </div>
                    </div>
                </div>
            </section>
            <div class="row">
                <!-- left side content area -->
                <div class="large-8 columns">
                    <!-- single post stats -->
                    <section class="SinglePostStats">
                        <!-- newest video -->
                        <div class="row secBg">
                            <div class="large-12 columns">
                                <div class="media-object stack-for-small">
                                    <div class="media-object-section">
                                        <div class="author-img-sec">
                                            <div class="thumbnail author-single-post">
                                                <a href="#"><img src= "http://placehold.it/80x80" alt="post"></a>
                                            </div>
                                            <p class="text-center"><a href="#">Joseph John</a></p>
                                        </div>
                                    </div>
                                    <div class="media-object-section object-second">
                                        <div class="author-des clearfix">
                                            <div class="post-title">
                                                <h4>前端基础10分钟入门.</h4>
                                                <p>
                                                    <span><i class="fa fa-clock-o"></i>5月16日</span>
                                                    <span><i class="fa fa-eye"></i>1,862K</span>
                                                    <span><i class="fa fa-thumbs-o-up"></i>1,862</span>
                                                    <span><i class="fa fa-thumbs-o-down"></i>180</span>
                                                    <span><i class="fa fa-commenting"></i>8</span>
                                                </p>
                                            </div>
                                            <div class="subscribe">
                                                <form method="post">
                                                    <button type="submit" name="subscribe">购买</button>
                                                </form>
                                            </div>
                                        </div>
                                        <div class="social-share">
                                            <div class="post-like-btn clearfix">
                                                <form method="post">
                                                    <button type="submit" name="fav"><i class="fa fa-heart"></i>添加到我的收藏</button>
                                                </form>
                                                <a href="#" class="secondary-button"><i class="fa fa-thumbs-o-up"></i></a>
                                                <a href="#" class="secondary-button"><i class="fa fa-thumbs-o-down"></i></a>

                                                <div class="float-right easy-share" data-easyshare data-easyshare-http data-easyshare-url="http://joinwebs.com">
                                                    <!-- Total -->
                                                    <button data-easyshare-button="total">
                                                        <span>Total</span>
                                                    </button>
                                                    <span data-easyshare-total-count>0</span>

                                                    <!-- Facebook -->
                                                    <button data-easyshare-button="facebook">
                                                        <span class="fa fa-facebook"></span>
                                                        <span>Share</span>
                                                    </button>
                                                    <span data-easyshare-button-count="facebook">0</span>

                                                    <!-- Twitter -->
                                                    <button data-easyshare-button="twitter" data-easyshare-tweet-text="">
                                                        <span class="fa fa-twitter"></span>
                                                        <span>Tweet</span>
                                                    </button>
                                                    <span data-easyshare-button-count="twitter">0</span>

                                                    <!-- Google+ -->
                                                    <button data-easyshare-button="google">
                                                        <span class="fa fa-google-plus"></span>
                                                        <span>+1</span>
                                                    </button>
                                                    <span data-easyshare-button-count="google">0</span>

                                                    <div data-easyshare-loader>Loading...</div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </section><!-- End single post stats -->

                    <!-- single post description -->
                    <section class="singlePostDescription">
                        <div class="row secBg">
                            <div class="large-12 columns">
                                <div class="heading">
                                    <h5>Description</h5>
                                </div>
                                <div class="description showmore_one">
                                    <p> 	本课程主要内容为HTML结构、CSS样式、PC站布局与实践、H5语义化标签与属性、CSS3动画与新特性、M站布局与实践等知识点。视频特点：知识面广，涉及度深，理论与实际相结合，通俗的小白式讲解模式，是自学H5的必备教学视频本课程主</p>
                                    <p>课程目标：</p>

                                    <p> 学会html5基础知识点 </p>
                                    <h6>学习目录 :</h6>
                                    <ul>
                                        <li>网页建站的流程</li>
                                        <li>网页的组成部分</li>
                                        <li>HTML的基础，文字标签，表格，表单，布局标签</li>

                                    </ul>
                                    <div class="categories">
                                        <button><i class="fa fa-folder"></i>分类</button>
                                        <a href="#" class="inner-btn">前端技术</a>
                                        <a href="#" class="inner-btn">HTML5</a>
                                    </div>
                                    <div class="tags">
                                        <button><i class="fa fa-tags"></i>标签</button>
                                        <a href="#" class="inner-btn">高清</a>
                                        <a href="#" class="inner-btn">视频课程</a>
                                        <a href="#" class="inner-btn">基础</a>
                                        <a href="#" class="inner-btn">入门</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </section><!-- End single post description -->

                    <!-- related Posts -->
                    <section class="content content-with-sidebar related">
                        <div class="row secBg">
                            <div class="large-12 columns">
                                <div class="main-heading borderBottom">
                                    <div class="row padding-14">
                                        <div class="medium-12 small-12 columns">
                                            <div class="head-title">
                                                <i class="fa fa-film"></i>
                                                <h4>视频目录</h4>
                                            </div>
                                        </div>
                                    </div>
                                </div>

                                <div class="row list-group">
                                    <div class="item large-4 columns end group-item-grid-default">
                                        <div class="post thumb-border">
                                            <div class="post-thumb">
                                                <img src="images/teach/370X220_1.png" alt="landing">
                                                <a href="#" class="hover-posts">
                                                        <span><i class="fa fa-play"></i>观看课程</span>
                                                </a>
                                                <div class="video-stats clearfix">
                                                    <div class="thumb-stats pull-left">
                                                        <h6>HD</h6>
                                                    </div>
                                                    <div class="thumb-stats pull-left">
                                                        <i class="fa fa-heart"></i>
                                                        <span>506</span>
                                                    </div>
                                                    <div class="thumb-stats pull-right">
                                                        <span>08;00</span>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="post-des">
                                                <h6><a href="#">网站建站的流程</a></h6>
                                                <div class="post-stats clearfix">
                                                    <p class="pull-left">
                                                        <i class="fa fa-user"></i>
                                                        <span><a href="#">admin</a></span>
                                                    </p>
                                                    <p class="pull-left">
                                                        <i class="fa fa-clock-o"></i>
                                                        <span>5 January 16</span>
                                                    </p>
                                                    <p class="pull-left">
                                                        <i class="fa fa-eye"></i>
                                                        <span>1,862K</span>
                                                    </p>
                                                </div>
                                                <div class="post-summary">
                                                    <p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt.</p>
                                                </div>
                                                <div class="post-button">
                                                    <a href="#" class="secondary-button"><i class="fa fa-play-circle"></i>watch video</a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="item large-4 columns end group-item-grid-default">
                                        <div class="post thumb-border">
                                            <div class="post-thumb">
                                                <img src="images/teach/370X220_1.png" alt="landing">
                                                <a href="#" class="hover-posts">
                                                    <span><i class="fa fa-play"></i>观看课程</span>
                                                </a>
                                                <div class="video-stats clearfix">
                                                    <div class="thumb-stats pull-left">
                                                        <h6>HD</h6>
                                                    </div>
                                                    <div class="thumb-stats pull-left">
                                                        <i class="fa fa-heart"></i>
                                                        <span>506</span>
                                                    </div>
                                                    <div class="thumb-stats pull-right">
                                                        <span>08:00</span>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="post-des">
                                                <h6><a href="#">网页的组成部分</a></h6>
                                                <div class="post-stats clearfix">
                                                    <p class="pull-left">
                                                        <i class="fa fa-user"></i>
                                                        <span><a href="#">admin</a></span>
                                                    </p>
                                                    <p class="pull-left">
                                                        <i class="fa fa-clock-o"></i>
                                                        <span>5 January 16</span>
                                                    </p>
                                                    <p class="pull-left">
                                                        <i class="fa fa-eye"></i>
                                                        <span>1,862K</span>
                                                    </p>
                                                </div>
                                                <div class="post-summary">
                                                    <p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt.</p>
                                                </div>
                                                <div class="post-button">
                                                    <a href="#" class="secondary-button"><i class="fa fa-play-circle"></i>watch video</a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="item large-4 columns end group-item-grid-default">
                                        <div class="post thumb-border">
                                            <div class="post-thumb">
                                                <img src="images/teach/370X220_1.png" alt="landing">
                                                <a href="#" class="hover-posts">
                                                    <span><i class="fa fa-play"></i>观看课程</span>
                                                </a>
                                                <div class="video-stats clearfix">
                                                    <div class="thumb-stats pull-left">
                                                        <h6>HD</h6>
                                                    </div>
                                                    <div class="thumb-stats pull-left">
                                                        <i class="fa fa-heart"></i>
                                                        <span>506</span>
                                                    </div>
                                                    <div class="thumb-stats pull-right">
                                                        <span>08:00</span>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="post-des">
                                                <h6><a href="#">HTML基础，文字标签，表单，表格，布局标签.</a></h6>
                                                <div class="post-stats clearfix">
                                                    <p class="pull-left">
                                                        <i class="fa fa-user"></i>
                                                        <span><a href="#">admin</a></span>
                                                    </p>
                                                    <p class="pull-left">
                                                        <i class="fa fa-clock-o"></i>
                                                        <span>5 January 16</span>
                                                    </p>
                                                    <p class="pull-left">
                                                        <i class="fa fa-eye"></i>
                                                        <span>1,862K</span>
                                                    </p>
                                                </div>
                                                <div class="post-summary">
                                                    <p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt.</p>
                                                </div>
                                                <div class="post-button">
                                                    <a href="#" class="secondary-button"><i class="fa fa-play-circle"></i>watch video</a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="item large-4 columns end group-item-grid-default">
                                        <div class="post thumb-border">
                                            <div class="post-thumb">
                                                <img src="images/teach/370X220_1.png" alt="landing">
                                                <a href="#" class="hover-posts">
                                                    <span><i class="fa fa-play"></i>观看课程</span>
                                                </a>
                                                <div class="video-stats clearfix">
                                                    <div class="thumb-stats pull-left">
                                                        <h6>HD</h6>
                                                    </div>
                                                    <div class="thumb-stats pull-left">
                                                        <i class="fa fa-heart"></i>
                                                        <span>506</span>
                                                    </div>
                                                    <div class="thumb-stats pull-right">
                                                        <span>08:00</span>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="post-des">
                                                <h6><a href="#">HTML5兼容问题讲解</a></h6>
                                                <div class="post-stats clearfix">
                                                    <p class="pull-left">
                                                        <i class="fa fa-user"></i>
                                                        <span><a href="#">admin</a></span>
                                                    </p>
                                                    <p class="pull-left">
                                                        <i class="fa fa-clock-o"></i>
                                                        <span>5 January 16</span>
                                                    </p>
                                                    <p class="pull-left">
                                                        <i class="fa fa-eye"></i>
                                                        <span>1,862K</span>
                                                    </p>
                                                </div>
                                                <div class="post-summary">
                                                    <p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt.</p>
                                                </div>
                                                <div class="post-button">
                                                    <a href="#" class="secondary-button"><i class="fa fa-play-circle"></i>watch video</a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="item large-4 columns end group-item-grid-default">
                                        <div class="post thumb-border">
                                            <div class="post-thumb">
                                                <img src="images/teach/370X220_1.png" alt="landing">
                                                <a href="#" class="hover-posts">
                                                    <span><i class="fa fa-play"></i>观看课程</span>
                                                </a>
                                                <div class="video-stats clearfix">
                                                    <div class="thumb-stats pull-left">
                                                        <h6>HD</h6>
                                                    </div>
                                                    <div class="thumb-stats pull-left">
                                                        <i class="fa fa-heart"></i>
                                                        <span>506</span>
                                                    </div>
                                                    <div class="thumb-stats pull-right">
                                                        <span>08:00</span>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="post-des">
                                                <h6><a href="#">HTML5新增应用标签.</a></h6>
                                                <div class="post-stats clearfix">
                                                    <p class="pull-left">
                                                        <i class="fa fa-user"></i>
                                                        <span><a href="#">admin</a></span>
                                                    </p>
                                                    <p class="pull-left">
                                                        <i class="fa fa-clock-o"></i>
                                                        <span>5 January 16</span>
                                                    </p>
                                                    <p class="pull-left">
                                                        <i class="fa fa-eye"></i>
                                                        <span>1,862K</span>
                                                    </p>
                                                </div>
                                                <div class="post-summary">
                                                    <p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt.</p>
                                                </div>
                                                <div class="post-button">
                                                    <a href="#" class="secondary-button"><i class="fa fa-play-circle"></i>watch video</a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="item large-4 columns end group-item-grid-default">
                                        <div class="post thumb-border">
                                            <div class="post-thumb">
                                                <img src="images/teach/370X220_1.png" alt="landing">
                                                <a href="#" class="hover-posts">
                                                    <span><i class="fa fa-play"></i>观看课程</span>
                                                </a>
                                                <div class="video-stats clearfix">
                                                    <div class="thumb-stats pull-left">
                                                        <h6>HD</h6>
                                                    </div>
                                                    <div class="thumb-stats pull-left">
                                                        <i class="fa fa-heart"></i>
                                                        <span>506</span>
                                                    </div>
                                                    <div class="thumb-stats pull-right">
                                                        <span>08:00</span>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="post-des">
                                                <h6><a href="#">HTML5新增标签讲解.</a></h6>
                                                <div class="post-stats clearfix">
                                                    <p class="pull-left">
                                                        <i class="fa fa-user"></i>
                                                        <span><a href="#">admin</a></span>
                                                    </p>
                                                    <p class="pull-left">
                                                        <i class="fa fa-clock-o"></i>
                                                        <span>5 January 16</span>
                                                    </p>
                                                    <p class="pull-left">
                                                        <i class="fa fa-eye"></i>
                                                        <span>1,862K</span>
                                                    </p>
                                                </div>
                                                <div class="post-summary">
                                                    <p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt.</p>
                                                </div>
                                                <div class="post-button">
                                                    <a href="#" class="secondary-button"><i class="fa fa-play-circle"></i>watch video</a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </section><!--end related posts-->
                    <!-- Comments -->
                    <section class="content comments">
                        <div class="row secBg">
                            <div class="large-12 columns">
                                <div class="main-heading borderBottom">
                                    <div class="row padding-14">
                                        <div class="medium-12 small-12 columns">
                                            <div class="head-title">
                                                <i class="fa fa-comments"></i>
                                                <h4>评论 <span>(4)</span></h4>
                                            </div>
                                        </div>
                                    </div>
                                </div>

                                <div class="comment-box thumb-border">
                                    <div class="media-object stack-for-small">
                                        <div class="media-object-section comment-img text-center">
                                            <div class="comment-box-img">
                                                <img src= "http://placehold.it/80x80" alt="comment">
                                            </div>
                                            <h6><a href="#">你的姓名</a></h6>
                                        </div>
                                        <div class="media-object-section comment-textarea">
                                            <form method="post">
                                                <textarea name="commentText" placeholder="Add a comment here.."></textarea>
                                                <input type="submit" name="submit" value="send">
                                            </form>
                                        </div>
                                    </div>
                                </div>

                                <div class="comment-sort text-right">
                                    <span>Sort By : <a href="#">newest</a> | <a href="#">oldest</a></span>
                                </div>

                                <!-- main comment -->
                                <div class="main-comment showmore_one">
                                    <div class="media-object stack-for-small">
                                        <div class="media-object-section comment-img text-center">
                                            <div class="comment-box-img">
                                                <img src= "http://placehold.it/80x80" alt="comment">
                                            </div>
                                        </div>
                                        <div class="media-object-section comment-desc">
                                            <div class="comment-title">
                                                <span class="name"><a href="#">Joseph John</a> Said:</span>
                                                <span class="time float-right"><i class="fa fa-clock-o"></i>1 minute ago</span>
                                            </div>
                                            <div class="comment-text">
                                                <p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventoresunt explicabo.</p>
                                            </div>
                                            <div class="comment-btns">
                                                <span><a href="#"><i class="fa fa-thumbs-o-up"></i></a> | <a href="#"><i class="fa fa-thumbs-o-down"></i></a></span>
                                                <span><a href="#"><i class="fa fa-share"></i>Reply</a></span>
                                                <span class='reply float-right hide-reply'></span>
                                            </div>

                                            <!--sub comment-->
                                            <div class="media-object stack-for-small reply-comment">
                                                <div class="media-object-section comment-img text-center">
                                                    <div class="comment-box-img">
                                                        <img src= "http://placehold.it/80x80" alt="comment">
                                                    </div>
                                                </div>
                                                <div class="media-object-section comment-desc">
                                                    <div class="comment-title">
                                                        <span class="name"><a href="#">Joseph John</a> Said:</span>
                                                        <span class="time float-right"><i class="fa fa-clock-o"></i>1 minute ago</span>
                                                    </div>
                                                    <div class="comment-text">
                                                        <p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventoresunt explicabo.</p>
                                                    </div>
                                                    <div class="comment-btns">
                                                        <span><a href="#"><i class="fa fa-thumbs-o-up"></i></a> | <a href="#"><i class="fa fa-thumbs-o-down"></i></a></span>
                                                        <span><a href="#"><i class="fa fa-share"></i>Reply</a></span>
                                                        <span class='reply float-right hide-reply'></span>
                                                    </div>
                                                </div>
                                            </div><!-- end sub comment -->

                                            <!--sub comment-->
                                            <div class="media-object stack-for-small reply-comment">
                                                <div class="media-object-section comment-img text-center">
                                                    <div class="comment-box-img">
                                                        <img src= "http://placehold.it/80x80" alt="comment">
                                                    </div>
                                                </div>
                                                <div class="media-object-section comment-desc">
                                                    <div class="comment-title">
                                                        <span class="name"><a href="#">Joseph John</a> Said:</span>
                                                        <span class="time float-right"><i class="fa fa-clock-o"></i>1 minute ago</span>
                                                    </div>
                                                    <div class="comment-text">
                                                        <p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventoresunt explicabo.</p>
                                                    </div>
                                                    <div class="comment-btns">
                                                        <span><a href="#"><i class="fa fa-thumbs-o-up"></i></a> | <a href="#"><i class="fa fa-thumbs-o-down"></i></a></span>
                                                        <span><a href="#"><i class="fa fa-share"></i>Reply</a></span>
                                                        <span class='reply float-right hide-reply'></span>
                                                    </div>

                                                </div>
                                            </div><!-- end sub comment -->

                                        </div>
                                    </div>

                                    <div class="media-object stack-for-small">
                                        <div class="media-object-section comment-img text-center">
                                            <div class="comment-box-img">
                                                <img src= "http://placehold.it/80x80" alt="comment">
                                            </div>
                                        </div>
                                        <div class="media-object-section comment-desc">
                                            <div class="comment-title">
                                                <span class="name"><a href="#">Joseph John</a> Said:</span>
                                                <span class="time float-right"><i class="fa fa-clock-o"></i>1 minute ago</span>
                                            </div>
                                            <div class="comment-text">
                                                <p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventoresunt explicabo.</p>
                                            </div>
                                            <div class="comment-btns">
                                                <span><a href="#"><i class="fa fa-thumbs-o-up"></i></a> | <a href="#"><i class="fa fa-thumbs-o-down"></i></a></span>
                                                <span><a href="#"><i class="fa fa-share"></i>Reply</a></span>
                                                <span class='reply float-right hide-reply'></span>
                                            </div>

                                        </div>
                                    </div>

                                    <div class="media-object stack-for-small">
                                        <div class="media-object-section comment-img text-center">
                                            <div class="comment-box-img">
                                                <img src= "http://placehold.it/80x80" alt="comment">
                                            </div>
                                        </div>
                                        <div class="media-object-section comment-desc">
                                            <div class="comment-title">
                                                <span class="name"><a href="#">Joseph John</a> Said:</span>
                                                <span class="time float-right"><i class="fa fa-clock-o"></i>1 minute ago</span>
                                            </div>
                                            <div class="comment-text">
                                                <p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventoresunt explicabo.</p>
                                            </div>
                                            <div class="comment-btns">
                                                <span><a href="#"><i class="fa fa-thumbs-o-up"></i></a> | <a href="#"><i class="fa fa-thumbs-o-down"></i></a></span>
                                                <span><a href="#"><i class="fa fa-share"></i>Reply</a></span>
                                                <span class='reply float-right hide-reply'></span>
                                            </div>
                                            <!--sub comment-->
                                            <div class="media-object stack-for-small reply-comment">
                                                <div class="media-object-section comment-img text-center">
                                                    <div class="comment-box-img">
                                                        <img src= "http://placehold.it/80x80" alt="comment">
                                                    </div>
                                                </div>
                                                <div class="media-object-section comment-desc">
                                                    <div class="comment-title">
                                                        <span class="name"><a href="#">Joseph John</a> Said:</span>
                                                        <span class="time float-right"><i class="fa fa-clock-o"></i>1 minute ago</span>
                                                    </div>
                                                    <div class="comment-text">
                                                        <p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventoresunt explicabo.</p>
                                                    </div>
                                                    <div class="comment-btns">
                                                        <span><a href="#"><i class="fa fa-thumbs-o-up"></i></a> | <a href="#"><i class="fa fa-thumbs-o-down"></i></a></span>
                                                        <span><a href="#"><i class="fa fa-share"></i>Reply</a></span>
                                                        <span class='reply float-right hide-reply'></span>
                                                    </div>
                                                    <!--sub comment-->
                                                    <div class="media-object stack-for-small reply-comment">
                                                        <div class="media-object-section comment-img text-center">
                                                            <div class="comment-box-img">
                                                                <img src= "http://placehold.it/80x80" alt="comment">
                                                            </div>
                                                        </div>
                                                        <div class="media-object-section comment-desc">
                                                            <div class="comment-title">
                                                                <span class="name"><a href="#">Joseph John</a> Said:</span>
                                                                <span class="time float-right"><i class="fa fa-clock-o"></i>1 minute ago</span>
                                                            </div>
                                                            <div class="comment-text">
                                                                <p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventoresunt explicabo.</p>
                                                            </div>
                                                            <div class="comment-btns">
                                                                <span><a href="#"><i class="fa fa-thumbs-o-up"></i></a> | <a href="#"><i class="fa fa-thumbs-o-down"></i></a></span>
                                                                <span><a href="#"><i class="fa fa-share"></i>Reply</a></span>
                                                                <span class='reply float-right hide-reply'></span>
                                                            </div>
                                                        </div>
                                                    </div><!-- end sub comment -->
                                                </div>
                                            </div><!-- end sub comment -->
                                        </div>
                                    </div>
                                </div><!-- End main comment -->

                            </div>
                        </div>
                    </section><!-- End Comments -->
                </div><!-- end left side content area -->
                <!-- sidebar -->
                <div class="large-4 columns">
                    <aside class="secBg sidebar">
                        <div class="row">
                            <!-- search Widget -->
                            <div class="large-12 medium-7 medium-centered columns">
                                <div class="widgetBox">
                                    <div class="widgetTitle">
                                        <h5>搜索视频</h5>
                                    </div>
                                    <form id="searchform" method="get" role="search">
                                        <div class="input-group">
                                            <input class="input-group-field" type="text" placeholder="请输入您想搜索的关键词">
                                            <div class="input-group-button">
                                                <input type="submit" class="button" value="搜索">
                                            </div>
                                        </div>
                                    </form>
                                </div>
                            </div><!-- End search Widget -->

                            <!-- most view Widget -->
                            <div class="large-12 medium-7 medium-centered columns">
                                <div class="widgetBox">
                                    <div class="widgetTitle">
                                        <h5>相关视频推荐</h5>
                                    </div>
                                    <div class="widgetContent">
                                        <div class="video-box thumb-border">
                                            <div class="video-img-thumb">
                                                <img src="images/teach/300x190_1.jpg" alt="most viewed videos">
                                                <a href="#" class="hover-posts">
                                                    <span><i class="fa fa-play"></i>Watch Video</span>
                                                </a>
                                            </div>
                                            <div class="video-box-content">
                                                <h6><a href="#">There are many variations of passage. </a></h6>
                                                <p>
                                                    <span><i class="fa fa-user"></i><a href="#">admin</a></span>
                                                    <span><i class="fa fa-clock-o"></i>5 January 16</span>
                                                    <span><i class="fa fa-eye"></i>1,862K</span>
                                                </p>
                                            </div>
                                        </div>
                                        <div class="video-box thumb-border">
                                            <div class="video-img-thumb">
                                                <img src="images/teach/300x190_2.jpg" alt="most viewed videos">
                                                <a href="#" class="hover-posts">
                                                    <span><i class="fa fa-play"></i>Watch Video</span>
                                                </a>
                                            </div>
                                            <div class="video-box-content">
                                                <h6><a href="#">There are many variations of passage. </a></h6>
                                                <p>
                                                    <span><i class="fa fa-user"></i><a href="#">admin</a></span>
                                                    <span><i class="fa fa-clock-o"></i>5 January 16</span>
                                                    <span><i class="fa fa-eye"></i>1,862K</span>
                                                </p>
                                            </div>
                                        </div>
                                        <div class="video-box thumb-border">
                                            <div class="video-img-thumb">
                                                <img src="images/teach/300x190_3.jpg" alt="most viewed videos">
                                                <a href="#" class="hover-posts">
                                                    <span><i class="fa fa-play"></i>Watch Video</span>
                                                </a>
                                            </div>
                                            <div class="video-box-content">
                                                <h6><a href="#">There are many variations of passage. </a></h6>
                                                <p>
                                                    <span><i class="fa fa-user"></i><a href="#">admin</a></span>
                                                    <span><i class="fa fa-clock-o"></i>5 January 16</span>
                                                    <span><i class="fa fa-eye"></i>1,862K</span>
                                                </p>
                                            </div>
                                        </div>
                                        <div class="video-box thumb-border">
                                            <div class="video-img-thumb">
                                                <img src="images/teach/300x190_4.jpg" alt="most viewed videos">
                                                <a href="#" class="hover-posts">
                                                    <span><i class="fa fa-play"></i>Watch Video</span>
                                                </a>
                                            </div>
                                            <div class="video-box-content">
                                                <h6><a href="#">There are many variations of passage. </a></h6>
                                                <p>
                                                    <span><i class="fa fa-user"></i><a href="#">admin</a></span>
                                                    <span><i class="fa fa-clock-o"></i>5 January 16</span>
                                                    <span><i class="fa fa-eye"></i>1,862K</span>
                                                </p>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div><!-- end most view Widget -->

                            <!-- categories -->
                            <div class="large-12 medium-7 medium-centered columns">
                                <div class="widgetBox clearfix">
                                    <div class="widgetTitle">
                                        <h5>Categories</h5>
                                    </div>
                                    <div class="widgetContent clearfix">
                                        <ul>
                                            <li class="cat-item"><a href="#">Entertainment &nbsp; (6)</a></li>
                                            <li class="cat-item"><a href="#">Historical &amp; Archival &nbsp;(8)</a></li>
                                            <li class="cat-item"><a href="#">Technology&nbsp;(4)</a></li>
                                            <li class="cat-item"><a href="#">People&nbsp;(3)</a></li>
                                            <li class="cat-item"><a href="#">Fashion &amp; Beauty&nbsp;(2)</a></li>
                                            <li class="cat-item"><a href="#">Nature&nbsp;(1)</a></li>
                                            <li class="cat-item"><a href="#">Automotive&nbsp;(5)</a></li>
                                            <li class="cat-item"><a href="">Foods &amp; Drinks&nbsp;(5)</a></li>
                                            <li class="cat-item"><a href="#">Foods &amp; Drinks&nbsp;(10)</a></li>
                                            <li class="cat-item"><a href="#">Animals&nbsp;(12)</a></li>
                                            <li class="cat-item"><a href="#">Sports &amp; Recreation&nbsp;(14)</a></li>
                                            <li class="cat-item"><a href="">Places &amp; Landmarks&nbsp;(16)</a></li>
                                            <li class="cat-item"><a href="">Places &amp; Landmarks&nbsp;(1)</a></li>
                                            <li class="cat-item"><a href="#">Travel&nbsp;(2)</a></li>
                                            <li class="cat-item"><a href="#">Transportation&nbsp;(3)</a></li>
                                        </ul>
                                    </div>
                                </div>
                            </div>

                            <!-- social Fans Widget -->
                            <div class="large-12 medium-7 medium-centered columns">
                                <div class="widgetBox">
                                    <div class="widgetTitle">
                                        <h5>social fans</h5>
                                    </div>
                                    <div class="widgetContent">
                                        <div class="social-links">
                                            <a class="socialButton" href="#">
                                                <i class="fa fa-facebook"></i>
                                                <span>698K</span>
                                                <span>fans</span>
                                            </a>
                                            <a class="socialButton" href="#">
                                                <i class="fa fa-twitter"></i>
                                                <span>598</span>
                                                <span>followers</span>
                                            </a>
                                            <a class="socialButton" href="#">
                                                <i class="fa fa-google-plus"></i>
                                                <span>98k</span>
                                                <span>followers</span>
                                            </a>
                                            <a class="socialButton" href="#">
                                                <i class="fa fa-youtube"></i>
                                                <span>168k</span>
                                                <span>followers</span>
                                            </a>
                                            <a class="socialButton" href="#">
                                                <i class="fa fa-vimeo"></i>
                                                <span>498</span>
                                                <span>followers</span>
                                            </a>
                                        </div>
                                    </div>
                                </div>
                            </div><!-- End social Fans Widget -->

                            <!-- ad banner widget -->
                            <div class="large-12 medium-7 medium-centered columns">
                                <div class="widgetBox">
                                    <div class="widgetTitle">
                                        <h5>Recent post videos</h5>
                                    </div>
                                    <div class="widgetContent">
                                        <div class="advBanner text-center">
                                            <a href="#"><img src="images/sideradv.png" alt="sidebar adv"></a>
                                        </div>
                                    </div>
                                </div>
                            </div><!-- end ad banner widget -->

                            <!-- Recent post videos -->
                            <div class="large-12 medium-7 medium-centered columns">
                                <div class="widgetBox">
                                    <div class="widgetTitle">
                                        <h5>Recent post videos</h5>
                                    </div>
                                    <div class="widgetContent">
                                        <div class="media-object stack-for-small">
                                            <div class="media-object-section">
                                                <div class="recent-img">
                                                    <img src= "http://placehold.it/120x80" alt="recent">
                                                    <a href="#" class="hover-posts">
                                                        <span><i class="fa fa-play"></i></span>
                                                    </a>
                                                </div>
                                            </div>
                                            <div class="media-object-section">
                                                <div class="media-content">
                                                    <h6><a href="#">The lorem Ipsumbeen the industry's standard.</a></h6>
                                                    <p><i class="fa fa-user"></i><span>admin</span><i class="fa fa-clock-o"></i><span>5 january 16</span></p>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="media-object stack-for-small">
                                            <div class="media-object-section">
                                                <div class="recent-img">
                                                    <img src= "http://placehold.it/120x80" alt="recent">
                                                    <a href="#" class="hover-posts">
                                                        <span><i class="fa fa-play"></i></span>
                                                    </a>
                                                </div>
                                            </div>
                                            <div class="media-object-section">
                                                <div class="media-content">
                                                    <h6><a href="#">The lorem Ipsumbeen the industry's standard.</a></h6>
                                                    <p><i class="fa fa-user"></i><span>admin</span><i class="fa fa-clock-o"></i><span>5 january 16</span></p>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="media-object stack-for-small">
                                            <div class="media-object-section">
                                                <div class="recent-img">
                                                    <img src= "http://placehold.it/120x80" alt="recent">
                                                    <a href="#" class="hover-posts">
                                                        <span><i class="fa fa-play"></i></span>
                                                    </a>
                                                </div>
                                            </div>
                                            <div class="media-object-section">
                                                <div class="media-content">
                                                    <h6><a href="#">The lorem Ipsumbeen the industry's standard.</a></h6>
                                                    <p><i class="fa fa-user"></i><span>admin</span><i class="fa fa-clock-o"></i><span>5 january 16</span></p>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="media-object stack-for-small">
                                            <div class="media-object-section">
                                                <div class="recent-img">
                                                    <img src= "http://placehold.it/120x80" alt="recent">
                                                    <a href="#" class="hover-posts">
                                                        <span><i class="fa fa-play"></i></span>
                                                    </a>
                                                </div>
                                            </div>
                                            <div class="media-object-section">
                                                <div class="media-content">
                                                    <h6><a href="#">The lorem Ipsumbeen the industry's standard.</a></h6>
                                                    <p><i class="fa fa-user"></i><span>admin</span><i class="fa fa-clock-o"></i><span>5 january 16</span></p>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div><!-- End Recent post videos -->

                            <!-- tags -->
                            <div class="large-12 medium-7 medium-centered columns">
                                <div class="widgetBox">
                                    <div class="widgetTitle">
                                        <h5>Tags</h5>
                                    </div>
                                    <div class="tagcloud">
                                        <a href="#">3D Videos</a>
                                        <a href="#">Videos</a>
                                        <a href="#">HD</a>
                                        <a href="#">Movies</a>
                                        <a href="#">Sports</a>
                                        <a href="#">3D</a>
                                        <a href="#">Movies</a>
                                        <a href="#">Animation</a>
                                        <a href="#">HD</a>
                                        <a href="#">Music</a>
                                        <a href="#">Recreation</a>
                                    </div>
                                </div>
                            </div><!-- End tags -->
                        </div>
                    </aside>
                </div><!-- end sidebar -->
            </div>

            <!-- footer -->
            <footer>
                <div class="row">
                    <div class="large-3 medium-6 columns">
                        <div class="widgetBox">
                            <div class="widgetTitle">
                                <h5>我们的优势</h5>
                            </div>
                            <div class="textwidget">
                                （1）为了方便各学员能随时随地的学习，摆脱纸质书本的困扰，让计划赶得上变化；<br>
                                （2）方便各学院相关负责人的老师对学生的学习情况进行管理，并从学生提交的成绩反馈中考虑是否该生成绩合格并进行考试。<br>
                                （3）为了给学员提供更多的学习资源，在学习时能够得到及时的扩充，减少了学员学习的盲目性。<br>
                                （4）在网络流行的至今，该系统可以减少外界对学员的干扰，也可以起到督促的作用。
                            </div>
                        </div>
                    </div>
                    <div class="large-3 medium-6 columns">
                        <div class="widgetBox">
                            <div class="widgetTitle">
                                <h5>最近视频</h5>
                            </div>
                            <div class="widgetContent">
                                <div class="media-object">
                                    <div class="media-object-section">
                                        <div class="recent-img">
                                            <img src= "http://placehold.it/80x80" alt="recent">
                                            <a href="#" class="hover-posts">
                                                <span><i class="fa fa-play"></i></span>
                                            </a>
                                        </div>
                                    </div>
                                    <div class="media-object-section">
                                        <div class="media-content">
                                            <h6><a href="#">The lorem Ipsumbeen the industry's standard.</a></h6>
                                            <p><i class="fa fa-user"></i><span>admin</span><i class="fa fa-clock-o"></i><span>5 january 16</span></p>
                                        </div>
                                    </div>
                                </div>
                                <div class="media-object">
                                    <div class="media-object-section">
                                        <div class="recent-img">
                                            <img src= "http://placehold.it/80x80" alt="recent">
                                            <a href="#" class="hover-posts">
                                                <span><i class="fa fa-play"></i></span>
                                            </a>
                                        </div>
                                    </div>
                                    <div class="media-object-section">
                                        <div class="media-content">
                                            <h6><a href="#">The lorem Ipsumbeen the industry's standard.</a></h6>
                                            <p><i class="fa fa-user"></i><span>admin</span><i class="fa fa-clock-o"></i><span>5 january 16</span></p>
                                        </div>
                                    </div>
                                </div>
                                <div class="media-object">
                                    <div class="media-object-section">
                                        <div class="recent-img">
                                            <img src= "http://placehold.it/80x80" alt="recent">
                                            <a href="#" class="hover-posts">
                                                <span><i class="fa fa-play"></i></span>
                                            </a>
                                        </div>
                                    </div>
                                    <div class="media-object-section">
                                        <div class="media-content">
                                            <h6><a href="#">The lorem Ipsumbeen the industry's standard.</a></h6>
                                            <p><i class="fa fa-user"></i><span>admin</span><i class="fa fa-clock-o"></i><span>5 january 16</span></p>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="large-3 medium-6 columns">
                        <div class="widgetBox">
                            <div class="widgetTitle">
                                <h5>标签</h5>
                            </div>
                            <div class="tagcloud">

                                <a href="#">课程</a>
                                <a href="#">高清</a>
                                <a href="#">奢华</a>
                                <a href="#">高端</a>
                                <a href="#">会员</a>
                                <a href="#">清华名师一对一</a>
                                <a href="#">北大名师一对一     </a>
                                <a href="#">重工名师一对一</a>
                                <a href="#">线下</a>
                                <a href="#">线上</a>
                                <a href="#">在线辅导</a>
                            </div>
                        </div>
                    </div>
                    <div class="large-3 medium-6 columns">
                        <div class="widgetBox">
                            <div class="widgetTitle">
                                <h5>立即体验</h5>
                            </div>
                            <div class="widgetContent">
                                <form data-abide novalidate method="post">
                                    <p>享受你的专属课程</p>
                                    <div class="input">
                                        <input type="text" placeholder="Enter your full Name" required>
                                        <span class="form-error">
                                            Yo, you had better fill this out, it's required.
                                        </span>
                                    </div>
                                    <div class="input">
                                        <input type="email" id="email" placeholder="Enter your email addres" required>
                                        <span class="form-error">
                                          I'm required!
                                        </span>
                                    </div>
                                    <button class="button" type="submit" value="Submit">立即体验</button>
                                </form>
                                <div class="social-links">
                                    <h5>你值得拥有</h5>
                                    <a class="secondary-button" href="#"><i class="fa fa-facebook"></i></a>
                                    <a class="secondary-button" href="#"><i class="fa fa-twitter"></i></a>
                                    <a class="secondary-button" href="#"><i class="fa fa-google-plus"></i></a>
                                    <a class="secondary-button" href="#"><i class="fa fa-instagram"></i></a>
                                    <a class="secondary-button" href="#"><i class="fa fa-vimeo"></i></a>
                                    <a class="secondary-button" href="#"><i class="fa fa-youtube"></i></a>
                                    <a class="secondary-button" href="#"><i class="fa fa-flickr"></i></a>

                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <a href="#" id="back-to-top" title="Back to top"><i class="fa fa-angle-double-up"></i></a>
            </footer><!-- footer -->
            <div id="footer-bottom">
                <div class="logo text-center">
                    <img src="images/footerlogo.png" alt="footer logo">
                </div>
                <div class="btm-footer-text text-center">
                    <p>2016 © Betube video wordpress theme.</p>
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
</body>
</html>