package com.campus.dao;

import com.campus.model.entity.Image;

import java.util.List;


/**
 * @author JYC
 */
public interface ImageMapper {
    /**
     * 根据id删除一条记录
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 根据商品id删除图片
     * @param goodsId
     * @return
     */
    int deleteImagesByGoodsPrimaryKey(Integer goodsId);

    /**
     * 新增一个商品图
     * @param record
     * @return
     */
    int insertImage(Image record);

    /**
     * 选择插入商品图片
     * @param record
     * @return
     */
    int insertSelective(Image record);

    /**
     * 根据id查询商品图片信息
     * @param id
     * @return
     */
    Image selectByPrimaryKey(Integer id);

    /**
     * 根据选择id更新商品图片信息
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Image record);

    /**
     * 根据
     * @param record
     * @return
     */
    int updateByPrimaryKeyWithBLOBs(Image record);

    /**
     * 根据id更新商品图片信息
     * @param record
     * @return
     */
    int updateByPrimaryKey(Image record);

    /**
     * 根据商品id查询图片信息集合
     * @param goodsId
     * @return
     */
    List<Image> selectByGoodsPrimaryKey(Integer goodsId);
}