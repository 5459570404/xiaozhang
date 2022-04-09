package com.xiaozhang.admin.service;


import com.xiaozhang.admin.model.UserModel;

/**
 * @autor：张天治
 * @time:2018/12/9 21:57
 * @desc：
 */
public interface IUserService {
    public UserModel login(String id, String ps)throws Exception;
}
