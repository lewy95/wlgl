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
<h1 align="center">回告历史</h1>
<hr>
<table class="table table-striped table-bordered table-hover table-condensed" width="1000px" align="center">
    <thead>
    <tr>
        <td>ID</td>
        <td>拨出号码</td>
        <td>类别</td>
        <td>内容</td>
        <td>填写时间</td>
        <td>填写人</td>
        <td>最后拨出时间</td>
        <td>单据号</td>
        <td>单据类型</td>
    </tr>
    </thead>
    <tbody>
    <s:iterator value="#callbacks" status="i">
        <tr>
            <td><s:property value="id"/></td>
            <td><s:property value="dialNo"/></td>
            <td><s:property value="type"/></td>
            <td><s:property value="content"/></td>
            <td><s:date name="writeTime" format="yyyy-MM-dd"/></td>
            <td><s:property value="writer"/></td>
            <td><s:date name="finallyDialTime" format="yyyy-MM-dd"/></td>
            <td><s:property value="billId"/></td>
            <td><s:property value="billType"/></td>
        </tr>
    </s:iterator>
    </tbody>
</table>
</body>
</html>
