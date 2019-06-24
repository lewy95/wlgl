<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>Customer List</title>

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
<h3 align="center">客户信息列表</h3>
<hr>
<table class="table table-striped table-bordered table-hover table-condensed" width="1000px" align="center">
    <thead>
        <th>ID</th>
        <th>客户编号</th>
        <th>客户姓名</th>
        <th>电话</th>
        <th>传真</th>
        <th>地址</th>
        <th>邮编</th>
        <th>联系人</th>
        <th>联系人手机</th>
        <th>客户类型</th>
        <th>客户类型</th>
        <th>企业规模</th>
        <th>电子邮件</th>
    </thead>
    <tbody>
    <s:iterator value="#datas.pages" status="i">
        <tr>
            <td><s:property value="#i.count"/></td>
            <td><s:property value="CustomerCode"/></td>
            <td><s:property value="Customer"/></td>
            <td><s:property value="Phone"/></td>
            <td><s:property value="Fax"/></td>
            <td><s:property value="Address"/></td>
            <td><s:property value="PostCode"/></td>
            <td><s:property value="Linkman"/></td>
            <td><s:property value="LinkmanMobile"/></td>
            <td><s:property value="CustomerType"/></td>
            <td><s:property value="EnterpriseProperty"/></td>
            <td><s:property value="EnterpriseSize"/></td>
            <td><s:property value="Email"/></td>
        </tr>
    </s:iterator>
    </tbody>
</table>
<div align="center">
    <ul class="pagination">
        <!-- 首页链接 -->
        <li <s:if test="#datas.pageIndex == 1">class="disabled"</s:if>>
            <a href="customer_list?pageIndex=1">
                <span>&laquo;</span>
            </a>
        </li>

        <!-- 上页链接 -->
        <li <s:if test="#datas.pageIndex == 1">class="disabled"</s:if>>
            <a href="customer_list?pageIndex=<s:property value='#datas.pageIndex - 1'/>">
                <span>&lsaquo;</span>
            </a>
        </li>

        <!-- 1 2 3 4 5 -->
        <s:iterator begin="1" end="#datas.totalPage" status="i">
            <li <s:if test="#i.count == #datas.pageIndex">class="disabled"</s:if>>
                <a href="customer_list?pageIndex=<s:property value='#i.count'/>"
                   <s:if test="#i.count == #datas.pageIndex">class="active"</s:if>
                ><s:property value="#i.count"/>
                </a>
            </li>
        </s:iterator>

        <!-- 下页链接 -->
        <li <s:if test="#datas.pageIndex == #datas.totalPage">class="disabled" </s:if>>
            <a href="customer_list?pageIndex=<s:property value='#datas.pageIndex + 1'/>">
                <span>&rsaquo;</span>
            </a>
        </li>

        <!-- 尾页链接 -->
        <li <s:if test="#datas.pageIndex == #datas.totalPage">class="disabled" </s:if>>
            <a href="customer_list?pageIndex=<s:property value='#datas.totalPage'/>">
                <span>&raquo;</span>
            </a>
        </li>
    </ul>
</div>
</body>
</html>
