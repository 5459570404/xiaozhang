package com.xiaozhang.admin.listener;


import com.xiaozhang.admin.factory.ConnectFactory;
import com.xiaozhang.admin.model.UserModel;
import com.xiaozhang.admin.utils.WYEmailUtil;

import org.apache.commons.dbutils.QueryRunner;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * 在线用户人数统计监听器
 */
@WebListener
public class UserOnlineHistorytListener implements HttpSessionAttributeListener {
    /**
     * Session属性增加监听方法
     */
    private QueryRunner qr = new QueryRunner(ConnectFactory.getDataSource());

    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
        ServletContext application = event.getSession().getServletContext();
        String name = event.getName();
        HttpSession session = event.getSession();
        UserModel user = (UserModel) session.getAttribute("user");
        if (name.equals("user")) {
            WYEmailUtil.SendEmail("zhangtianzhi18@163.com", "zhangtianzhi18", "1558673808@qq.com", "登录通知", "用户：" + user.getName() + "登录了！ß");
        }
    }

    public void attributeRemoved(HttpSessionBindingEvent event) {

    }

    public void attributeReplaced(HttpSessionBindingEvent event) {

    }

}
