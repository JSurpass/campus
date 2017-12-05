package com.campus.model.entity;

/**
 * 通知信息映射类
 * @author JYC
 */
public class Notice {
    private Integer id;
    /** 用户id*/
    private Integer userId;
    /** 创建时间*/
    private String createTime;
    /** 通知状态*/
    private Byte status;
    /** 通知内容*/
    private String context;



    /**get/set方法*/
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}
