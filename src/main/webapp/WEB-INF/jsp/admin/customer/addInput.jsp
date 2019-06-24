<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>Customer Add</title>
    <script type="text/javascript" src="js/jquery-1.8.3.js"></script>
    <link href="css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
    <link href="css/addInput.css" rel="stylesheet">
    <script src="js/bootstrap/3.3.6/bootstrap.min.js"></script>
</head>

<body>
<div class="mgl40"><h3>客户信息添加</h3></div>
<form action="customer_add" method="post">
    <div class="cleftinformation">
        <input onfocus="if (this.value === '客户编号') {this.value = '';}"
               onblur="if (this.value === '') {this.value = '客户编号';}" value="客户编号"
               name="CustomerCode" class="form-control mgb h40">
        <input onfocus="if (this.value === '客户姓名') {this.value = '';}"
               onblur="if (this.value === '') {this.value = '客户姓名';}" value="客户姓名" name="Customer"
               class="form-control mgb h40">
        <input onfocus="if (this.value === '电话') {this.value = '';}"
               onblur="if (this.value === '') {this.value = '电话';}"
               value="电话" name="Phone" class="form-control mgb h40">
        <input onfocus="if (this.value === '传真') {this.value = '';}"
               onblur="if (this.value === '') {this.value = '传真';}"
               value="传真" name="Fax" class="form-control mgb h40">
        <input onfocus="if (this.value === '地址') {this.value = '';}"
               onblur="if (this.value === '') {this.value = '地址';}"
               value="地址" name="Address" class="form-control mgb h40">
        <input onfocus="if (this.value === '邮编') {this.value = '';}"
               onblur="if (this.value === '') {this.value = '邮编';}"
               value="邮编" name="PostCode" class="form-control mgb h40">
    </div>
    <div class="crightinformation">
        <input onfocus="if (this.value === '联系人') {this.value = '';}"
               onblur="if (this.value === '') {this.value = '联系人';}"
               value="联系人" name="Linkman" class="form-control mgb h40">
        <input onfocus="if (this.value === '联系人手机') {this.value = '';}"
               onblur="if (this.value === '') {this.value = '联系人手机';}" value="联系人手机" name="LinkmanMobile"
               class="form-control mgb h40">
        <input onfocus="if (this.value === '客户类型') {this.value = '';}"
               onblur="if (this.value === '') {this.value = '客户类型';}" value="客户类型" name="CustomerType"
               class="form-control mgb h40">
        <input onfocus="if (this.value === '企业性质') {this.value = '';}"
               onblur="if (this.value === '') {this.value = '企业性质';}" value="企业性质" name="EnterpriseProperty"
               class="form-control mgb h40">
        <input onfocus="if (this.value === '企业规模') {this.value = '';}"
               onblur="if (this.value === '') {this.value = '企业规模';}" value="企业规模" name="EnterpriseSize"
               class="form-control mgb h40">
        <input onfocus="if (this.value === '电子邮件') {this.value = '';}"
               onblur="if (this.value === '') {this.value = '电子邮件';}" value="电子邮件" name="Email" class="form-control mgb h40">
    </div>
    <div class="submitstyle">
        <input type="submit" class="btn btn-success submitstylei" value="提交">
    </div>
</form>
</body>
</html>
