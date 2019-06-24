<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>提货回告</title>
    <script type="text/javascript" src="js/jquery-1.8.3.js"></script>
    <link href="css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
    <link href="css/publiccss.css" rel="stylesheet">
    <script src="js/bootstrap/3.3.6/bootstrap.min.js"></script>
</head>

<body>
<h1 align="center">货运回执单列表</h1>
<hr>
<table width="800px" align="center" class="table table-striped table-bordered table-hover table-condensed">
    <thead>
    <tr>
        <td>ID</td>
        <td>货运回执单编号</td>
        <td>到达时间</td>
        <td>收货联系人</td>
        <td>联系人手机</td>
        <td>接货地点</td>
        <td>操作</td>
    </tr>
    </thead>
    <tbody>
    <s:iterator value="#hyds" status="i">
        <tr>
            <td><s:property value="id"/></td>
            <td><s:property value="GoodsRevertBillCode"/></td>
            <td><s:date name="ArriveTime" format="yyyy-MM-dd"/></td>
            <td><s:property value="ReceiveGoodsLinkman"/></td>
            <td><s:property value="LinkmanMobile"/></td>
            <td><s:property value="AcceptStation"/></td>
            <td>
                <a href="callback_agencyCallback?id=<s:property value="id"/>" target="con">代收回告</a>
            </td>
        </tr>
    </s:iterator>
    </tbody>
</table>
</body>
</html>

