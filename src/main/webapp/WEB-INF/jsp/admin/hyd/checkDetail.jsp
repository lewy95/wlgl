<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>Hyd Detail</title>
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
<h1 align="center">请填写货运单详情</h1>
<hr>
<form action="hydUpdate" method="post">
    <table width="700px" align="center">
        <tr>
            <td>货运单编号</td>
            <td>
                <input type="text" name="GoodsBillCode" class="form-control"
                       value="${hydCheck.goodsBillCode}">
            </td>
        </tr>
        <tr>
            <td>发货客户编号</td>
            <td>
                <input type="text" name="SendGoodsCustomerNO" class="form-control"
                       value="${hydCheck.sendGoodsCustomerNO}">
            </td>
        </tr>
        <tr>
            <td>发货客户</td>
            <td>
                <input type="text" name="SendGoodsCustomer" class="form-control"
                       value="${hydCheck.sendGoodsCustomer}">
            </td>
        </tr>
        <tr>
            <td>发货客户手机</td>
            <td>
                <input type="text" name="SendGoodsCustomerMobile" class="form-control"
                       value="${hydCheck.sendGoodsCustomerMobile}">
            </td>
        </tr>
        <tr>
            <td>收货客户</td>
            <td>
                <input type="text" name="ReceiveGoodsCustomer" class="form-control"
                       value="${hydCheck.receiveGoodsCustomer}">
            </td>
        </tr>
        <tr>
            <td>收货客户手机</td>
            <td>
                <input type="text" name="ReceiveGoodsCustomerMobile" class="form-control"
                       value="${hydCheck.receiveGoodsCustomerMobile}">
            </td>
        </tr>
        <tr>
            <td>发货日期</td>
            <td id="datetimepicker1" class='input-group date'>
                <input type='text' class="form-control" name="SendGoodsDate"/>
                <span class="input-group-addon">
                    <span class="glyphicon glyphicon-calendar"></span>
                </span>
            </td>
        </tr>
        <tr>
            <td>发货地址</td>
            <td>
                <input type="text" name="SendGoodsAddr" class="form-control"
                       value="${hydCheck.sendGoodsAddr}">
            </td>
        </tr>
        <tr>
            <td>收货地址</td>
            <td>
                <input type="text" name="ReceiveGoodsAddr" class="form-control"
                       value="${hydCheck.receiveGoodsAddr}">
            </td>
        </tr>
        <tr>
            <td>预期交货日期</td>
            <td id="datetimepicker2" class='input-group date'>
                <input type='text' class="form-control" name="PredeliveryDate"/>
                <span class="input-group-addon">
                    <span class="glyphicon glyphicon-calendar"></span>
                </span>
            </td>

        </tr>
        <tr>
            <td>实际交货日期</td>
            <td id="datetimepicker3" class='input-group date'>
                <input type='text' class="form-control" name="FactDealDate"/>
                <span class="input-group-addon">
                    <span class="glyphicon glyphicon-calendar"></span>
                </span>
            </td>
        </tr>
        <tr>
            <td>代收货款</td>
            <td><input type="text" name="HelpAcceptPayment" class="form-control"></td>
        </tr>
        <tr>
            <td>代收手续费率</td>
            <td><input type="text" name="AcceptprocedureRate" class="form-control"></td>
        </tr>
        <tr>
            <td>填票人</td>
            <td><input type="text" name="WriteBillPerson" class="form-control"></td>
        </tr>
        <tr>
            <td>填写日期</td>
            <td id="datetimepicker4" class='input-group date'>
                <input type='text' class="form-control" name="WriteDate"/>
                <span class="input-group-addon">
                    <span class="glyphicon glyphicon-calendar"></span>
                </span>
            </td>
        </tr>
        <tr>
            <td>中转地</td>
            <td>
                <label class="radio-inline">
                    <input type="radio" name="IfTransfer" value="1" checked="checked"> 需要中转
                </label>
                <label class="radio-inline">
                    <input type="radio" name="IfTransfer" value="0"> 不需要中转
                </label>
            </td>
        </tr>
        <tr>
            <td>中转费</td>
            <td><input type="text" name="TransferFee" class="form-control"></td>
        </tr>
        <tr>
            <td>减款</td>
            <td><input type="text" name="ReduceFund" class="form-control"></td>
        </tr>
        <tr>
            <td>付回扣</td>
            <td><input type="text" name="PayKickback" class="form-control"></td>
        </tr>
        <tr>
            <td>代收货款变更后金额</td>
            <td><input type="text" name="MoneyOfChangePay" class="form-control"></td>
        </tr>
        <tr>
            <td>付款方式</td>
            <td><input type="text" name="PayMode" class="form-control"
                       value="${hydCheck.payMode}"></td>
        </tr>
        <tr>
            <td>运费</td>
            <td><input type="text" name="Carriage" class="form-control"></td>
        </tr>
        <tr>
            <td>保险费</td>
            <td><input type="text" name="Insurance" class="form-control"></td>
        </tr>
        <tr>
            <td>备注</td>
            <td>
                <input type="text" name="Remark" class="form-control"
                       value="${hydCheck.remark}">
            </td>
        </tr>
        <tr>
            <td>职员编号</td>
            <td><input type="text" name="EmployeeID" class="form-control"></td>
        </tr>
        <tr>
            <td>接货点</td>
            <td>
                <input type="text" name="AcceptStation" class="form-control"
                       value="${hydCheck.acceptStation}">
            </td>
        </tr>
        <tr>
            <td>送货费</td>
            <td>
                <input type="text" name="CarryGoodsFee" class="form-control">
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <!-- update方法需要给原有的属性赋值，否则会更新掉 -->
                <input type="hidden" name="id" value="${hydCheck.id}">
                <input type="hidden" name="SendGoodsCustomerTel" value="${hydCheck.sendGoodsCustomerTel}">
                <input type="hidden" name="SendGoodsCustomerAddr" value="${hydCheck.sendGoodsCustomerAddr}">
                <input type="hidden" name="PayMode" value="${hydCheck.payMode}">
                <input type="submit" class="btn btn-success" value="点击配车">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
