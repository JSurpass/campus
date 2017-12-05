package com.campus.dao;

import com.campus.model.entity.Catalog;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author JYC
 */
public interface CatalogMapper {

    /**
     * 根据id删除目录
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 插入一个目录
     * @param record
     * @return
     */
    int insert(Catalog record);

    /**
     *
     * @param record
     * @return
     */
    int insertSelective(Catalog record);

    /**
     * 根据id查找目录
     * @param id
     * @return
     */
    Catalog selectByPrimaryKey(Integer id);

    /**
     * 更新目录
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Catalog record);

    /**
     * 根据id更新目录
     * @param record
     * @return
     */
    int updateByPrimaryKey(Catalog record);

    /**
     * 根据id更新类目下的商品数量
     * @param id
     * @param number
     * @return
     */
    int updateCatelogNum(@Param("id") Integer id, @Param("number") Integer number);

    /**
     * 根据商品类别查询商品
     * @return
     */
    List<Catalog> getAllCatelog();

    /**
     * 查询类目数量
     * @param catalog
     * @return
     */
    int getCount(Catalog catalog);
}