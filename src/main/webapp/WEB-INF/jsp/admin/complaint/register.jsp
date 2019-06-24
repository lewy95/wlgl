<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>complaint register</title>
	<link rel="stylesheet" type="text/css" href="css/datePicker.css" />
	<script src="js/jquery-1.3.2.min.js" type="text/javascript"></script>
	<script src="js/jquery.datePicker-min.js" type="text/javascript"></script>

		<script type="text/javascript">
			$(window).ready(function() {
				$('.date-pick').datePicker({
					clickInput: true
				});
			});
		</script>
		<style type="text/css">
			* {
				padding: 0;
				margin: 0;
			}
			
			li {
				list-style: none;
			}
			
			body {
				background: #f9f9f9;
				font-size: 14px;
			}
			
			#explain {
				height: 60px;
				border-bottom: 1px solid #999999;
				background: #eee;
				font-size: 14px;
				color: #666;
				text-align: center;
				line-height: 60px;
			}
			
			#explain a {
				color: #990000;
				font-weight: bold;
				text-decoration: none;
				border-bottom: 1px dotted #990000;
			}
			
			#explain a:hover {
				border-bottom: 2px solid #990000;
			}
			
			#explain strong {
				color: #990000;
			}
			
			#box {
				width: 500px;
				padding: 10px;
				border: 1px solid #ccc;
				background: #f4f4f4;
				margin: 10px auto;
			}
			
			#fill_in {
				margin-bottom: 10px;
			}
			
			#fill_in li {
				padding: 5px 0;
			}
			
			#fill_in .text {
				width: 200px;
				height: 30px;
				padding: 0 10px;
				border: 1px solid #ccc;
				line-height: 30px;
				font-size: 14px;
				font-family: arial;
			}
			
			#fill_in textarea {
				width: 380px;
				height: 100px;
				line-height: 20px;
				padding: 5px 10px;
				border: 1px solid #ccc;
				font-size: 14px;
				font-family: arial;
				overflow: auto;
				vertical-align: top;
			}
			
			#fill_in .btn {
				border: none;
				width: 100px;
				height: 30px;
				border: 1px solid #ccc;
				background: #fff;
				color: #666;
				font-size: 14px;
				position: relative;
				left: 42px;
			}
			
			#message_text {
				display: none;
			}
			
			#message_text h2 {
				font-size: 14px;
				padding: 6px 0 4px 10px;
				background: #ddd;
				border-bottom: 1px solid #ccc;
			}
			
			#message_text li {
				background: #f9f9f9;
				border-bottom: 1px solid #ccc;
				color: #666;
				overflow: hidden;
			}
			
			#message_text h3 {
				padding: 10px;
				font-size: 14px;
				line-height: 24px;
			}
			
			#message_text p {
				padding: 0 10px 10px;
				text-indent: 28px;
				line-height: 20px;
			}
		</style>
	</head>

	<body>
		<div id="box">
			<ul id="fill_in">
				<form action="complaint_add" method="post">
					<li>客户名称：&nbsp;&nbsp;&nbsp;<input type="text" class="text" name="customer"/></li>
					<li>货运单编号：<input type="text" class="text" name="goodsBillCode"/></li>
					<li>投诉内容：&nbsp;&nbsp;&nbsp;<textarea name="appealContent"></textarea></li>
					<li>投诉日期：&nbsp;&nbsp;&nbsp;<input type="text" name="appealDate" class="it date-pick text" /></li>
					<li><input id="btn" type="submit" value="提交" class="btn" /></li>
				</form>
			</ul>
		</div>
	</body>
</html>