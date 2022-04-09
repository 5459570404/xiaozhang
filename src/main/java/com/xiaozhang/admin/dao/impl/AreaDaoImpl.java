package com.xiaozhang.admin.dao.impl;
/*
 * @Program :parking
 * @Desc :
 * @Time :2019/12/11 12:35 上午
 * @Author:zhangtianzhi
 */

import java.sql.SQLException;

import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.xiaozhang.admin.dao.IAreaDao;
import com.xiaozhang.admin.factory.ConnectFactory;
import com.xiaozhang.admin.model.AreaModel;

public class AreaDaoImpl implements IAreaDao {
	QueryRunner qr=new QueryRunner(ConnectFactory.getDataSource());
    @Override
    public int deleteByPrimaryKey(String goods_id) throws SQLException {
    	String sql="delete from goods where goods_id=?";
        return qr.update(sql,goods_id);
    }

    @Override
    public int insert(AreaModel record) throws SQLException {
    	String sql="insert into goods(goods_id,goods_name) values(?,?)";
        return qr.update(sql,record.getGoods_id(),record.getGoods_name());
    }

    @Override
    public AreaModel selectByPrimaryKey(String goods_id) throws SQLException {
    	  String sql="select * from goods where goods_id=?";
          return qr.query(sql, new BeanHandler<AreaModel>(AreaModel.class), goods_id);
    }

    @Override
    public List<AreaModel> selectAll() throws SQLException {
    	 String sql="select * from goods";
         return qr.query(sql, new BeanListHandler<AreaModel>(AreaModel.class));
    }

    @Override
    public int updateByPrimaryKey(AreaModel record) throws SQLException {
    	String sql="update goods set goods_name=? where goods_id=?";
        return qr.update(sql,record.getGoods_name(),record.getGoods_id());
    }
}
