package com.campus.service;

import com.campus.model.entity.Image;

import java.util.List;

/**
 * @author JYC
 */
public interface ImageService {

    /**
     * 插入图片
     * @param record
     * @return
     */
    int insert(Image record);

    /**
     * 通过商品id获取该商品的图片
     * @param goodsId
     * @return
     */
    public List<Image> getImagesByGoodsPrimaryKey(Integer goodsId);

    /**
     * 通过商品Id删除商品
     * @param goodsId
     * @return
     */
    int deleteImagesByGoodsPrimaryKey(Integer goodsId);

}
