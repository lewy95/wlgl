<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>Add hyhzdDetail</title>
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
<h1 align="center">请填写回执信息</h1>
<hr>
<%--<s:debug></s:debug>--%>
<form action="driverHzAdd" method="post">
    <table width="700px" align="center">
        <tr>
            <td>货运回执单编号</td>
            <td><input type="text" class="form-control" name="GoodsRevertCode"
                       value="${hzdm.goodsRevertBillCode}">
        </tr>
        <tr>
            <td>司机名称</td>
            <td><input type="text" class="form-control" name="DriverName"></td>
        </tr>
        <tr>
            <td>验收货物记录</td>
            <td>
                <label class="radio-inline">
                    <input type="radio" name="CheckGoodsRecord" value="1" checked="checked"> 验收成功
                </label>
                <label class="radio-inline">
                    <input type="radio" name="CheckGoodsRecord" value="0"> 未验收成功
                </label>
            </td>
        </tr>
        <tr>
            <td>收货人</td>
            <td><input type="text" name="ReceiveGoodsPerson" class="form-control"></td>
        </tr>
        <tr>
            <td>收获日期</td>
            <td id="datetimepicker" class='input-group date'>
                <input type='text' class="form-control" name="ReceiveGoodsDate"/>
                <span class="input-group-addon">
                    <span class="glyphicon glyphicon-calendar"></span>
                </span>
            </td>
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


