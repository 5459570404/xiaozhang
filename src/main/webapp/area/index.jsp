<%@ page contentType="text/html;charset=UTF-8" language="java"%>
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
					<table
						class="table table-bordered table-striped text-center bg-info">
						<thead>
							<tr class="info">
								<th class="text-center">序号</th>
								<th class="text-center">商品名称</th>
								<th class="text-center">商品种类</th>
								<th class="text-center">进货单价</th>
								<th class="text-center">进货数量</th>
								<th class="text-center">总价</th>
								<th class="text-center">出货单价</th>
								<th class="text-center">预计利润</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${areas}" var="onearea" varStatus="i">
								<tr>
									<td>${i.index+1}</td>
									<td>${onearea.goods_name}</td>
									<td>${onearea.goods_kind}</td>
									<td>${onearea.goods_value}</td>
									<td>${onearea.goods_count}</td>
									<td>${onearea.goods_total}</td>
									<td>${onearea.goods_sell}</td>
									<td>${onearea.goods_profit}</td>
									<td><a
										href="${ctx }/area.do?action=get&area_id=${onearea.goods_id}"
										class="btn btn-primary btn-sm">编辑</a> <a
										href="${ctx }/area.do?action=del&area_id=${onearea.goods_id}"
										class="btn btn-primary btn-sm">删除</a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</section>





	<footer class="bg-primary navbar-fixed-bottom">
		<p class="text-center text-white">版权所有&copy;MMSS</p>
	</footer>
</body>
</html>