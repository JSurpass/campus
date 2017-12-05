package com.campus.model.entity;

/**
 * 评论回复映射类
 * @author JYC
 */
public class Reply {
    private Integer id;
    /** 用户id*/
    private Integer userId;
    /** 当前用户id*/
    private Integer atUserId;
    /** 商品id*/
    private Integer goodsId;
    /** 评论id*/
    private Integer commentId;
    /** 创建时间*/
    private String createTime;
    /** 回复内容*/
    private String content;



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

    public Integer getAtUserId() {
        return atUserId;
    }

    public void setAtUserId(Integer atUserId) {
        this.atUserId = atUserId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
