package com.sapient.testcase.CatalogSearch.service;

import com.sapient.testcase.CatalogSearch.dao.CatalogDao;
import com.sapient.testcase.CatalogSearch.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogService {

    @Autowired
    CatalogDao catalogDao;

    public List<Product> getAllProductByPriceOrder() {
        return catalogDao.getAllProductByPriceOrder();
    }

    public List<Product> getAllProductByColorOrder() {
        return catalogDao.getAllProductByColorOrder();
    }

    public List<Product> getAllProduct() {
        return catalogDao.getAllProduct();
    }

    public List<Product> getAllProductBySizeOrder() {
        return catalogDao.getAllProductBySizeOrder();
    }
}
