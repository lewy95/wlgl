<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

    <title>top jsp</title>
    <link rel="stylesheet" type="text/css" href="css/top.css">
    <script type="text/javascript">
        setInterval("clock.innerHTML=new Date().toLocaleString() + '&nbsp;&nbsp;' " +
            "+ ''.charAt(new Date().getDay());", 1000);
    </script>
</head>

<body>
<div id="con">
    <div id="left">国际物流管理系统</div>
    <div id="right">
    		<span>
    			欢迎
                <s:property value="#session['loginUser'].getNickname()"/>
    		<a href="logout" target="_top">退出</a>
    		</span>&nbsp;&nbsp;
        <span id="clock"></span>
    </div>
</div>
</body>
</html>
