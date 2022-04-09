<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%
	pageContext.setAttribute("ctx", request.getContextPath());
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<jsp:include page="include/head.jsp" />
</head>
<body>
	<jsp:include page="include/top.jsp" />
	<section>
		<div class="container-fluid">
			<div class="row ">
				<jsp:include page="include/left.jsp" />
				<div class="col-xs-10">
					<br />
					<ol class="breadcrumb">
						<li class="active"><span class="glyphicon glyphicon-home"></span>&nbsp;后台首页</li>
					</ol>
					<h1 class="text-center text-white">小张便利店货物管理系统</h1>
					<!----------------------------------------------------------    ------------------------------------------->
				</div>
			</div>
		</div>
	</section>





	<footer class="bg-primary navbar-fixed-bottom">
		<p class="text-center text-white">版权所有&copy;MMSS</p>
	</footer>
</body>
</html>