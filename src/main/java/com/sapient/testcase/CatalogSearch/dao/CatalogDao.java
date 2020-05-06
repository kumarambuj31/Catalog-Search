package com.sapient.testcase.CatalogSearch.dao;

import com.sapient.testcase.CatalogSearch.model.Product;

import java.util.List;

public interface CatalogDao {
    public List<Product> getAllProduct();
    public List<Product> getAllProductByPriceOrder();
    public List<Product> getAllProductByColorOrder();
    public List<Product> getAllProductBySizeOrder();
}
