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
                    $(this).parents("li5").siblings("li").find("ul").slideUp(100);
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
            <a style="cursor:pointer" class="inactive">接货管理</a>
            <ul style="display: none">
                <li>
                    <a style="cursor:pointer" class="inactive active">查询接货单</a>
                    <ul>
                        <li>
                            <a href="daifaHyhzd" target="con" style="cursor:pointer">待发运单</a>
                        </li>
                    </ul>
                </li>
            </ul>
        </li>
        <li>
            <a style="cursor:pointer" class="inactive">到货管理</a>
            <ul style="display: none">
                <li>
                    <a style="cursor:pointer" class="inactive active">到货验收</a>
                    <ul>
                        <li><a href="listDriverHz" target="con"
                               style="cursor:pointer">司机回执信息</a></li>
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
