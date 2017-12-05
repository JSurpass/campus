package com.campus.common;



import com.campus.model.entity.User;

import java.util.List;

/**
 * 用户分页查询工具类
 * @author lenovo
 * @date 2017/5/14
 */
public class UserGrid {

    /**总行数*/
    private int total;
    /**当前页面号*/
    private int current;
    /**每页行数*/
    private int rowCount;

    private List<User> rows;

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<User> getRows() {
        return rows;
    }

    public void setRows(List<User> rows) {
        this.rows = rows;
    }
}
