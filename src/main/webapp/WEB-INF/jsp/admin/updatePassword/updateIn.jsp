<%--
  Created by IntelliJ IDEA.
  User: LQ
  Date: 2018/6/13
  Time: 9:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>update Password</title>
    <script type="text/javascript" src="js/jquery-1.8.3.js"></script>
    <link href="css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
    <script src="js/bootstrap/3.3.6/bootstrap.min.js"></script>
</head>
<body>
<h1 align="center">修改密码</h1>
<hr>
  <form action="updatePassword_update" method="post">
      <table align="center" width="400px;">
          <tr>
              <td>用户名&nbsp;&nbsp;</td>
              <td><input type="text" name="loginid" class="form-control" value="<s:property value="#session['loginUser'].getLoginid()"/>"></td>
          </tr>
          <tr>
              <td>新密码&nbsp;&nbsp;</td>
              <td><input type="text" class="form-control" name="newPassword"></td>
          </tr>
          <tr>
              <td colspan="2" align="center">
                  <input type="submit" class="btn btn-success">
              </td>
          </tr>
      </table>
  </form>

</body>
</html>
