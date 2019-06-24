<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <meta charset="utf-8" />
    <title>left</title>
    <script type="text/javascript" src="js/jquery-1.8.3.js"></script>
    <script type="text/javascript">
        $(document).ready(function() {
            $('.inactive').click(function() {
                if($(this).siblings('ul').css('display') == 'none') {
                    $(this).siblings('ul').slideDown(100);
                    $(this).parents("li").siblings("li").find("ul").slideUp(100);
                } else {
                    //控制自身菜单下子菜单隐藏
                    $(this).siblings('ul').slideUp(100);
                }
            })
        });
    </script>
    <link rel="stylesheet" type="text/css" href="css/left.css">
</head>
<body>
<div class="list">
    <ul class="yiji">
        <li>
            <a style="cursor:pointer" class="inactive">票据管理</a>
            <ul>
                <li>
                    <a style="cursor:pointer" class="inactive active">票据分发</a>
                    <ul>
                        <li><a href="danju_addIn" target="con" style="cursor:pointer">票据分发</a></li>
                        <li><a href="danju_list" target="con" style="cursor:pointer">票据查询</a></li>
                    </ul>
                </li>
            </ul>
            <ul>
                <li>
                    <a style="cursor:pointer" class="inactive active">票据销核</a>
                    <ul>
                        <li><a href="danju_yitianDj" target="con" style="cursor:pointer">已填票据</a></li>
                        <li><a href="danju_zuofeiDj" target="con"style="cursor:pointer">作废票据</a></li>
                        <li><a href="danju_yijieDj" target="con"style="cursor:pointer">结账票据</a></li>
                    </ul>
                </li>
            </ul>
        </li>
        <li>
            <a style="cursor:pointer" class="inactive">接货管理</a>
            <ul style="display: none">
                <li>
                    <a style="cursor:pointer" class="inactive active">处理接货单</a>
                    <ul>
                        <li>
                            <a href="hyd_checkList" target="con" style="cursor:pointer">审核运单</a>
                        </li>
                    </ul>
                </li>
                <li>
                    <a style="cursor:pointer" class="inactive active">查询接货单</a>
                    <ul>
                        <li><a href="hyd_daifaHyd" target="con" style="cursor:pointer">待发运单</a></li>
                        <li><a href="hyd_weidaoHyd" target="con" style="cursor:pointer">未到运单</a></li>
                        <li><a href="hyd_weijieHyd" target="con" style="cursor:pointer">未结运单</a></li>
                        <li><a href="hyd_listHyd" target="con" style="cursor:pointer">所有运单</a></li>
                    </ul>
                </li>
            </ul>
        </li>
        <li>
            <a style="cursor:pointer" class="inactive">配车管理</a>
            <ul style="display: none">
                <li>
                    <a style="cursor:pointer" class="inactive active">查询运输合同</a>
                    <ul>
                        <li><a href="weichuHyhzd" target="con" style="cursor:pointer">未出合同</a></li>
                        <li><a href="weidaoHyhzd" target="con" style="cursor:pointer">未到车辆</a></li>
                        <li><a href="weijieHyhzd" target="con" style="cursor:pointer">未结车辆</a></li>
                        <li><a href="listHyhzd" target="con" style="cursor:pointer">所有合同</a></li>
                    </ul>
                </li>
            </ul>
        </li>
        <li>
            <a style="cursor:pointer" class="inactive">到货管理</a>
            <ul style="display: none">
                <li>
                    <a style="cursor:pointer" class="inactive active">到货回执</a>
                    <ul>
                        <li><a href="driverHzd_list" target="con" style="cursor:pointer">司机回执信息</a></li>
                        <li><a href="customerHzd_list" target="con"style="cursor:pointer">客户回执信息</a></li>
                    </ul>
                </li>
                <li>
                    <a style="cursor:pointer" class="inactive active">到货验收</a>
                    <ul>
                        <li><a href="hzdMistake_list" target="con" style="cursor:pointer">差错信息</a></li>
                        <li><a href="yidaoHyhzd" target="con" style="cursor:pointer">到货历史</a></li>
                    </ul>
                </li>
            </ul>
        </li>
        <li>
            <a style="cursor:pointer" class="inactive">中转管理</a>
            <ul style="display: none">
                <li>
                    <a style="cursor:pointer" class="inactive active">中转公司</a>
                    <ul>
                        <li><a href="transferCoInfo_addInput" target="con" style="cursor:pointer">公司填写</a></li>
                        <li><a href="transferCoInfo_list" target="con" style="cursor:pointer">公司查询</a></li>
                    </ul>
                </li>
                <li>
                    <a style="cursor:pointer" class="inactive active">中转信息</a>
                    <ul>
                        <li><a href="transferInfo_transferHyd" target="con" style="cursor:pointer">中转填写</a></li>
                        <li><a href="transferInfo_list" target="con" style="cursor:pointer">中转查询</a></li>
                    </ul>
                </li>
            </ul>
        </li>
        <li>
            <a style="cursor:pointer" class="inactive">结算管理</a>
            <ul style="display: none">
                <li>
                    <a style="cursor:pointer" class="inactive active">货运单结算</a>
                    <ul>
                        <li><a href="hyd_weijieHyd" target="con" style="cursor:pointer">未结运单</a></li>
                        <li><a href="hyd_yijieHyd" target="con" style="cursor:pointer">已结运单</a></li>
                    </ul>
                </li>
                <li>
                    <a style="cursor:pointer" class="inactive active">运输合同结算</a>
                    <ul>
                        <li><a href="weijieHyhzd" target="con" style="cursor:pointer">未结运单</a></li>
                        <li><a href="yijieHyhzd" target="con" style="cursor:pointer">已结运单</a></li>
                    </ul>
                </li>
            </ul>
        </li>
        <li>
            <a style="cursor:pointer" class="inactive">客户服务</a>
            <ul style="display: none">
                <li>
                    <a style="cursor:pointer" class="inactive active">投诉管理</a>
                    <ul>
                        <li><a href="complaint_register" target="con" style="cursor:pointer">投诉登记</a></li>
                        <li><a href="complaint_list" target="con" style="cursor:pointer">投诉历史</a></li>
                        <li><a href="complaint_listComplaint" target="con" style="cursor:pointer">投诉处理</a></li>
                    </ul>
                </li>
                <li>
                    <a style="cursor:pointer" class="inactive active">提货回告</a>
                    <ul>
                        <li><a href="callback_listHyd1" target="con" style="cursor:pointer">新单回告</a></li>
                        <li><a href="callback_list" target="con" style="cursor:pointer">回告历史</a></li>
                    </ul>
                </li>
                <li>
                    <a style="cursor:pointer" class="inactive active">到货回告</a>
                    <ul>
                        <li><a href="callback_listHyd2" target="con" style="cursor:pointer">新单回告</a></li>
                        <li><a href="callback_list" target="con" style="cursor:pointer">回告历史</a></li>
                    </ul>
                </li>
                <li>
                    <a style="cursor:pointer" class="inactive active">中转回告</a>
                    <ul>
                        <li><a href="callback_listHyd5" target="con" style="cursor:pointer">发货客户回告</a></li>
                        <li><a href="callback_list" target="con" style="cursor:pointer">发货客户回告历史</a></li>
                        <li><a href="callback_listHyd6" target="con" style="cursor:pointer">收货客户回告</a></li>
                        <li><a href="callback_list" target="con" style="cursor:pointer">收货客户回告历史</a></li>
                    </ul>
                </li>
                <li>
                    <a style="cursor:pointer" class="inactive active">已提回告</a>
                    <ul>
                        <li><a href="callback_listHyd3" target="con" style="cursor:pointer">已提回告</a></li>
                        <li><a href="callback_list" target="con" style="cursor:pointer">回告历史</a></li>
                    </ul>
                </li>
                <li>
                    <a style="cursor:pointer" class="inactive active">代收回告</a>
                    <ul>
                        <li><a href="callback_listHyd4" target="con" style="cursor:pointer">新单回告</a></li>
                        <li><a href="callback_list" target="con" style="cursor:pointer">回告历史</a></li>
                    </ul>
                </li>
            </ul>
        </li>
        <li>
            <a style="cursor:pointer" class="inactive">应用管理</a>
            <ul style="display: none">
                <li>
                    <a style="cursor:pointer" class="inactive active">客户管理</a>
                    <ul>
                        <li><a href="customer_addInput" target="con" style="cursor:pointer">客户填写</a></li>
                        <li><a href="customer_list" target="con" style="cursor:pointer">客户查询</a></li>
                    </ul>
                </li>
                <li>
                    <a style="cursor:pointer" class="inactive active">司机管理</a>
                    <ul>
                        <li><a href="driver_addInput" target="con" style="cursor:pointer">司机填写</a></li>
                        <li><a href="driver_list" target="con" style="cursor:pointer">司机查询</a></li>
                    </ul>
                </li>
                <li>
                    <a style="cursor:pointer" class="inactive active">线路管理</a>
                    <ul>
                        <li><a href="city_addInput" target="con" style="cursor:pointer">新增城市</a></li>
                        <li><a href="city_list" target="con" style="cursor:pointer">城市信息</a></li>
                        <li><a href="route_addInput" target="con" style="cursor:pointer">新增路线</a></li>
                        <li><a href="route_list" target="con" style="cursor:pointer">线路信息</a></li>
                    </ul>
                </li>
                <li>
                    <a style="cursor:pointer" class="inactive active">职员管理</a>
                    <ul>
                        <li><a href="employee_addInput" target="con" style="cursor:pointer">职员填写</a></li>
                        <li><a href="employee_list" target="con" style="cursor:pointer">职员查询</a></li>
                    </ul>
                </li>
            </ul>
        </li>
        <li>
            <a style="cursor:pointer" class="inactive">系统管理</a>
            <ul style="display: none">
                <li>
                    <a style="cursor:pointer" class="inactive active">系统设置</a>
                    <ul>
                        <li><a href="updatePassword_updateIn" target="con" style="cursor:pointer">修改密码</a></li>
                    </ul>
                </li>
            </ul>
        </li>
    </ul>
</div>
</body>
</html>
