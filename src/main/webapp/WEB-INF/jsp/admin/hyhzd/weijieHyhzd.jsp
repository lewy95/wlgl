<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>weichu Hyhzd</title>
    <script type="text/javascript" src="js/jquery-1.8.3.js"></script>
    <link href="css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
    <link href="css/publiccss.css" rel="stylesheet">
    <script src="js/bootstrap/3.3.6/bootstrap.min.js"></script>
</head>

<body>
<h1 align="center">未结合同列表</h1>
<hr>
<table width="800px" align="center" class="table table-striped table-bordered table-hover table-condensed">
    <thead>
    <tr>
        <td>ID</td>
        <td>货运回执单编号</td>
        <td>签订时间</td>
        <td>状态</td>
        <td>操作</td>
    </tr>
    </thead>
    <tbody>
    <s:iterator value="#wjHyhzds" status="i">
        <s:if test='IfBalance == "0" && BackBillState == "1"'>
        <tr>
            <td><s:property value="#i.count"/></td>
            <td><s:property value="GoodsRevertBillCode"/></td>
            <td><s:date name="SignTime" format="yyyy-MM-dd"/></td>
            <td><button type="button" class="btn btn-warning">未结</button></td>
            <td>
                <a href="driverJsInput?id=<s:property value="id"/>" target="con">点击结算</a>
            </td>
        </tr>
        </s:if>
    </s:iterator>
    </tbody>
</table>
</body>
</html>

