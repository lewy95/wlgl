<%--
  Created by IntelliJ IDEA.
  User: yuehailin
  Date: 2018/6/6
  Time: 13:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>Route List</title>
    <script type="text/javascript" src="js/jquery-1.8.3.js"></script>
    <link href="css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
    <link href="css/publiccss.css" rel="stylesheet">
    <script src="js/bootstrap/3.3.6/bootstrap.min.js"></script>
</head>

<body>
<h1 align="center">路线信息列表</h1>
<hr>
<table class="table table-striped table-bordered table-hover table-condensed" width="700px" align="center">
    <thead>
    <tr>
        <td>ID</td>
        <td>起点</td>
        <td>终点</td>
        <td>历程</td>
        <td>抵达时间</td>
        <td>操作</td>
    </tr>
    </thead>
    <tbody>
    <s:iterator value="#route30s" status="i">
        <tr>
            <td><s:property value="id"/></td>
            <td><s:property value="StartStation"/></td>
            <td><s:property value="EndStation"/></td>
            <td><s:property value="Distance"/></td>
            <td><s:property value="FetchTime"/></td>
            <td>
                <a href="route_updateInput?id=<s:property value='id'/>">修改</a>
                <a href="route_delete?id=<s:property value='id'/>">删除</a>
            </td>
        </tr>
    </s:iterator>
    </tbody>
</table>
</body>
</html>
