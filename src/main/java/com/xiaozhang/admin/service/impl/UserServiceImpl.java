package com.xiaozhang.admin.service.impl;


import com.xiaozhang.admin.factory.DaoFactory;
import com.xiaozhang.admin.model.UserModel;
import com.xiaozhang.admin.service.IUserService;


/**
 * @autor：张天治
 * @time:2018/12/9 21:57
 * @desc：
 */
public class UserServiceImpl implements IUserService {
    @Override
    public UserModel login(String id, String ps) throws Exception {
        UserModel user = DaoFactory.getUserDaoImpl().selectById(id);
        if(user==null){
            return null;
        }
        if(ps.equals(user.getPs())){
            return user;
        }else{
            return null;
        }
    }
}
