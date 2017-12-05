package com.campus.model.entity;

/**
 * 类目映射类
 * @author JYC
 */
public class Catalog {
    private Integer id;
    /** 目录名称*/
    private String name;
    /** 目录编号*/
    private Integer number;
    /** 目录状态*/
    private Byte status;



    /**get/set方法*/
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}
