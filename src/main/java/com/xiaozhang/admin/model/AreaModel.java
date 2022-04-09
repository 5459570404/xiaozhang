package com.xiaozhang.admin.model;
/*
 * @Program :parking
 * @Desc :区域Model
 * @Time :2019/12/11 12:32 上午
 * @Author:zhangtianzhi
 */

public class AreaModel {
    private String goods_id=null;
    private String goods_name=null;
    private String goods_kind=null;
    private double goods_value=0;
    private int goods_count=0;
    private double goods_total=0;
    private double goods_sell=0;
    private double goods_profit=0;

    public String getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(String goods_id) {
        this.goods_id = goods_id;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public String getGoods_kind() {
        return goods_kind;
    }

    public void setGoods_kind(String goods_kind) {
        this.goods_kind = goods_kind;
    }

    public double getGoods_value() {
        return goods_value;
    }

    public void setGoods_value(double goods_value) {
        this.goods_value = goods_value;
    }

    public int getGoods_count() {
        return goods_count;
    }

    public void setGoods_count(int goods_count) {
        this.goods_count = goods_count;
    }
    public double getGoods_total() {
        return goods_total;
    }

    public void setGoods_total(double goods_total) {
        this.goods_total = goods_total;
    }
    public double getGoods_sell() {
        return goods_sell;
    }

    public void setGoods_sell(double goods_sell) {
        this.goods_sell = goods_sell;
    }
    public double getGoods_profit() {
        return goods_profit;
    }

    public void setGoods_profit(double goods_profit) {
        this.goods_profit = goods_profit;
    }

}
