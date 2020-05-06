package com.sapient.testcase.CatalogSearch.service;

import com.sapient.testcase.CatalogSearch.dao.CatalogDao;
import com.sapient.testcase.CatalogSearch.model.Product;
import com.sapient.testcase.CatalogSearch.model.Seller;
import com.sapient.testcase.CatalogSearch.model.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
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


    public Product createProduct(Product product){
        return catalogDao.createProduct(product);
    }
    public Seller createSeller(Seller seller){
        return catalogDao.createSeller(seller);
    }
    public Stock createStock(Stock stock){
        return catalogDao.createStock(stock);
    }

    public Product getProductById(String productId) {
        return catalogDao.getProductById(productId);
    }

    public List<Product> searchAll(Product searchSimilarProduct) {
        Example<Product> example = Example.of(searchSimilarProduct);
        return catalogDao.findAll(example);
    }
}
