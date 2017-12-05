package com.campus.model.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * 商品信息拓展类
 * @author JYC
 */
public class GoodsExtend {
    private Goods goods;
    private List<Image> images = new ArrayList<Image>();


    /**get/set方法*/
    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }
}