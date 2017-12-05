package com.campus.web.controller;



import com.campus.common.CommonUtil;
import com.campus.model.entity.*;
import com.campus.service.GoodsService;
import com.campus.service.ImageService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.*;

/**
 * @author JYC
 */
@Controller
@RequestMapping(value = "/goods")
public class GoodsController {
    private final static Log logger = LogFactory.getLog(GoodsController.class);

    @Autowired
    private GoodsService goodsService;
    @Autowired
    private ImageService imageService;

    /**
     * 首页显示商品，每一类商品查询6件，根据最新上架排序 key的命名为catalogGoods1、catalogGoods2....
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/homeGoods")
    public ModelAndView homeGoods() throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        // 商品种类数量
        int catalogSize = 7;
        // 每个种类显示商品数量
        int goodsSize = 6;
        for (int i = 1; i <= catalogSize; i++) {
            List<Goods> goodsList = null;
            goodsList = goodsService.getGoodsByCatalogOrderByDate(i, goodsSize);
            // (用户信息和image信息不为空)封装到GoodsExtend类中，传给前台
            logger.info("获取到["+i+"]商品的集合为【"+goodsList+"】");
            if(!CommonUtil.isEmpty(goodsList)){
                logger.info("获取到["+i+"]商品的个数为【"+goodsList.size()+"】");
                List<GoodsExtend> goodsExtendList = packageGoodsExtendList(goodsList);
                String key = "catalog" + "Goods" + i;
                modelAndView.addObject(key, goodsExtendList);
            }
        }
        modelAndView.setViewName("/goods/homeGoods");
        return modelAndView;
    }


    /**
     * 封装商品信息到商品扩展信息
     * @param goodsList
     * @return
     */
    private List<GoodsExtend> packageGoodsExtendList(List<Goods> goodsList){
        List<GoodsExtend> goodsExtendList = new ArrayList<GoodsExtend>();
        for(int i = 0;i<goodsList.size();i++) {
            GoodsExtend goodsExtend = new GoodsExtend();
            Goods goods = goodsList.get(i);
            List<Image> imageList = imageService.getImagesByGoodsPrimaryKey(goods.getId());
            goodsExtend.setGoods(goods);
            goodsExtend.setImages(imageList);
            goodsExtendList.add(i,goodsExtend);
        }
        return goodsExtendList;
    }

}