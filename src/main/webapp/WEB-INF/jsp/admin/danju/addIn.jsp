<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>fenfa Detail</title>
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
<h1 align="center">分发单据</h1>
<hr>
<form action="danju_add" method="post">
    <table width="500px" align="center">
        <tr>
            <td>单据类型</td>
            <td>
                <input type="text" name="billType" class="form-control">
            </td>
        </tr>
        <tr>
            <td>单据开始编号</td>
            <td>
                <input type="text" name="billStartCode" class="form-control">
            </td>
        </tr>
        <tr>
            <td>单据结束编号</td>
            <td>
                <input type="text" name="billEndCode" class="form-control">
            </td>
        </tr>
        <tr>
            <td>领票人</td>
            <td>
                <input type="text" name="receiveBillPerson" class="form-control">
            </td>
        </tr>
        <tr>
            <td>接货点</td>
            <td>
                <input type="text" name="acceptStation" class="form-control">
            </td>
        </tr>
        <tr>
            <td>领票时间</td>
            <td id="datetimepicker" class='input-group date'>
                <input type='text' class="form-control" name="receiveBillTime"/>
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
