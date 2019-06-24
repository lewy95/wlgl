<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>Add hyhzdDetail</title>
    <script type="text/javascript" src="js/jquery-1.8.3.js"></script>
    <link href="css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
    <script src="js/bootstrap/3.3.6/bootstrap.min.js"></script>
</head>

<body>
<h1 align="center">请填写货物信息</h1>
<hr>
<%--<s:debug></s:debug>--%>
<form action="hyhzdDetailAdd" method="post">
    <table width="700px" align="center">
        <tr>
            <td>货运回执单编号</td>
            <td><input type="text" class="form-control" disabled="disabled"
                       value="${hydhzm.goodsRevertBillCode}">
        </tr>
        <tr>
            <td>货运单编号</td>
            <td><input type="text" class="form-control" disabled="disabled"
                       value="${hydCheck.goodsBillCode}"></td>
        </tr>
        <tr>
            <td>件数</td>
            <td><input type="text" name="PieceAmount" class="form-control"></td>
        </tr>
        <tr>
            <td>重量</td>
            <td><input type="text" name="Weight" class="form-control"></td>
        </tr>
        <tr>
            <td>体积</td>
            <td><input type="text" name="Volume" class="form-control"></td>
        </tr>
        <tr>
            <td>计价方式</td>
            <td><input type="text" name="PriceMode" class="form-control"></td>
        </tr>
        <tr>
            <td>计费标准</td>
            <td><input type="text" name="PriceStandard" class="form-control"></td>
        </tr>
        <tr>
            <td>货物价值</td>
            <td><input type="text" name="GoodsValue" class="form-control"></td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="hidden" class="form-control" name="GoodsRevertBillID"
                       value="${hydhzm.id}">
                <input type="hidden" class="form-control" name="GoodsBillDetailID"
                       value="${hydCheck.id}">
                <input type="submit" class="btn btn-success" value="提交">
            </td>
        </tr>
    </table>
</form>
</body>
</html>

