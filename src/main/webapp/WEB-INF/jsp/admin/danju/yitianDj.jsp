<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>yitian Dj</title>
    <script type="text/javascript" src="js/jquery-1.8.3.js"></script>
    <link href="css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
    <link href="css/publiccss.css" rel="stylesheet">
    <script src="js/bootstrap/3.3.6/bootstrap.min.js"></script>
</head>

<body>
<h1 align="center">已填票据列表</h1>
<hr>
<table width="800px" align="center" class="table table-striped table-bordered table-hover table-condensed">
    <thead>
    <tr>
        <td>ID</td>
        <td>单据编号</td>
        <td>填写日期</td>
        <td>接货点</td>
        <td>关联运单/回执单</td>
        <td>操作</td>
    </tr>
    </thead>
    <tbody>
    <s:iterator value="#yitianDjs" status="i">
        <tr>
            <td><s:property value="#i.count"/></td>
            <td><s:property value="BillCode"/></td>
            <td><s:date name="WriteDate" format="yyyy-MM-dd"/></td>
            <td><s:property value="AcceptStation"/></td>
            <td><s:property value="HydCode"/></td>
            <td>
                <a href="#">查看详情</a>
            </td>
        </tr>
    </s:iterator>
    </tbody>
</table>
</body>
</html>

