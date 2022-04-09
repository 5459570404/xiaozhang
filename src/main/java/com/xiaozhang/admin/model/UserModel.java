package com.xiaozhang.admin.model;

/**
 * @autor：张天治
 * @time:2018/12/9 17:14
 * @desc：
 */
public class UserModel {
    private String id=null;
    private String name=null;
    private String ps=null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPs() {
        return ps;
    }

    public void setPs(String ps) {
        this.ps = ps;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", ps='" + ps + '\'' +
                '}';
    }
}
