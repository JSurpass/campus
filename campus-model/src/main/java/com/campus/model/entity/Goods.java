package com.campus.model.entity;

/**
 * 商品信息映射类
 * @author JYC
 */
public class Goods {
    private Integer id;
    /** 目录id*/
    private Integer catalogId;
    /** 用户id*/
    private Integer userId;
    /** 商品名称*/
    private String name;
    /** 商品价格*/
    private Float price;
    /** 商品实际价格*/
    private Float realPrice;
    /** 开始时间*/
    private String startTime;
    /** 结束时间*/
    private String endTime;
    /** 发布时间*/
    private String publishTime;
    /** 使用时间*/
    private String polishTime;
    /** 访问次数*/
    private Integer visitNum;
    /** 评论次数*/
    private Integer commentNum;
    /** 商品描述*/
    private String description;




    /**get/set方法*/
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(Integer catalogId) {
        this.catalogId = catalogId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getRealPrice() {
        return realPrice;
    }

    public void setRealPrice(Float realPrice) {
        this.realPrice = realPrice;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    public String getPolishTime() {
        return polishTime;
    }

    public void setPolishTime(String polishTime) {
        this.polishTime = polishTime;
    }

    public Integer getVisitNum() {
        return visitNum;
    }

    public void setVisitNum(Integer visitNum) {
        this.visitNum = visitNum;
    }

    public Integer getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(Integer commentNum) {
        this.commentNum = commentNum;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}