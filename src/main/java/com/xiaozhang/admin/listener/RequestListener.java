package com.xiaozhang.admin.listener;

import javax.servlet.ServletContext;

import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServletRequest;

/**
 * @autor：张天治
 * @time:2018/11/9 16:49
 * @desc：
 */
public class RequestListener implements ServletRequestListener {

    @Override
    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {

    }

    @Override
    public void requestInitialized(ServletRequestEvent servletRequestEvent) {
        ServletContext application = servletRequestEvent.getServletContext();
//        Integer visit = (Integer)application.getAttribute("visit");
        ServletRequest servletRequest = servletRequestEvent.getServletRequest();
        HttpServletRequest request= (HttpServletRequest) servletRequest;
        String contextPath = request.getContextPath();
        String url = request.getRequestURI();
//        if(url.contains("jsp")){
//            application.setAttribute("visit",++visit);
//        }
    }
}
