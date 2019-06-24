<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>Add mistake</title>
    <script type="text/javascript" src="js/jquery-1.8.3.js"></script>
    <link href="css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
    <script src="js/bootstrap/3.3.6/bootstrap.min.js"></script>

    <link href="css/datetimerpicker/bootstrap-datetimepicker.css" rel="stylesheet" />
    <script src="js/datetimerpicker/bootstrap-datetimepicker.js"></script>

    <script type="text/javascript">
        $(function () {
            $("td[id^='datetimepicker']").datetimepicker({
                format: 'yyyy-mm-dd',
                minView: "month",//设置只显示到天
                autoclose: true,//选中自动关闭
                todayBtn: true//显示今日按钮
            });
        });
    </script>
</head>

<body>
<h1 align="center">请填写差错信息</h1>
<hr>
<%--<s:debug></s:debug>--%>
<form action="mistakeAdd" method="post">
    <table width="700px" align="center">
        <tr>
            <td>货运回执单编号</td>
            <td><input type="text" class="form-control" name="GoodsRevertBillCode"
                       value="${hyhzdx.goodsRevertBillID}">
        </tr>
        <tr>
            <td>货运单编号</td>
            <td><input type="text" class="form-control" name="GoodsBillCode"
                       value="${hyhzdx.goodsBillDetailID}"></td>
        </tr>
        <tr>
            <td>客户名称</td>
            <td><input type="text" class="form-control" name="Customer"></td>
        </tr>
        <tr>
            <td>货物名称</td>
            <td><input type="text" name="GoodsName" class="form-control"></td>
        </tr>
        <tr>
            <td>差错类别</td>
            <td><input type="text" name="MistakeType" class="form-control"></td>
        </tr>
        <tr>
            <td>件数</td>
            <td><input type="text" name="PieceAmount" class="form-control"
                       value="${hyhzdx.pieceAmount}"></td>
        </tr>
        <tr>
            <td>规格</td>
            <td><input type="text" name="Size" class="form-control"
                       value="${hyhzdx.weight}"></td>
        </tr>
        <tr>
            <td>货物价值</td>
            <td><input type="text" name="GoodsValue" class="form-control"
                       value="${hyhzdx.goodsValue}"></td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" class="btn btn-success" value="提交">
            </td>
        </tr>
    </table>
</form>
</body>
</html>


