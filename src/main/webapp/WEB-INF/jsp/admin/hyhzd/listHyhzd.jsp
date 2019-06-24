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
<h1 align="center">所有合同列表</h1>
<hr>
<table class="table table-striped table-bordered table-hover table-condensed" width="800px" align="center">
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
    <s:iterator value="#allHyhzds" status="i">
        <tr>
            <s:if test='Execute == "0" || Execute == "1"'>
            <td><s:property value="#i.count"/></td>
            <td><s:property value="GoodsRevertBillCode"/></td>
            <td><s:date name="SignTime" format="yyyy-MM-dd"/></td>
            <td>
                <s:if test='Execute == "0" && BackBillState == "1"'>
                    <button type="button" class="btn btn-primary">车辆未出</button>
                </s:if>
                <s:if test='Execute == "1" && BackBillState == "1"'>
                    <button type="button" class="btn btn-info">车辆未到</button>
                </s:if>
                <s:if test='IfBalance == "0" && BackBillState == "1"'>
                    <button type="button" class="btn btn-warning">车辆未结</button>
                </s:if>
            </td>
            <td>
                <a href="#">查看详情</a>
            </td>
            </s:if>
        </tr>
    </s:iterator>
    </tbody>
</table>
</body>
</html>

