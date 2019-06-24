<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>Driver List</title>
    <script type="text/javascript" src="js/jquery-1.8.3.js"></script>
    <link href="css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
    <script src="js/bootstrap/3.3.6/bootstrap.min.js"></script>
    <link href="css/publiccss.css" rel="stylesheet">
    <script>
        $(function () {
            $("ul.pagination li.disabled a").click(function () {
                return false;
            });
        });
    </script>
</head>

<body>
<h3 align="center">司机信息列表</h3>
<hr>
<table class="table table-striped table-bordered table-hover table-condensed" width="1000px" align="center">
    <thead>
        <th>ID</th>
        <th>司机名称</th>
        <th>身份证号</th>
        <th>手机</th>
        <th>性别</th>
        <th>出生日期</th>
        <th>住址</th>
        <th>车号</th>
        <th>车型</th>
        <th>驾驶证</th>
        <th>行驶证</th>
        <th>车属单位</th>
    </thead>
    <tbody>
    <s:iterator value="#datas.pages" status="i">
        <tr>
            <td><s:property value="#i.count"/></td>
            <td><s:property value="DriverName"/></td>
            <td><s:property value="IDCard"/></td>
            <td><s:property value="Phone"/></td>
            <td><s:property value="Gender"/></td>
            <td><s:property value="Birthday"/></td>
            <td><s:property value="Address"/></td>
            <td><s:property value="CarNo"/></td>
            <td><s:property value="CarType"/></td>
            <td><s:property value="DriveLicence"/></td>
            <td><s:property value="RunLicence"/></td>
            <td><s:property value="CarDept"/></td>
        </tr>
    </s:iterator>
    </tbody>
</table>
<div align="center">
    <ul class="pagination">
        <!-- 首页链接 -->
        <li <s:if test="#datas.pageIndex == 1">class="disabled"</s:if>>
            <a href="driver_list?pageIndex=1">
                <span>&laquo;</span>
            </a>
        </li>

        <!-- 上页链接 -->
        <li <s:if test="#datas.pageIndex == 1">class="disabled"</s:if>>
            <a href="driver_list?pageIndex=<s:property value='#datas.pageIndex - 1'/>">
                <span>&lsaquo;</span>
            </a>
        </li>

        <!-- 1 2 3 4 5 -->
        <s:iterator begin="1" end="#datas.totalPage" status="i">
            <li <s:if test="#i.count == #datas.pageIndex">class="disabled"</s:if>>
                <a href="driver_list?pageIndex=<s:property value='#i.count'/>"
                   <s:if test="#i.count == #datas.pageIndex">class="active"</s:if>
                ><s:property value="#i.count"/>
                </a>
            </li>
        </s:iterator>

        <!-- 下页链接 -->
        <li <s:if test="#datas.pageIndex == #datas.totalPage">class="disabled" </s:if>>
            <a href="driver_list?pageIndex=<s:property value='#datas.pageIndex + 1'/>">
                <span>&rsaquo;</span>
            </a>
        </li>

        <!-- 尾页链接 -->
        <li <s:if test="#datas.pageIndex == #datas.totalPage">class="disabled" </s:if>>
            <a href="driver_list?pageIndex=<s:property value='#datas.totalPage'/>">
                <span>&raquo;</span>
            </a>
        </li>
    </ul>
</div>
</body>
</html>
