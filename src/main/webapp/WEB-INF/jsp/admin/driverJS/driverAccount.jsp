<%--
  Created by IntelliJ IDEA.
  User: LQ
  Date: 2018/6/13
  Time: 9:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>driver account</title>
    <script type="text/javascript" src="js/jquery-1.8.3.js"></script>
    <link href="css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
    <script src="js/bootstrap/3.3.6/bootstrap.min.js"></script>
    <link href="css/datetimerpicker/bootstrap-datetimepicker.css" rel="stylesheet" />
    <script src="js/datetimerpicker/bootstrap-datetimepicker.js"></script>
    <script type="text/javascript">
        $(function () {
            $("td[id^='datetimepicker']").datetimepicker({
                format: 'yyyy-mm-dd',
                minView: "month",//设置只显示到天
                autoclose: true,//选中自动关闭
                todayBtn: true//显示今日按钮
            });
        });
    </script>
</head>
<body>
<h1 align="center">司机结算页面</h1>
<hr>
  <form action="driverJs" method="post">
      <table align="center" width="400px;">
          <tr>
              <td>回执单编号&nbsp;&nbsp;</td>
              <td><input type="text" class="form-control" name="BackBillCode"
                         value="${wjHzdDetail.goodsRevertBillCode}"></td>
          </tr>
          <br/>
          <tr>
              <td>承运费&nbsp;&nbsp;</td>
              <td><input type="text" class="form-control" name="CarryFee"
                         value="${wjHzdDetail.allCarriage}"></td>
          </tr>
          <tr>
              <td>配载服务费&nbsp;&nbsp;</td>
              <td><input type="text" class="form-control" name="DispatchServiceFee"
                         value="${wjHzdDetail.dispatchServiceFee}"></td>
          </tr>
          <tr>
              <td>保险费&nbsp;&nbsp;</td>
              <td><input type="text" class="form-control" name="Insurance"
                         value="${wjHzdDetail.insurance}"></td>
          </tr>
          <tr>
              <td>预付金额&nbsp;&nbsp;</td>
              <td><input type="text" class="form-control" name="PrepayMoney"
                         value="${wjHzdDetail.startAdvance}"></td>
          </tr>
          <tr>
              <td>订装保证金&nbsp;&nbsp;</td>
              <td><input type="text" class="form-control" name="BindInsurance"
                         value="${wjHzdDetail.carryGoodsInsurance}"></td>
          </tr>
          <tr>
              <td>加运费&nbsp;&nbsp;</td>
              <td><input type="text" class="form-control" name="AddCarriage"></td>
          </tr>
          <tr>
              <td>已付金额&nbsp;&nbsp;</td>
              <td><input type="text" class="form-control" name="PayedMoney"></td>
          </tr>
          <tr>
              <td>结算时间&nbsp;&nbsp;</td>
              <td id="datetimepicker" class='input-group date'>
                  <input type='text' class="form-control" name="BalanceTime"/>
                  <span class="input-group-addon">
                    <span class="glyphicon glyphicon-calendar"></span>
                </span>
              </td>
          </tr>
          <tr>
              <td>结算类型&nbsp;&nbsp;</td>
              <td>
                  <label class="radio-inline">
                      <input type="radio" name="BalanceType" value="结入" checked="checked"> 结入
                  </label>
                  <label class="radio-inline">
                      <input type="radio" name="BalanceType" value="结出"> 结出
                  </label>
              </td>
          </tr>
          <tr>
              <td colspan="2" align="center">
                  <input type="submit" class="btn btn-success" value="结算">
              </td>
          </tr>
      </table>
  </form>

</body>
</html>
