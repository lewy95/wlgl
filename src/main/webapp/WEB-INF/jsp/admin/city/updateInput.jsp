<%--
  Created by IntelliJ IDEA.
  User: yuehailin
  Date: 2018/6/13
  Time: 9:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

    <title>Teacher Update</title>

    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <link rel="stylesheet" type="text/css" href="../../../css/bootstrap.css">
    <script type="text/javascript" src="../../../js/bootstrap.js"></script>


</head>

<body>
<h1 align="center">城市信息修改</h1>
<hr>
<form action="city_update" method="post">
    <table align="center" width="500px">
        <tr>
            <td>ID</td>
            <td><input type="text" class="form-control" style="width: 300px"name="id"
                       value="<s:property value='id'/>">
        </tr>
        <tr>
            <td>城市名</td>
            <td><input type="text" class="form-control" style="width: 300px"name="City">

            </td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <button type="submit" class="btn btn-success">修改</button>
            </td>
        </tr>
    </table>
</form>
</body>
</html>