package com.sapient.testcase.CatalogSearch.dao;

import com.sapient.testcase.CatalogSearch.model.*;
import com.sapient.testcase.CatalogSearch.repository.ProductRepository;
import com.sapient.testcase.CatalogSearch.repository.SellerRepository;
import com.sapient.testcase.CatalogSearch.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class CatalogDaoImpl implements CatalogDao{

    @Autowired
    ProductRepository productRepository;
    @Autowired
    SellerRepository sellerRepository;
    @Autowired
    StockRepository stockRepository;


    private List<Product> products = new ArrayList<>();




    @Override
    public List<Product> getAllProduct() {
        final List<Product> productList = productRepository.findAll();
        productList.forEach(
                product -> {
                    final int[] available = {0};
                    stockRepository.findAll().forEach(stock1 -> {
                        if(stock1.getProductId().equals(product.getProductId())){
                            available[0] = available[0] + (stock1.getTotalQty() - stock1.getSoldQty());
                        }
                    });
                    product.setAvailable(available[0]);
                }
        );
        return productList;
    }



    @Override
    public List<Product> getAllProductByPriceOrder() {
        final List<Product> allProduct = getAllProduct();
        allProduct.sort(Comparator.comparingDouble(product -> {
            final Price price = product.getPrice();
            return price.getValue();
        }));
        return allProduct;
    }

    @Override
    public List<Product> getAllProductByColorOrder() {
        final List<Product> allProduct = getAllProduct();
        allProduct.sort(Comparator.comparing(product -> {
           return product.getColour().toString();
        }));

        return allProduct;
    }

    @Override
    public List<Product> getAllProductBySizeOrder() {
        final List<Product> allProduct = getAllProduct();
        allProduct.sort(Comparator.comparing(product -> {
            return product.getSize().toString();
        }));
        return allProduct;
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Seller createSeller(Seller seller) {
        return sellerRepository.save(seller);
    }

    @Override
    public Stock createStock(Stock stock) {
        return stockRepository.save(stock);
    }

    @Override
    public Product getProductById(String productId) {
        return productRepository.getOne(productId);
    }

    @Override
    public List<Product> findAll(Example<Product> example) {
        return productRepository.findAll(example);
    }

}
