<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>Hyd Add</title>
    <script type="text/javascript" src="js/jquery-1.8.3.js"></script>
    <link href="css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
    <script src="js/bootstrap/3.3.6/bootstrap.min.js"></script>
</head>

<body>
<h1 align="center">请填写货运单</h1>
<hr>
<form action="hydAdd" method="post">
    <table align="center" width="500px">
        <tr>
            <td>货运单编号</td>
            <td><input type="text" name="GoodsBillCode" class="form-control"></td>
        </tr>
        <tr>
            <td>发货客户编号</td>
            <td><input type="text" name="SendGoodsCustomerNO" value="${cus.customerCode}" class="form-control"></td>
        </tr>
        <tr>
            <td>发货客户</td>
            <td><input type="text" name="SendGoodsCustomer" value="${cus.customer}" class="form-control"></td>
        </tr>
        <tr>
            <td>发货客户电话</td>
            <td><input type="text" name="SendGoodsCustomerTel" value="${cus.phone}" class="form-control"></td>
        </tr>
        <tr>
            <td>发货客户地址</td>
            <td><input type="text" name="SendGoodsCustomerAddr"value="${cus.address}" class="form-control"></td>
        </tr>
        <tr>
            <td>收货客户</td>
            <td><input type="text" name="ReceiveGoodsCustomer" class="form-control"></td>
        </tr>
        <tr>
            <td>接货点</td>
            <td><input type="text" name="AcceptStation" class="form-control"></td>
        </tr>
        <tr>
            <td>发货地址</td>
            <td><input type="text" name="SendGoodsAddr" class="form-control"></td>
        </tr>
        <tr>
            <td>发货客户手机</td>
            <td><input type="text" name="SendGoodsCustomerMobile" class="form-control"></td>
        </tr>
        <tr>
            <td>收货地址</td>
            <td><input type="text" name="ReceiveGoodsAddr" class="form-control"></td>
        </tr>
        <tr>
            <td>收货客户手机</td>
            <td><input type="text" name="ReceiveGoodsCustomerMobile" class="form-control"></td>
        </tr>
        <tr>
            <td>付款方式</td>
            <td>
            <label class="radio-inline">
                <input type="radio" name="PayMode" value="预付" checked="checked"> 预付
            </label>
            <label class="radio-inline">
                <input type="radio" name="PayMode" value="到付"> 到付
            </label>
           </td>
        </tr>
        <tr>
            <td>备注</td>
            <td><input type="text" name="Remark" class="form-control"></td>
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
