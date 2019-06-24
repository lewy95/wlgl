<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>driverHz List</title>
    <script type="text/javascript" src="js/jquery-1.8.3.js"></script>
    <link href="css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
    <link href="css/publiccss.css" rel="stylesheet">
    <script src="js/bootstrap/3.3.6/bootstrap.min.js"></script>
</head>

<body>
<h1 align="center">司机回执信息列表</h1>
<hr>
<table width="800px" align="center" class="table table-striped table-bordered table-hover table-condensed">
    <thead>
    <tr>
        <td>ID</td>
        <td>货运回执编号</td>
        <td>司机名称</td>
        <td>收货人</td>
        <td>收货日期</td>
        <td>操作</td>
    </tr>
    </thead>
    <tbody>
    <s:iterator value="#driverHzds" status="i">
        <tr>
            <td><s:property value="#i.count"/></td>
            <td><s:property value="GoodsRevertCode"/></td>
            <td><s:property value="DriverName"/></td>
            <td><s:property value="ReceiveGoodsPerson"/></td>
            <td><s:date name="ReceiveGoodsDate" format="yyyy-MM-dd"/></td>
            <td>
                <a href="#">查看详情</a>
            </td>
        </tr>
    </s:iterator>
    </tbody>
</table>
</body>
</html>
