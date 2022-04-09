package com.xiaozhang.admin.listener;


import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.xiaozhang.admin.factory.ConnectFactory;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.sql.SQLException;

/**
 * @autor：张天治
 * @time:2018/11/9 19:03
 * @desc：
 */
public class ServletContextListerner implements ServletContextListener {
    private QueryRunner qr=new QueryRunner(ConnectFactory.getDataSource());

//    private Integer visit=null;
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ServletContext application = servletContextEvent.getServletContext();
//        try {
//            //  查询对应type的count
////            String sql = "select count from web where type=?";
////            visit = (Integer) qr.query(sql,new ScalarHandler(),"jsp");
////            System.out.println(visit+"*******");
////            application.setAttribute("visit",visit);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        ServletContext application = servletContextEvent.getServletContext();
//        visit = (Integer) application.getAttribute("visit");
//        try {
//            //  更新对应type的count
//            String updSql = "update web set count=? where type=?";
//            qr.update(updSql,visit,"jsp");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }
}
