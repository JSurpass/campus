package com.campus.service;


import com.campus.model.entity.Goods;

import java.util.List;

/**
 * @author JYC
 */
public interface GoodsService {
    /**
     * 发布商品
     * @param goods
     * @param duration 允许上架时长
     * @return int
     */
    int addGood(Goods goods, Integer duration);

    /**
     * 通过主键获取商品
     * @param goodsId
     * @return Goods
     */
    Goods getGoodsByPrimaryKey(Integer goodsId);

    /**
     * 更新商品信息
     * @param goods
     */
    void updateGoodsByPrimaryKeyWithBLOBs(int goodsId, Goods goods);

    /**
     * 通过主键删除商品
     * @param id
     */
    void deleteGoodsByPrimaryKey(Integer id);

    /**
     * 获取所有商品信息
     * @return List<Goods>
     */
    List<Goods> getAllGoods();

    /**
     * 通过商品名称及商品描述获取商品信息
     * @param name
     * @param description
     * @return
     */
    List<Goods> searchGoods(String name, String description);

    /**
     * 通过商品分类获取商品信息
     * @param id
     * @param name
     * @param description
     * @return List<Goods>
     */
    List<Goods> getGoodsByCatalog(Integer id, String name, String description);

    /**
     * 根据分类id,并进行时间排序,获取前limit个结果
     * @param catalogId
     * @param limit
     * @return List<Goods>
     */
    List<Goods> getGoodsByCatalogOrderByDate(Integer catalogId, Integer limit);

    /**
     * 根据用户的id，查询出该用户的所有闲置
     * @param user_id
     * @return List<Goods>
     */
    List<Goods> getGoodsByUserId(Integer user_id);
}
