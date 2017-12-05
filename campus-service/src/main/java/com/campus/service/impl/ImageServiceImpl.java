package com.campus.service.impl;

import com.campus.service.ImageService;
import com.campus.model.entity.Image;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author JYC
 */
@Service
public class ImageServiceImpl implements ImageService {
    @Override
    public int insert(Image record) {
        return 0;
    }

    @Override
    public List<Image> getImagesByGoodsPrimaryKey(Integer goodsId) {
        return null;
    }

    @Override
    public int deleteImagesByGoodsPrimaryKey(Integer goodsId) {
        return 0;
    }
}
