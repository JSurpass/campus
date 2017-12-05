package com.campus.service;

import com.campus.model.entity.Catalog;

import java.util.List;

/**
 * @author JYC
 */
public interface CatalogService {
    /**
     * 获取所有的目录
     * @return
     */
    public List<Catalog> getAllCatalog();

    /**
     * 获取目录总数
     * @param catalog
     * @return
     */
    public int getCount(Catalog catalog);

    /**
     * 根据id查询目录
     * @param id
     * @return
     */
    Catalog selectByPrimaryKey(Integer id);

    /**
     * 根据目录编号更新
     * @param record
     * @return
     */
    int updateByPrimaryKey(Catalog record);

    /**
     * 根据目录的id更新目录数量
     * @param id
     * @param number
     * @return
     */
    int updateCatalogNum(Integer id, Integer number);
}
