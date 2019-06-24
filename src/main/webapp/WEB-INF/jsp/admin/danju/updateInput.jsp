<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>Show Hyd Detail</title>
    <script type="text/javascript" src="js/jquery-1.8.3.js"></script>
    <link href="css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
    <script src="js/bootstrap/3.3.6/bootstrap.min.js"></script>

    <link href="css/datetimerpicker/bootstrap-datetimepicker.css" rel="stylesheet" />
    <script src="js/datetimerpicker/bootstrap-datetimepicker.js"></script>

    <script type="text/javascript">
        $(function () {
            $("td[id^='datetimepicker']").datetimepicker({
                autoclose: true,//选中自动关闭
                todayBtn: true//显示今日按钮
            });
        });
    </script>
</head>

<body>
<h1 align="center">货运单详情</h1>
<hr>
<form action="danju_update" method="post">
    <table width="700px" align="center">
        <tr>
            <td>单据编号</td>
            <td>
                <input type="text" name="BillCode" class="form-control"
                       value="${djmxd.billCode}">
            </td>
        </tr>
        <tr>
            <td>填写日期</td>
            <td id="datetimepicker" class='input-group date'>
                <input type='text' class="form-control" name="WriteDate"
                       value="${djmxd.writeDate}"/>
                <span class="input-group-addon">
                    <span class="glyphicon glyphicon-calendar"></span>
                </span>
            </td>
        </tr>
        <tr>
            <td>接货点</td>
            <td>
                <input type="text" name="AcceptStation" class="form-control"
                       value="${djmxd.acceptStation}">
            </td>
        </tr>
        <tr>
            <td>关联运单/回执单</td>
            <td>
                <input type="text" name="HydCode" class="form-control"
                       value="${djmxd.hydCode}">
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="hidden" name="id" value="${djmxd.id}">
                <input type="hidden" name="BillState" value="${djmxd.billState}">
                <input type="submit" class="btn btn-success" value="确定修改">
            </td>
        </tr>
    </table>
</form>
</body>
</html>

