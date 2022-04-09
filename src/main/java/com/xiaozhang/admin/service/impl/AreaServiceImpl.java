package com.xiaozhang.admin.service.impl;
/*
 * @Program :parking
 * @Desc :
 * @Time :2019/12/11 12:41 上午
 * @Author:zhangtianzhi
 */

import com.xiaozhang.admin.factory.DaoFactory;
import com.xiaozhang.admin.model.AreaModel;
import com.xiaozhang.admin.service.IAreaService;

import java.sql.SQLException;
import java.util.List;

public class AreaServiceImpl implements IAreaService {
    @Override
    public int del(String area_id) throws SQLException {
        return DaoFactory.getAreaDaoImpl().deleteByPrimaryKey(area_id);
    }

    public int add(AreaModel record) throws SQLException {
        return DaoFactory.getAreaDaoImpl().insert(record);
    }

    @Override
    public AreaModel get(String area_id) throws SQLException {
        return DaoFactory.getAreaDaoImpl().selectByPrimaryKey(area_id);
    }

    @Override
    public List<AreaModel> getall() throws SQLException {
        return DaoFactory.getAreaDaoImpl().selectAll();
    }

    @Override
    public int modify(AreaModel record) throws SQLException {
        return DaoFactory.getAreaDaoImpl().updateByPrimaryKey(record);
    }
}
