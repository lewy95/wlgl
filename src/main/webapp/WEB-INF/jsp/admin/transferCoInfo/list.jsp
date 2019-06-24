<%--
  Created by IntelliJ IDEA.
  User: yuehailin
  Date: 2018/6/7
  Time: 11:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="js/jquery-1.8.3.js"></script>
    <link href="css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
    <link href="css/publiccss.css" rel="stylesheet">
    <script src="js/bootstrap/3.3.6/bootstrap.min.js"></script>
</head>
<body>
<h1 align="center">中转公司列表</h1>
<hr>
<table class="table table-striped table-bordered table-hover table-condensed" width="1000px" align="center">
    <thead>
    <tr>
        <td>ID</td>
        <td>城市名</td>
        <td>公司名称</td>
        <td>联系电话</td>
        <td>详细地址</td>
    </tr>
    </thead>
    <tbody>
    <s:iterator value="#transferCoInfo11s" status="i">
        <tr>
            <td><s:property value="#i.count"/></td>
            <td><s:property value="City"/></td>
            <td><s:property value="CompanyName"/></td>
            <td><s:property value="LinkPhone"/></td>
            <td><s:property value="DetailAddress"/></td>
        </tr>
    </s:iterator>
    </tbody>
</table>
</body>
</html>
