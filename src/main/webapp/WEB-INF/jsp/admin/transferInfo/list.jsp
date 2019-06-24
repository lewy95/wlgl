<%--
  Created by IntelliJ IDEA.
  User: yuehailin
  Date: 2018/6/7
  Time: 11:04
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
<h1 align="center">中转信息列表</h1>
<hr>
<table width="1000px" align="center" class="table table-striped table-bordered table-hover table-condensed">
    <thead>
    <tr>
        <td>ID</td>
        <td>货运编号</td>
        <td>中转地</td>
        <td>中转验收人</td>
        <td>验收时间</td>
        <td>描述</td>
        <td>中转公司名</td>
        <td>中转地址</td>
        <td>中转地电话</td>
        <td>中转费</td>
    </tr>
    </thead>
    <tbody>
    <s:iterator value="#transferInfo10s" status="i">
        <tr>
            <td><s:property value="#i.count"/></td>
            <td><s:property value="GoodsBillCode"/></td>
            <td><s:property value="TransferStation"/></td>
            <td><s:property value="TransferCheck"/></td>
            <td><s:date name="CheckTime" format="yyyy-MM-dd"/></td>
            <td><s:property value="Description"/></td>
            <td><s:property value="TransferCompany"/></td>
            <td><s:property value="TransferAddr"/></td>
            <td><s:property value="TransferStationTel"/></td>
            <td><s:property value="TransferFee"/></td>
        </tr>
    </s:iterator>
    </tbody>
</table>
</body>
</html>
