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
<h1 align="center">请填写投诉详情</h1>
<hr>
<form action="complaint_updateComplaint" method="post">
	<input type="hidden" name="id" value="${complaint.id }"> 
    <table width="700px" align="center">
        <tr>
            <td>客户名称</td>
            <td>
                <input type="text" name="customer" class="form-control"
                       value="${complaint.customer}">
            </td>
        </tr>
        <tr>
            <td>货运单编号</td>
            <td>
                <input type="text" name="goodsBillCode" class="form-control"
                       value="${complaint.goodsBillCode}">
            </td>
        </tr>
        <tr>
            <td>投诉内容</td>
            <td>
                <input type="text" name="appealContent" class="form-control"
                       value="${complaint.appealContent}">
            </td>
        </tr>
        <tr>
            <td>投诉日期</td>
            <td id="datetimepicker1" class='input-group date'>
                <input type='text' class="form-control" name="appealDate" value="${complaint.appealDate}"/>
                <span class="input-group-addon">
                    <span class="glyphicon glyphicon-calendar"></span>
                </span>
            </td>
        </tr>
        <tr>
            <td>是否处理</td>
            <td>
                <input type="text" name="ifHandle" class="form-control"
                       value="${complaint.ifHandle}">
            </td>
        </tr>
        <tr>
            <td>处理日期</td>
            <td id="datetimepicker1" class='input-group date'>
                <input type='text' class="form-control" name="dealDate" value="${complaint.dealDate}"/>
                <span class="input-group-addon">
                    <span class="glyphicon glyphicon-calendar"></span>
                </span>
            </td>
        </tr>
        <tr>
            <td>处理结果</td>
            <td>
                <input type="text" name="dealResult" class="form-control"
                       value="${complaint.dealResult}">
            </td>
        </tr>
        <tr>
            <td>是否回告</td>
            <td>
                <input type="text" name="ifCallback" class="form-control"
                       value="${complaint.ifCallback}">
            </td>
        </tr>
        <tr>
            <td>回告日期</td>
            <td id="datetimepicker1" class='input-group date'>
                <input type='text' class="form-control" name="callBackDate" value="${complaint.callBackDate}"/>
                <span class="input-group-addon">
                    <span class="glyphicon glyphicon-calendar"></span>
                </span>
            </td>
        </tr>
        <tr>
            <td>处理人</td>
            <td>
                <input type="text" name="dealPerson" class="form-control"
                       value="${complaint.dealPerson}">
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" class="btn btn-success" value="修改投诉信息">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
