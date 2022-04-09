package com.xiaozhang.admin.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter("/*")
public class UserLoginCheckFilter implements Filter {
	@Override
    public void destroy() {

	}
	//过滤拦截方法，每次请求时运行
	@Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req=(HttpServletRequest)request;
		HttpServletResponse res=(HttpServletResponse)response;

		String uri=req.getRequestURI();

		if(uri.equals("/xiaozhang/login.jsp")||uri.endsWith(".css")||uri.endsWith(".js")||uri.equals("/xiaozhang/user.do")) {
			chain.doFilter(request, response);
		}
		else {
			HttpSession session=req.getSession();
			if(session.getAttribute("user")==null) {
				res.sendRedirect("/xiaozhang/login.jsp");
			}else {
				chain.doFilter(request, response);
			}
		}
	}

	@Override
    public void init(FilterConfig config) throws ServletException {
	}

}
