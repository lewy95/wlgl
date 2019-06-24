<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"
         contentType="text/html;charset=UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>Driver Add</title>
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

<div class="mgl40"><h3>客户信息添加</h3></div>
<form action="driver_add" method="post">
    <div class="cleftinformation">
        <input onfocus="if (this.value === '司机姓名') {this.value = '';}"
               onblur="if (this.value === '') {this.value = '司机姓名';}" value="司机姓名"
               name="DriverName" class="form-control mgb h40">
        <input onfocus="if (this.value === '身份证号') {this.value = '';}"
               onblur="if (this.value === '') {this.value = '身份证号';}" value="身份证号" name="IDCard"
               class="form-control mgb h40">
        <input onfocus="if (this.value === '电话') {this.value = '';}"
               onblur="if (this.value === '') {this.value = '电话';}"
               value="电话" name="Phone" class="form-control mgb h40">
        <input onfocus="if (this.value === '手机') {this.value = '';}"
               onblur="if (this.value === '') {this.value = '手机';}"
               value="手机" name="Mobile" class="form-control mgb h40">
        <label class="radio-inline mgb">
            <input type="radio" name="Gender" value="男" checked="checked"> 男
        </label>
        <label class="radio-inline mgb">
            <input type="radio" name="Gender" value="女"> 女
        </label>
        <input id="datetimepicker" onfocus="if (this.value === '出生日期') {this.value = '';}"
               onblur="if (this.value === '') {this.value = '出生日期';}"
               value="出生日期" name="Birthday" class="form-control mgb h40">
        <input onfocus="if (this.value === '状态') {this.value = '';}"
               onblur="if (this.value === '') {this.value = '状态';}"
               value="状态" name="State" class="form-control mgb h40">
        <input onfocus="if (this.value === '车号') {this.value = '';}"
               onblur="if (this.value === '') {this.value = '车号';}" value="车号" name="CarNo"
               class="form-control mgb h40">
        <input onfocus="if (this.value === '准载体积') {this.value = '';}"
               onblur="if (this.value === '') {this.value = '准载体积';}"
               value="准载体积" name="AllowCarryVolume" class="form-control mgb h40">
        <input onfocus="if (this.value === '准载重量') {this.value = '';}"
               onblur="if (this.value === '') {this.value = '准载重量';}" value="准载重量" name="AllowCarryWeight"
               class="form-control mgb h40">
        <input onfocus="if (this.value === '住址') {this.value = '';}"
               onblur="if (this.value === '') {this.value = '住址';}" value="住址" name="Address"
               class="form-control mgb h40">
        <input onfocus="if (this.value === '车型') {this.value = '';}"
               onblur="if (this.value === '') {this.value = '车型';}" value="车型" name="CarType"
               class="form-control mgb h40">
        <input onfocus="if (this.value === '车厢长度') {this.value = '';}"
               onblur="if (this.value === '') {this.value = '车厢长度';}" value="车厢长度" name="CarLength" class="form-control mgb h40">
    </div>
    <div class="crightinformation">
        <input onfocus="if (this.value === '车属单位') {this.value = '';}"
               onblur="if (this.value === '') {this.value = '车属单位';}"
               value="车属单位" name="CarDept" class="form-control mgb h40">
        <input onfocus="if (this.value === '车属单位电话') {this.value = '';}"
               onblur="if (this.value === '') {this.value = '车属单位电话';}" value="车属单位电话" name="CarDeptTel"
               class="form-control mgb h40">
        <input onfocus="if (this.value === '驾驶证') {this.value = '';}"
               onblur="if (this.value === '') {this.value = '驾驶证';}" value="驾驶证" name="DriveLicence"
               class="form-control mgb h40">
        <input onfocus="if (this.value === '行驶证') {this.value = '';}"
               onblur="if (this.value === '') {this.value = '行驶证';}" value="行驶证" name="RunLicence"
               class="form-control mgb h40">
        <label class="radio-inline mgb">
            <input type="radio" name="CompanyCar" value="1" checked="checked">是公司车
        </label>
        <label class="radio-inline mgb">
            <input type="radio" name="CompanyCar" value="0">非公司车
        </label>
        <input onfocus="if (this.value === '运营证') {this.value = '';}"
               onblur="if (this.value === '') {this.value = '运营证';}" value="运营证" name="BizLicence"
               class="form-control mgb h40">
        <input onfocus="if (this.value === '保险证') {this.value = '';}"
               onblur="if (this.value === '') {this.value = '保险证';}" value="保险证" name="InsuranceCard" class="form-control mgb h40">
        <input onfocus="if (this.value === '车厢宽度') {this.value = '';}"
               onblur="if (this.value === '') {this.value = '车厢宽度';}"
               value="车厢宽度" name="CarWidth" class="form-control mgb h40">
        <input onfocus="if (this.value === '载物高度') {this.value = '';}"
               onblur="if (this.value === '') {this.value = '载物高度';}" value="载物高度" name="GoodsHeight"
               class="form-control mgb h40">
        <input onfocus="if (this.value === '车架号') {this.value = '';}"
               onblur="if (this.value === '') {this.value = '车架号';}" value="车架号" name="CarFrameNo"
               class="form-control mgb h40">
        <input onfocus="if (this.value === '发动机号') {this.value = '';}"
               onblur="if (this.value === '') {this.value = '发动机号';}" value="发动机号" name="EngineNo"
               class="form-control mgb h40">
        <input onfocus="if (this.value === '备注') {this.value = '';}"
               onblur="if (this.value === '') {this.value = '备注';}" value="备注" name="Remark"
               class="form-control mgb h40">

    </div>
    <div class="submitstyle mgb">
        <input type="submit" class="btn btn-success submitstylei" value="提交">
    </div>
</form>

</body>
</html>
