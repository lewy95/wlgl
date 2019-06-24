<%--
  Created by IntelliJ IDEA.
  User: yuehailin
  Date: 2018/6/13
  Time: 10:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
    <title>Title</title>
</head>
<body>


<form action="route_update" method="post">
    <table align="center" width="500px">
        <tr>
            <td>ID</td>
            <td><input type="text" class="form-control" style="width: 300px"name="id"
                       value="<s:property value='id'/>">
        </tr>

        <tr>
            <td>起点</td>
            <td><input type="text" name="StartStation" class="form-control"></td>
        </tr>
        <tr>
            <td>终点</td>
            <td><input type="text" name="EndStation" class="form-control"></td>
        </tr>
        <tr>
            <td>历程</td>
            <td><input type="text" name="Distance" class="form-control"></td>
        </tr>
        <tr>
            <td>抵达时间</td>
            <td><input type="text" name="FetchTime" class="form-control"></td>
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
