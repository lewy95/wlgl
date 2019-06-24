<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>

    <title>Customer Add</title>
    <script type="text/javascript" src="js/jquery-1.8.3.js"></script>
    <link href="css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
    <script src="js/bootstrap/3.3.6/bootstrap.min.js"></script>

</head>
<body>
<h1 align="center">添加路线信息</h1>
<hr>
<form action="route_add" method="post">
    <table align="center" width="500px">
        <tr>
            <td>起点：</td>
            <td>
                <s:select list="city28s" listKey="City" listValue="City" name="StartStation"
                          class="form-control"/>
            </td>
        </tr>
        <tr>
            <td>终点：</td>
            <td>
                <s:select list="city28s" listKey="City" listValue="City" name="EndStation"
                          class="form-control"/>
            </td>
        </tr>
        <tr>
            <td>里&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;程</td>
            <td><input type="text" name="Distance"  class="form-control"></td>
        </tr>
        <tr>
            <td>抵达时间</td>
            <td><input type="text" name="FetchTime"  class="form-control"></td>
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