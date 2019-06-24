<%--
  Created by IntelliJ IDEA.
  User: yuehailin
  Date: 2018/6/7
  Time: 11:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>TransferCo Add</title>
    <script type="text/javascript" src="js/jquery-1.8.3.js"></script>
    <link href="css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
    <script src="js/bootstrap/3.3.6/bootstrap.min.js"></script>
</head>
<body>
<h1 align="center">添加中转公司信息</h1>
<hr>
<form action="transferCoInfo_add" method="post">
    <table align="center" width="500px">
        <tr>
            <td>城市</td>
            <td><input type="text" name="City"  class="form-control"></td>
        </tr>
        <tr>
            <td>公司名称</td>
            <td><input type="text" name="CompanyName"  class="form-control"></td>
        </tr>
        <tr>
            <td>联系电话</td>
            <td><input type="text" name="LinkPhone"  class="form-control" ></td>
        </tr>
        <tr>
            <td>详细地址</td>
            <td><input type="text" name="DetailAddress"  class="form-control"></td>
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
