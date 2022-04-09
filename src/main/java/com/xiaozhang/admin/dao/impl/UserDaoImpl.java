package com.xiaozhang.admin.dao.impl;


import com.xiaozhang.admin.dao.IUserDao;
import com.xiaozhang.admin.factory.ConnectFactory;
import com.xiaozhang.admin.model.UserModel;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

/**
 * @autor：张天治
 * @time:2018/12/9 21:55
 * @desc：
 */
public class UserDaoImpl implements IUserDao {
    QueryRunner qr=new QueryRunner(ConnectFactory.getDataSource());
    @Override
    public UserModel selectById(String id) throws Exception {
        String sql="select * from user where id=?";
        UserModel user = qr.query(sql, new BeanHandler<UserModel>(UserModel.class), id);
        return user;
    }
}
