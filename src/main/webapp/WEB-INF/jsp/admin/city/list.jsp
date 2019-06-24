<%--
  Created by IntelliJ IDEA.
  User: yuehailin
  Date: 2018/6/7
  Time: 9:10
  To change this template use File | Settings | File Templates.
--%>
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
    <title>Customer List</title>
    <script type="text/javascript" src="js/jquery-1.8.3.js"></script>
    <link href="css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
    <link href="css/publiccss.css" rel="stylesheet">
    <script src="js/bootstrap/3.3.6/bootstrap.min.js"></script>
</head>

<body>
<h1 align="center">城市信息列表</h1>
<hr>
<table width="300px" align="center" class="table table-striped table-bordered table-hover table-condensed">
    <thead>
    <tr>
        <td>ID</td>
        <td>城市名</td>
        <td>操作</td>
    </tr>
    </thead>
    <tbody>
    <s:iterator value="#city28s" status="i">
        <tr>
            <td><s:property value="#i.count"/></td>
            <td><s:property value="City"/></td>
            <td>
                <a href="city_updateInput?id=<s:property value='id'/>">修改</a>
                <a href="city_delete?id=<s:property value='id'/>">删除</a>
            </td>
        </tr>
    </s:iterator>
    </tbody>
</table>
</body>
</html>

