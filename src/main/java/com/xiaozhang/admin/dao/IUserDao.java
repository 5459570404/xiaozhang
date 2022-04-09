package com.xiaozhang.admin.dao;


import com.xiaozhang.admin.model.UserModel;

/**
 * @autor：张天治
 * @time:2018/12/9 21:54
 * @desc：
 */
public interface IUserDao {
    public UserModel selectById(String id)throws Exception;
}
