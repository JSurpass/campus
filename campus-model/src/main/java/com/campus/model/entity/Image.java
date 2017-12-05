package com.campus.model.entity;

/**
 * 图片信息映射类
 * @author JYC
 */
public class Image {

    private Integer id;
    /** 商品id*/
    private Integer goodsId;
    /** 图片地址*/
    private String imgUrl;


    /**get/set方法*/
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }
}