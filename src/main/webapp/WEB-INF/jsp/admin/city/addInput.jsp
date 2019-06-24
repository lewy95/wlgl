<%--
  Created by IntelliJ IDEA.
  User: yuehailin
  Date: 2018/6/11
  Time: 10:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>C Add</title>
    <script type="text/javascript" src="js/jquery-1.8.3.js"></script>
    <link href="css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
    <script src="js/bootstrap/3.3.6/bootstrap.min.js"></script>
</head>
<body>
<h1 align="center">添加城市信息</h1>
<hr>
<form action="city_add" method="post">
    <table align="center" width="500px">
        <tr>
            <td>城&nbsp;&nbsp;&nbsp;&nbsp;市</td>
            <td><input type="text" name="City"  class="form-control"></td>
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
