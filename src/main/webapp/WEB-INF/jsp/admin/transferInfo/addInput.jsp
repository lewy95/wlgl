<%--
  Created by IntelliJ IDEA.
  User: yuehailin
  Date: 2018/6/7
  Time: 11:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <script type="text/javascript" src="js/jquery-1.8.3.js"></script>
    <link href="css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
    <script src="js/bootstrap/3.3.6/bootstrap.min.js"></script>

    <link href="css/datetimerpicker/bootstrap-datetimepicker.css" rel="stylesheet" />
    <script src="js/datetimerpicker/bootstrap-datetimepicker.js"></script>

    <script type="text/javascript">
        $(function () {
            $('#datetimepicker').datetimepicker({
                format: 'yyyy-mm-dd',
                minView: "month",//设置只显示到天
                autoclose: true,//选中自动关闭
                todayBtn: true//显示今日按钮
            });
        });
    </script>
</head>
<body>
<h1 align="center">添加中转信息</h1>
<hr>
<form action="transferInfo_add" method="post">
    <table align="center" width="500px">
        <tr>
            <td>货运单编号</td>
            <td><input type="text" name="GoodsBillCode" class="form-control"
                       value="${needTransferHyd.goodsBillCode}"></td>
        </tr>
        <tr>
            <td>中转地</td>
            <td><input type="text" name="TransferStation" class="form-control"></td>
        </tr>
        <tr>
            <td>中转验收人</td>
            <td><input type="text" name="TransferCheck" class="form-control"></td>
        </tr>
        <tr>
            <td>验收时间</td>
            <td id="datetimepicker" class='input-group date'>
                <input type='text' class="form-control" name="CheckTime"
                       value="${djmxd.writeDate}"/>
                <span class="input-group-addon">
                    <span class="glyphicon glyphicon-calendar"></span>
                </span>
            </td>
        </tr>
        <tr>
            <td>描述</td>
            <td><input type="text" name="Description" class="form-control"></td>
        </tr>
        <tr>
            <td>中转公司名</td>
            <td><input type="text" name="TransferCompany" class="form-control"></td>
        </tr>
        <tr>
            <td>中转地址</td>
            <td><input type="text" name="TransferAddr" class="form-control"></td>
        </tr>
        <tr>
            <td>中转地电话</td>
            <td><input type="text" name="TransferStationTel" class="form-control"></td>
        </tr>
        <tr>
            <td>中转费</td>
            <td><input type="text" name="TransferFee" class="form-control"></td>
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
