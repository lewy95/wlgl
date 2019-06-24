<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>Employee Add</title>
    <script type="text/javascript" src="js/jquery-1.8.3.js"></script>
    <link href="css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
    <script src="js/bootstrap/3.3.6/bootstrap.min.js"></script>
    <link href="css/addInput.css" rel="stylesheet">

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
<div class="mgl40"><h3>职员信息添加</h3></div>
<form action="employee_add" method="post">
    <div class="cleftinformation">
        <input onfocus="if (this.value === '职员编号') {this.value = '';}"
               onblur="if (this.value === '') {this.value = '职员编号';}" value="职员编号"
               name="EmployeeCode" class="form-control mgb h40">
        <input onfocus="if (this.value === '职员姓名') {this.value = '';}"
               onblur="if (this.value === '') {this.value = '职员姓名';}" value="职员姓名" name="Employee"
               class="form-control mgb h40">
        <input onfocus="if (this.value === '部门') {this.value = '';}"
               onblur="if (this.value === '') {this.value = '部门';}"
               value="部门" name="Department" class="form-control mgb h40">
    </div>
    <div class="crightinformation">
        <input onfocus="if (this.value === '职位') {this.value = '';}"
               onblur="if (this.value === '') {this.value = '职位';}"
               value="职位" name="Position" class="form-control mgb h40">
        <input id="datetimepicker" onfocus="if (this.value === '出生日期') {this.value = '';}"
               onblur="if (this.value === '') {this.value = '出生日期';}"
               value="出生日期" name="Birthday" class="form-control mgb h40">
        <label class="radio-inline mgb">
            <input type="radio" name="Gender" value="男" checked="checked"> 男
        </label>
        <label class="radio-inline mgb">
            <input type="radio" name="Gender" value="女"> 女
        </label>
    </div>
    <div class="submitstyle">
        <input type="submit" class="btn btn-success submitstylei" value="提交">
    </div>
</form>
</body>
</html>
