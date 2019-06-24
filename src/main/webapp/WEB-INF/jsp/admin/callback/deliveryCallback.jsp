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
<h1 align="center">中转发货客户回告</h1>
<hr>
<form action="callback_addPickUp" method="post">
	<%-- <input type="hidden" name="id" value="${hyd.id }"> --%> 
    <table width="700px" align="center">
        <tr>
            <td>拨出号码</td>
            <td>
                <input type="text" name="dialNo" class="form-control"
                       value="${hyd.linkmanMobile}">
            </td>
        </tr>
        <tr>
            <td>回告类别</td>
            <td>
                <input type="text" name="type" class="form-control"
                       value="发货客户回告">
            </td>
        </tr>
        <tr>
            <td>内容</td>
            <td>
                <input type="text" name="content" class="form-control"
                       value="">
            </td>
        </tr>
        <tr>
            <td>填写时间</td>
            <td id="datetimepicker1" class='input-group date'>
                <input type='text' class="form-control" name="writeTime" value=""/>
                <span class="input-group-addon">
                    <span class="glyphicon glyphicon-calendar"></span>
                </span>
            </td>
        </tr>
        <tr>
            <td>填写人</td>
            <td>
                <input type="text" name="writer" class="form-control"
                       value="">
            </td>
        </tr>
        <tr>
            <td>最后拨出时间</td>
            <td id="datetimepicker1" class='input-group date'>
                <input type='text' class="form-control" name="finallyDialTime" value=""/>
                <span class="input-group-addon">
                    <span class="glyphicon glyphicon-calendar"></span>
                </span>
            </td>
        </tr>
        <tr>
            <td>单据号</td>
            <td>
                <input type="text" name="billId" class="form-control"
                       value="${hyd.goodsRevertBillCode}">
            </td>
        </tr>
        <tr>
            <td>单据类型</td>
            <td>
                <input type="text" name="billType" class="form-control"
                       value="货运回执单">
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" class="btn btn-success" value="提交发货客户回告信息">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
