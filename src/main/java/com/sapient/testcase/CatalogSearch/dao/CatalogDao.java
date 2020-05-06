package com.sapient.testcase.CatalogSearch.dao;

import com.sapient.testcase.CatalogSearch.model.Product;
import com.sapient.testcase.CatalogSearch.model.Seller;
import com.sapient.testcase.CatalogSearch.model.Stock;
import org.springframework.data.domain.Example;

import javax.xml.ws.Response;
import java.util.List;

public interface CatalogDao {
    public List<Product> getAllProduct();
    public List<Product> getAllProductByPriceOrder();
    public List<Product> getAllProductByColorOrder();
    public List<Product> getAllProductBySizeOrder();

    public Product createProduct(Product product);
    public Seller createSeller(Seller seller);
    public Stock createStock(Stock stock);

    Product getProductById(String productId);

    List<Product> findAll(Example<Product> example);
}
