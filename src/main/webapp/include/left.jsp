<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
	pageContext.setAttribute("ctx", request.getContextPath());
%>

<!--左侧导航开始-->
<div class="col-xs-2 bg-blue">
	<br />
	<div class="panel-group sidebar-menu" id="accordion"
		aria-multiselectable="true">
		<div class="panel panel-default menu-first menu-first-active">
			<a href="${ctx}/index.jsp"> <i class="icon-home icon-large"></i>
				主页
			</a>
		</div>
		<div class="panel panel-default menu-first">
			<a data-toggle="collapse" data-parent="#accordion"
				href="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
				<i class="icon-user-md icon-large"></i> 商品录入
			</a> </a>

			<div id="collapseOne" class="panel-collapse collapse ">
				<ul class="nav nav-list menu-second">
					<li><a href="${ctx}/area.do?action=getall"><i
							class="icon-user"></i> 商品列表</a></li>
					<li><a href=""><i class="icon-edit"></i>
							添加商品</a></li>
				</ul>
			</div>
		</div>
		<div class="panel panel-default menu-first">
			<a class="collapsed" data-toggle="collapse" data-parent="#accordion"
				href="#collapseTwo" aria-expanded="false"
				aria-controls="collapseTwo"> <i class="icon-book icon-large"></i>
				销售管理
			</a>
			<div id="collapseTwo" class="panel-collapse collapse">
				<ul class="nav nav-list menu-second">
					<li><a href=""><i
							class="icon-user"></i> 销售情况</a></li>
				</ul>
			</div>
		</div>
		<div class="panel panel-default menu-first">
			<a class="collapsed" data-toggle="collapse" data-parent="#accordion"
				href="#collapseThree" aria-expanded="false"
				aria-controls="collapseThree"> <i class="icon-book icon-large"></i>
				供货商管理
			</a> </a>

			<div id="collapseThree" class="panel-collapse collapse">
				<ul class="nav nav-list menu-second">
					<li><a href=""><i class="icon-user"></i> 供货商列表</a></li>
					<li><a href=""><i class="icon-edit"></i> 添加供货商</a></li>
				</ul>
			</div>
		</div>
	</div>
</div>


