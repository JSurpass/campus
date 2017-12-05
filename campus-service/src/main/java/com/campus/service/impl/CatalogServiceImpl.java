package com.campus.service.impl;

import com.campus.service.CatalogService;
import com.campus.model.entity.Catalog;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author JYC
 */
@Service
public class CatalogServiceImpl implements CatalogService {

    @Override
    public List<Catalog> getAllCatalog() {
        return null;
    }

    @Override
    public int getCount(Catalog catalog) {
        return 0;
    }

    @Override
    public Catalog selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKey(Catalog record) {
        return 0;
    }

    @Override
    public int updateCatalogNum(Integer id, Integer number) {
        return 0;
    }
}
