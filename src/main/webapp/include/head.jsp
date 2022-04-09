<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%
	pageContext.setAttribute("ctx", request.getContextPath());
%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<fmt:setBundle basename="com.lyx.chamber.admin.info.Info" />
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="icon" href="${ctx}/img/logo.png" />
<title>小张便利店货物管理系统</title>
<link href="${ctx}/css/bootstrap.css" rel="stylesheet">
<link rel="stylesheet" href="${ctx}/css/mmss.css" />
<link rel="stylesheet" href="${ctx}/css/font-awesome.min.css" />
<script src="${ctx}/js/jquery-1.11.3.js"></script>
<script src="${ctx}/js/bootstrap.js"></script>
<script>

	$(function() {
		$('dt').click(
				function() {
					$(this).parent().find('dd').show().end().siblings().find(
							'dd').hide();
				});
	});
</script>