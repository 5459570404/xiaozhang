package com.xiaozhang.admin.controller;
/*
 * @Program :parking
 * @Desc :区域控制器
 * @Time :2019/12/11 1:12 上午
 * @Author:zhangtianzhi
 */

import com.xiaozhang.admin.factory.ServiceFactory;
import com.xiaozhang.admin.model.AreaModel;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@WebServlet("/area.do")
public class AreaController extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        String desPath = null;
        if ("add".equals(action)) {
            desPath = add(req, resp);
        }else if ("get".equals(action)) {
            desPath = get(req, resp);
        }else if ("getall".equals(action)) {
            desPath = getall(req, resp);
        }else if ("modify".equals(action)) {
            desPath = modify(req, resp);
        }else if ("del".equals(action)) {
            desPath = del(req, resp);
        }
        if (desPath != null) {
            req.getRequestDispatcher(desPath).forward(req, resp);
        }

    }

    private String del(HttpServletRequest req, HttpServletResponse resp) {
        String area_id = req.getParameter("area_id");
        try {
            ServiceFactory.getAreaServiceImpl().del(area_id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "area.do?action=getall";
    }

    private String modify(HttpServletRequest req, HttpServletResponse resp) {
        String goods_name = req.getParameter("goods_name");
        String goods_id = req.getParameter("goods_id");
        AreaModel areaModel=new AreaModel();
        areaModel.setGoods_name(goods_name);
        areaModel.setGoods_id(goods_id);
        try {
            ServiceFactory.getAreaServiceImpl().modify(areaModel);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "area.do?action=getall";
    }

    private String getall(HttpServletRequest req, HttpServletResponse resp) {
        try {
            List<AreaModel> areaModels= ServiceFactory.getAreaServiceImpl().getall();
            req.setAttribute("areas",areaModels);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "/area/index.jsp";
    }

    private String get(HttpServletRequest req, HttpServletResponse resp) {
        String area_id = req.getParameter("goods_id");
        try {
            AreaModel areaModel = ServiceFactory.getAreaServiceImpl().get(area_id);
            req.setAttribute("getarea",areaModel);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "/area/show.jsp";
    }

    private String add(HttpServletRequest req, HttpServletResponse resp) {
        String area_name = req.getParameter("area_name");
        String area_id = UUID.randomUUID().toString();	//获取UUID并转化为String对象
        area_id = area_id.replace("-", "");
        AreaModel areaModel=new AreaModel();
        areaModel.setGoods_name(area_name);
        areaModel.setGoods_id(area_id);

        try {
            ServiceFactory.getAreaServiceImpl().add(areaModel);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "area.do?action=getall";
    }
}
