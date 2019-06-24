<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>daifa HyhzdList</title>
    <script type="text/javascript" src="js/jquery-1.8.3.js"></script>
    <link href="css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
    <link href="css/publiccss.css" rel="stylesheet">
    <script src="js/bootstrap/3.3.6/bootstrap.min.js"></script>
</head>

<body>
<h1 align="center">货运单列表</h1>
<hr>
<table class="table table-striped table-bordered table-hover table-condensed" width="800px" align="center">
    <thead>
    <tr>
        <td>ID</td>
        <td>货运回执单编号</td>
        <td>收货详细地址</td>
        <td>联系人电话</td>
        <td>操作</td>
    </tr>
    </thead>
    <tbody>
    <s:iterator value="#daifaHyhzds" status="i">
        <tr>
            <td><s:property value="#i.count"/></td>
            <td><s:property value="GoodsRevertBillCode"/></td>
            <td><s:property value="ReceiveGoodsDetailAddr"/></td>
            <td><s:property value="LinkmanMobile"/></td>
            <td>
                <a href="updateExecute?id=<s:property value="id"/>" target="con">确认发车</a>
            </td>
        </tr>
    </s:iterator>
    </tbody>
</table>
</body>
</html>
