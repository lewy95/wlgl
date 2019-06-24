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
<h1 align="center">所有货运单列表</h1>
<hr>
<table class="table table-striped table-bordered table-hover  table-condensed" width="800px" align="center">
    <thead>
    <tr>
        <td>ID</td>
        <td>货运单编号</td>
        <td>客户编号</td>
        <td>状态</td>
        <td>操作</td>
    </tr>
    </thead>
    <tbody>
    <s:iterator value="#allHyds" status="i">
        <tr>
            <td><s:property value="#i.count"/></td>
            <td><s:property value="GoodsBillCode"/></td>
            <td><s:property value="SendGoodsCustomerNO"/></td>
            <td>
                <s:if test='IfAudit == "0" && Validity == "1"'>
                    <button type="button" class="btn btn-primary">待发</button>
                </s:if>
                <s:if test='IfAudit == "1" && Validity == "1" '>
                    <button type="button" class="btn btn-info">未到</button>
                </s:if>
                <s:if test='IfSettleAccounts == "0" && Validity == "1"'>
                    <button type="button" class="btn btn-warning">未结</button>
                </s:if>
                <s:if test='Validity == "0"'>
                    <button type="button" class="btn btn-success">完成</button>
                </s:if>
            </td>
            <td>
                <a href="hyd_showDetail?id=<s:property value="id"/>" target="con">查看详情</a>
            </td>
        </tr>
    </s:iterator>
    </tbody>
</table>
</body>
</html>

