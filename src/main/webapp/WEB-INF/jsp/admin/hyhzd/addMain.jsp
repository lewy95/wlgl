<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>Add hyhzdMain</title>
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
<h1 align="center">请填写运输合同</h1>
<hr>
<%--<s:debug></s:debug>--%>
<form action="hyhzdMainAdd" method="post">
    <table width="700px" align="center">
        <tr>
            <td>货运回执单编号</td>
            <td>
                <input type="text" name="GoodsRevertBillCode" class="form-control">
            </td>
        </tr>
        <tr>
            <td>起运时间</td>
            <td id="datetimepicker1" class='input-group date'>
                <input type='text' class="form-control" name="StartCarryTime"/>
                <span class="input-group-addon">
                    <span class="glyphicon glyphicon-calendar"></span>
                </span>
            </td>
        </tr>
        <tr>
            <td>到达时间</td>
            <td id="datetimepicker2" class='input-group date'>
                <input type='text' class="form-control" name="ArriveTime"/>
                <span class="input-group-addon">
                    <span class="glyphicon glyphicon-calendar"></span>
                </span>
            </td>
        </tr>
        <tr>
            <td>收货联系人</td>
            <td>
                <input type="text" name="ReceiveGoodsLinkman" class="form-control"
                       value="${hydCheck.receiveGoodsCustomer}">
            </td>
        </tr>
        <tr>
            <td>联系人手机</td>
            <td>
                <input type="text" name="LinkmanMobile" class="form-control"
                       value="${hydCheck.receiveGoodsCustomerMobile}">
            </td>
        </tr>
        <tr>
            <td>接货点</td>
            <td>
                <input type="text" name="AcceptStation" class="form-control"
                       value="${hydCheck.acceptStation}">
            </td>
        </tr>
        <tr>
            <td>收货详细地址</td>
            <td>
                <input type="text" name="ReceiveGoodsDetailAddr" class="form-control"
                       value="${hydCheck.receiveGoodsAddr}">
            </td>
        </tr>
        <tr>
            <td>运费结算方式</td>
            <td><input type="text" name="CarriageBanlanceMode" class="form-control"></td>
        </tr>
        <tr>
            <td>备注</td>
            <td><input type="text" name="Remark" class="form-control"></td>
        </tr>
        <tr>
            <td>司机编号</td>
            <td><input type="text" name="DriverID" class="form-control"></td>
        </tr>
        <tr>
            <td>起运时的预付费用</td>
            <td><input type="text" name="StartAdvance" class="form-control"
                       value="${hydCheck.carriage}"></td>
        </tr>
        <tr>
            <td>送货单回执押金</td>
            <td><input type="text" name="CarryGoodsBillDeposit" class="form-control"></td>
        </tr>
        <tr>
            <td>承运人订装货物保证金</td>
            <td><input type="text" name="CarryGoodsInsurance" class="form-control"></td>
        </tr>
        <tr>
            <td>配载服务费</td>
            <td><input type="text" name="DispatchServiceFee" class="form-control"></td>
        </tr>
        <tr>
            <td>保险费</td>
            <td><input type="text" name="Insurance" class="form-control"></td>
        </tr>
        <tr>
            <td>签定时间</td>
            <td id="datetimepicker3" class='input-group date'>
                <input type='text' class="form-control" name="SignTime"/>
                <span class="input-group-addon">
                    <span class="glyphicon glyphicon-calendar"></span>
                </span>
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" class="btn btn-success" value="下一步">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
