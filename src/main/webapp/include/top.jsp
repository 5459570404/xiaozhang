<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
	pageContext.setAttribute("ctx", request.getContextPath());
%>
<header>
	<div class="container-fluid navbar-fixed-top bg-primary">
		<ul class="nav navbar-nav  left">
			<li class="text-white h4">&nbsp;&nbsp;&nbsp;&nbsp;<span
				class="glyphicon glyphicon-leaf"></span>&nbsp;&nbsp;<b>小张便利店货物管理系统</b>
			</li>
		</ul>
		<ul class="nav navbar-nav nav-pills right ">
			<li class="bg-warning "></li>
			
			<li class="bg-success"></li>
			<li class="bg-danger"></li>
			<li class="bg-info dropdown"><a class="dropdown-toggle" href="#"
				data-toggle="dropdown">浏览量：${visit }&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <span class="glyphicon glyphicon-user"></span>&nbsp;<span> ${user.name }</span><span
					class="caret"></span>
			</a>
				<ul class="dropdown-menu dropdown-menu-right">
					<li class="text-center"><a href="${ctx }/user.do?action=logout"><span
							class="text-primary">退出</span></a></li>
				</ul></li>
		</ul>
	</div>
</header>