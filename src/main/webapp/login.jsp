<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>登陆页面</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta name="Keywords" content="网站关键词">
    <meta name="Description" content="网站介绍">
    <link rel="stylesheet" href="css/base.css">
    <link rel="stylesheet" href="css/iconfont.css">
    <link rel="stylesheet" href="css/reg.css">
  </head>
  
  <body>
    <div id="ajax-hook"></div>
	<div class="wrap">
	    <div class="wpn">
	        <div class="form-data pos">
	            <a href="#"><img src="img/logo.png" class="head-logo"></a>
	            <div class="change-login">
	                <p class="account_number on">账号登录</p>
	            </div>
	            <form action="login" method="post">
		            <div class="form1">
		                <p class="p-input pos">
		                    <label for="num" style="">请输入用户名</label>
		                    <input type="text" id="num" name="loginid">
		                    <span class="tel-warn num-err hide"><em>账号或密码错误，请重新输入</em><i class="icon-warn"></i></span>
		                </p>
		                <p class="p-input pos">
		                    <label for="pass" style="display: none;">请输入密码</label>
		                    <input type="password" style="display:none">
		                    <input type="password" id="pass" autocomplete="new-password" name="password">
		                    <span class="tel-warn pass-err hide"><em>账号或密码错误，请重新输入</em><i class="icon-warn"></i></span>
		                </p>
		            </div>
		            <button class="lang-btn off log-btn">登录</button>
	            </form>
	            <p class="right">Powered by ? 2018</p>
	        </div>
	    </div>
	</div>
	<script src="js/jquery-1.8.3.js"></script>
	<script src="js/agree.js"></script>
	<script src="js/login.js"></script>
	    
  </body>
</html>
