<%@ page language="java" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>Employee List</title>
    <script type="text/javascript" src="js/jquery-1.8.3.js"></script>
    <link href="css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
    <link href="css/publiccss.css" rel="stylesheet">
    <script src="js/bootstrap/3.3.6/bootstrap.min.js"></script>
    <script>
        $(function () {
            $("ul.pagination li.disabled a").click(function () {
                return false;
            });
        });
    </script>
</head>

<body>
<h3 align="center">职员信息列表</h3>
<hr>
<table class="table table-striped table-bordered table-hover  table-condensed" width="800px" align="center">
    <thead>
    <tr>
        <td>ID</td>
        <td>职员编号</td>
        <td>职员姓名</td>
        <td>部门</td>
        <td>职位</td>
        <td>性别</td>
        <td>出生日期</td>
    </tr>
    </thead>
    <tbody>
    <s:iterator value="#datas.pages" status="i">
        <tr>
            <td><s:property value="#i.count"/></td>
            <td><s:property value="EmployeeCode"/></td>
            <td><s:property value="Employee"/></td>
            <td><s:property value="Department"/></td>
            <td><s:property value="Position"/></td>
            <td><s:property value="Gender"/></td>
            <td><s:date name="Birthday" format="yyyy-MM-dd"/></td>
        </tr>
    </s:iterator>
    </tbody>
</table>
<div align="center">
    <ul class="pagination">
        <!-- 首页链接 -->
        <li <s:if test="#datas.pageIndex == 1">class="disabled"</s:if>>
            <a href="employee_list?pageIndex=1">
                <span>&laquo;</span>
            </a>
        </li>

        <!-- 上页链接 -->
        <li <s:if test="#datas.pageIndex == 1">class="disabled"</s:if>>
            <a href="employee_list?pageIndex=<s:property value='#datas.pageIndex - 1'/>">
                <span>&lsaquo;</span>
            </a>
        </li>

        <!-- 1 2 3 4 5 -->
        <s:iterator begin="1" end="#datas.totalPage" status="i">
            <li <s:if test="#i.count == #datas.pageIndex">class="disabled"</s:if>>
                <a href="employee_list?pageIndex=<s:property value='#i.count'/>"
                   <s:if test="#i.count == #datas.pageIndex">class="active"</s:if>
                ><s:property value="#i.count"/>
                </a>
            </li>
        </s:iterator>

        <!-- 下页链接 -->
        <li <s:if test="#datas.pageIndex == #datas.totalPage">class="disabled" </s:if>>
            <a href="employee_list?pageIndex=<s:property value='#datas.pageIndex + 1'/>">
                <span>&rsaquo;</span>
            </a>
        </li>

        <!-- 尾页链接 -->
        <li <s:if test="#datas.pageIndex == #datas.totalPage">class="disabled" </s:if>>
            <a href="employee_list?pageIndex=<s:property value='#datas.totalPage'/>">
                <span>&raquo;</span>
            </a>
        </li>
    </ul>
</div>
</body>
</html>

