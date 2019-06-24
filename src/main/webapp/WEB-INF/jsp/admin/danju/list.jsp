<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>weijie Hyd</title>
    <script type="text/javascript" src="js/jquery-1.8.3.js"></script>
    <link href="css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
    <link href="css/publiccss.css" rel="stylesheet">
    <script src="js/bootstrap/3.3.6/bootstrap.min.js"></script>
</head>

<body>
<h1 align="center">所有单据列表</h1>
<hr>
<table width="800px" align="center" class="table table-striped table-bordered table-hover table-condensed">
    <thead>
    <tr>
        <td>ID</td>
        <td>单据编号</td>
        <td>填写日期</td>
        <td>接货点</td>
        <td>关联运单/回执单</td>
        <td>状态</td>
        <td>操作</td>
    </tr>
    </thead>
    <tbody>
    <s:iterator value="#allDjs" status="i">
        <tr>
            <td><s:property value="#i.count"/></td>
            <td><s:property value="BillCode"/></td>
            <td><s:date name="WriteDate" format="yyyy-MM-dd"/></td>
            <td><s:property value="AcceptStation"/></td>
            <td><s:property value="HydCode"/></td>
            <td>
                <s:if test='BillState == "1"'>
                    <button type="button" class="btn btn-primary">已填</button>
                </s:if>
                <s:if test='BillState == "2"'>
                    <button type="button" class="btn btn-info">结账</button>
                </s:if>
                <s:if test='BillState == "0"'>
                    <button type="button" class="btn btn-warning">作废</button>
                </s:if>
            </td>
            <td>
                <s:if test='BillState != "0"'>
                    <a href="danju_updateInput?id=<s:property value="id"/>" target="con">修改</a>
                    <a href="danju_delete?id=<s:property value="id"/>" target="con">删除</a>
                </s:if>
            </td>
        </tr>
    </s:iterator>
    </tbody>
</table>
</body>
</html>

