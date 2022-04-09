package com.xiaozhang.admin.factory;


import com.xiaozhang.admin.dao.IAreaDao;
import com.xiaozhang.admin.dao.IUserDao;
import com.xiaozhang.admin.dao.impl.AreaDaoImpl;
import com.xiaozhang.admin.dao.impl.UserDaoImpl;


/**	
 * @autor：张天治
 * @time:2018/12/8 16:53
 * @desc：
 */
public class DaoFactory {

    public static IUserDao getUserDaoImpl(){
        return new UserDaoImpl();
    }
    public static IAreaDao getAreaDaoImpl(){
        return new AreaDaoImpl();
    }
}
