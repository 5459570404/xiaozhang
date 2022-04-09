package com.xiaozhang.admin.dao;
/*
 * @Program :parking
 * @Desc :区域Dao接口
 * @Time :2019/12/11 12:33 上午
 * @Author:zhangtianzhi
 */

import java.sql.SQLException;
import java.util.List;

import com.xiaozhang.admin.model.AreaModel;

public interface IAreaDao {
    int deleteByPrimaryKey(String area_id) throws SQLException;
    int insert(AreaModel record) throws SQLException;
    AreaModel selectByPrimaryKey(String area_id) throws SQLException;

    List<AreaModel> selectAll() throws SQLException;

    int updateByPrimaryKey(AreaModel record) throws SQLException;
}
