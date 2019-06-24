<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>hzMistake List</title>
    <script type="text/javascript" src="js/jquery-1.8.3.js"></script>
    <link href="css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
    <link href="css/publiccss.css" rel="stylesheet">
    <script src="js/bootstrap/3.3.6/bootstrap.min.js"></script>
</head>

<body>
<h1 align="center">差错信息列表</h1>
<hr>
<table class="table table-striped table-bordered table-hover table-condensed" width="800px" align="center">
    <thead>
    <tr>
        <td>ID</td>
        <td>货运回执单编号</td>
        <td>货运单编号</td>
        <td>客户名称</td>
        <td>差错类别</td>
        <td>操作</td>
    </tr>
    </thead>
    <tbody>
    <s:iterator value="#mistakes" status="i">
        <tr>
            <td><s:property value="#i.count"/></td>
            <td><s:property value="GoodsRevertBillCode"/></td>
            <td><s:property value="GoodsBillCode"/></td>
            <td><s:property value="Customer"/></td>
            <td><s:property value="MistakeType"/></td>
            <td>
                <a href="hzdMistake_show?id=<s:property value="id"/>" target="con">查看详情</a>
            </td>
        </tr>
    </s:iterator>
    </tbody>
</table>
</body>
</html>
