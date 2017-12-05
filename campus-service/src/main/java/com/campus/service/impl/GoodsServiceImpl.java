package com.campus.service.impl;

import com.campus.common.CommonUtil;
import com.campus.dao.GoodsMapper;
import com.campus.service.GoodsService;
import com.campus.model.entity.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author JYC
 */
@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;


    @Override
    public int addGood(Goods goods, Integer duration) {
        return 0;
    }

    @Override
    public Goods getGoodsByPrimaryKey(Integer goodsId) {
        return null;
    }

    @Override
    public void updateGoodsByPrimaryKeyWithBLOBs(int goodsId, Goods goods) {

    }

    @Override
    public void deleteGoodsByPrimaryKey(Integer id) {

    }

    @Override
    public List<Goods> getAllGoods() {
        return null;
    }

    @Override
    public List<Goods> searchGoods(String name, String description) {
        return null;
    }

    @Override
    public List<Goods> getGoodsByCatalog(Integer id, String name, String description) {
        return null;
    }

    @Override
    public List<Goods> getGoodsByCatalogOrderByDate(Integer catalogId, Integer limit) {
        List<Goods> goodsList = goodsMapper.selectByCatalogOrderByDate(catalogId, limit);
        if (!CommonUtil.isEmpty(goodsList)){
            return goodsList;
        }
        return null;
    }

    @Override
    public List<Goods> getGoodsByUserId(Integer user_id) {
        return null;
    }
}
