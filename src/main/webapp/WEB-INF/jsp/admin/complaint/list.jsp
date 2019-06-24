<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>Complaint List</title>

    <script type="text/javascript" src="js/jquery-1.8.3.js"></script>
    <link href="css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
    <link href="css/publiccss.css" rel="stylesheet">
    <script src="js/bootstrap/3.3.6/bootstrap.min.js"></script>
</head>

<body>
<h1 align="center">投诉信息</h1>
<hr>
<table width="1000px" align="center" class="table table-striped table-bordered table-hover table-condensed">
    <thead>
    <tr>
        <td>ID</td>
        <td>客户名称</td>
        <td>货运单编号</td>
        <td>投诉内容</td>
        <td>投诉日期</td>
        <td>是否处理</td>
        <td>处理日期</td>
        <td>处理结果</td>
        <td>是否回告</td>
        <td>回告日期</td>
        <td>处理人</td>
    </tr>
    </thead>
    <tbody>
    <s:iterator value="#complaints" status="i">
        <tr>
            <td><s:property value="id"/></td>
            <td><s:property value="customer"/></td>
            <td><s:property value="goodsBillCode"/></td>
            <td><s:property value="appealContent"/></td>
            <td><s:property value="appealDate"/></td>
            <td><s:property value="ifHandle"/></td>
            <td><s:property value="dealDate"/></td>
            <td><s:property value="dealResult"/></td>
            <td><s:property value="ifCallback"/></td>
            <td><s:property value="callBackDate"/></td>
            <td><s:property value="dealPerson"/></td>
        </tr>
    </s:iterator>
    </tbody>
</table>
</body>
</html>
