package com.xiaozhang.admin.service;
/*
 * @Program :parking
 * @Desc :场地区域业务层
 * @Time :2019/12/11 12:41 上午
 * @Author:zhangtianzhi
 */

import javafx.scene.AmbientLight;

import java.sql.SQLException;
import java.util.List;

import com.xiaozhang.admin.model.AreaModel;

public interface IAreaService {
    int del(String area_id) throws SQLException;

    int add(AreaModel record) throws SQLException;

    AreaModel get(String area_id) throws SQLException;

    List<AreaModel> getall() throws SQLException;

    int modify(AreaModel record) throws SQLException;
}
