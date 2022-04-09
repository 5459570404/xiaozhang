<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%
	pageContext.setAttribute("ctx", request.getContextPath());
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<jsp:include page="../include/head.jsp" />
</head>
<body>
	<jsp:include page="../include/top.jsp" />
	<section>
		<div class="container-fluid">
			<div class="row ">
				<jsp:include page="../include/left.jsp" />
				<div class="col-xs-10">
					<br />
					<ol class="breadcrumb">
						<li class="active"><span class="glyphicon glyphicon-home"></span>&nbsp;后台首页</li>
					</ol>
					<div style="height: 350px; width: 100%; background-color:	#F5F5F5">
						<form action="${ctx }/area.do?action=add" method="post" style="padding:5% 20%">
							商品名称：<input type="text" name="goods_name" />
							<br>
							商品种类：<input type="text" name="goods_kind" />
							<br>
							进货单价：<input type="text" name="goods_value" />
							<br>
							进货数量：<input type="text" name="goods_count" />
							<br>
							总价：<input type="text" name="goods_total" />
							<br>
							出货单价：<input type="text" name="goods_sell" />
							<br>
							预计利润：<input type="text" name="goods_profit" />
							<br><br>
							<button type="submit" class="btn btn-primary btn-sm">保存</button>
						</form>
					</div>

				</div>



			</div>
		</div>
	</section>





	<footer class="bg-primary navbar-fixed-bottom">
		<p class="text-center text-white">版权所有&copy;MMSS</p>
	</footer>
</body>
</html>