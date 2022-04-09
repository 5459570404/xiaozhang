package com.xiaozhang.admin.controller;


import com.xiaozhang.admin.factory.ServiceFactory;
import com.xiaozhang.admin.model.UserModel;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @autor：张天治
 * @time:2018/12/9 21:58
 * @desc：
 */
@WebServlet("/user.do")
public class UserController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        String desPath = null;

        if ("login".equals(action)) {
            desPath = login(req, resp);
        } else if ("logout".equals(action)) {
            desPath = logout(req, resp);
        }
        if (desPath != null) {
            req.getRequestDispatcher(desPath).forward(req, resp);
        }

    }
    //    登录
    private String login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String ps = req.getParameter("ps");
        try {
            UserModel user = ServiceFactory.getUserServiceImpl().login(id, ps);
            if(user==null){
                req.getSession().setAttribute("err","用户名或密码错误！");
                resp.sendRedirect("login.jsp");
            }else{
                req.getSession().setAttribute("ip",req.getRemoteAddr());
              
                req.getSession().setAttribute("user",user);
                resp.sendRedirect("index.jsp");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    //    登出
    private String logout(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getSession().invalidate();
        return "login.jsp";
    }
}
