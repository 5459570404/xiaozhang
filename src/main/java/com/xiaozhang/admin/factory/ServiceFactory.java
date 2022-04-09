package com.xiaozhang.admin.factory;


import com.xiaozhang.admin.service.IAreaService;
import com.xiaozhang.admin.service.IUserService;
import com.xiaozhang.admin.service.impl.AreaServiceImpl;
import com.xiaozhang.admin.service.impl.UserServiceImpl;

/**
 * @autor：张天治
 * @time:2018/12/8 16:59
 * @desc：
 */
public class ServiceFactory {

    public static IUserService getUserServiceImpl(){
        return new UserServiceImpl();
    }
    public static IAreaService getAreaServiceImpl(){
        return new AreaServiceImpl();
    }
}
