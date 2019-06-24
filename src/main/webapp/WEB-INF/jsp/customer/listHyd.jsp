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
<h1 align="center">未验收运单列表</h1>
<hr>
<table class="table table-striped table-bordered table-hover  table-condensed" width="800px" align="center">
    <thead>
    <tr>
        <td>ID</td>
        <td>货运单编号</td>
        <td>发货客户</td>
        <td>发货地址</td>
        <td>状态</td>
        <td>操作</td>
    </tr>
    </thead>
    <tbody>
    <s:iterator value="#customerHyds" status="i">
        <tr>
            <s:if test='Validity == "1"'>
            <td><s:property value="#i.count"/></td>
            <td><s:property value="GoodsBillCode"/></td>
            <td><s:property value="SendGoodsCustomer"/></td>
            <td><s:property value="SendGoodsAddr"/></td>
            <td>
                <s:if test='IfAudit == "1" && Validity == "1"'>
                    <button type="button" class="btn btn-primary">已配车</button>
                </s:if>
                <s:if test='IfAudit == "0" && Validity == "1"'>
                    <button type="button" class="btn btn-warning">未配车</button>
                </s:if>
            </td>
            <td>
                <s:if test='IfAudit == "1" && Validity == "1"'>
                    <a href="customerHzInput?id=<s:property value="id"/>">填写回执单</a>
                </s:if>
            </td>
            </s:if>
        </tr>
    </s:iterator>
    </tbody>
</table>
</body>
</html>

