<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<script>

function shogMinLogin(){
    var mini_login = document.getElementsByClassName("mini_login")[0];
    var cover = document.getElementsByClassName("cover")[0];
    mini_login.style.display = "block";
    cover.style.display = "block";
    
    mini_login.style.left = (document.body.scrollWidth - mini_login.scrollWidth) / 2 + "px";
 
}
window.onload = function(){
    /* document.getElementById("btn_showlogin").onclick = shogMinLogin; */
    document.getElementById("close_minilogin").onclick = closeLogin;
    document.getElementById("firstLine").onmousedown = moveLogin;
    /* 显示登录窗口 */
    function shogMinLogin(){
        var mini_login = document.getElementsByClassName("mini_login")[0];
        var cover = document.getElementsByClassName("cover")[0];
        mini_login.style.display = "block";
        cover.style.display = "block";
        
        mini_login.style.left = (document.body.scrollWidth - mini_login.scrollWidth) / 2 + "px";
     
    }

    /* 关闭登录窗口 */
    function closeLogin(){
        var mini_login = document.getElementsByClassName("mini_login")[0];
        var cover = document.getElementsByClassName("cover")[0];
        mini_login.style.display = "none";
        cover.style.display = "none";
    }

  
};
</script>

<style>    
    /* 弹出 样式 */
    .mini_login{
        display:none;
        position:absolute;
        z-index:2;
        background:white;
    }
    .mini_login .item{
        width:320px;
        margin:0 auto;
        height:48px;
        line-height:48px;
        padding:0 20px;
    }
    /* 登录窗第一行*/
    .mini_login .firstLine{
        color:#666;
        background:#f7f7f7;
        font-size:18px;
        font-weight:bold;
       /*  cursor:move; */
    }
    .mini_login .item .login_close{
        display:inline-block;
        float:right;
        cursor:pointer;
    }
    
    .mini_login .item label{
        font-size:14px;
        margin-right:15px;
    }
    .mini_login .item input{
        display:inline-block;
        height:60%;
        width:70%;
    }
    /* 登录按钮 */
    .mini_login .item a.btn_login{
        display:block;
        margin:10px 10% 0;
        height:30px;
        line-height:30px;
        width:80%;
        background:#4490F7;
        color:white;
        font-size:16px;
        font-weight:bold;
        text-align:center;
    }
    /* 遮罩层样式 */
    .cover{
        display:none;
        width:100%;
        height:100%;
        position:absolute;
        top:0;
        left:0;
        z-index:1;
        background-color:#000;
        opacity:0.3;
    }
</style>

</head>
<body>
<!-- 主体 -->
<div class="main">
    <a href="#" class="btn_login" id="btn_showlogin" onclick="shogMinLogin()">登录框</a>
</div>

<!-- 弹出登录小窗口 -->
<div class="mini_login" id="mini_login">
    <!-- 表单 -->
<form action="" method="post">
    <div class="item firstLine" id="firstLine">
        <span class="login_title">我要登录</span>
        <span class="login_close" id="close_minilogin">X</span>
    </div>
    <div class="item">
        <label>用户</label>
        <input type="text" name="uname" />
    </div>
    <div class="item">
        <label>密码</label>
        <input type="password" name="upwd" />
    </div>
    <div class="item">
        <a href="javascript:void(0)" class="btn_login" onclick="">登录</a>
    </div>
</form>
</div>
<!-- 遮罩层 -->
<div class="cover"></div>



</body>
</html>