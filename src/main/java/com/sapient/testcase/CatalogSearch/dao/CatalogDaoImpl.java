package com.sapient.testcase.CatalogSearch.dao;

import com.sapient.testcase.CatalogSearch.model.*;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class CatalogDaoImpl implements CatalogDao{

    private List<Product> products = new ArrayList<>();

    @Override
    public List<Product> getAllProduct() {
        if(products.size()>0){
            return products;
        }
        inializeProducts();
        return products;
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

    private void inializeProducts() {
        Seller s1 = new Seller("s1", "Seller 1");
        Seller s2 = new Seller("s2", "Seller 2");
        Seller s3 = new Seller("s3", "Seller 3");

        String id1 = UUID.randomUUID().toString();
        Product p1 = new Product();
        p1.setProductId(id1);
        p1.setName("FORMAL SHIRT");
        p1.setAvailable(10);
        p1.setBrand("XYZ");
        p1.setColour(Colour.GREEN);
        p1.setSize(Size.MEDIUM);
        Price p = new Price(id1, "INR", 2000d);
        List<Seller> sellers = Arrays.asList(s1,s2,s3);
        p1.setPrice(p);
        p1.setSellerList(sellers);
        products.add(p1);

        String id2 = UUID.randomUUID().toString();
        Product p2 = new Product();
        p2.setName("TROUSER PANT");
        p2.setProductId(id2);
        p2.setAvailable(100);
        p2.setBrand("XYZ");
        p2.setColour(Colour.YELLOW);
        p2.setSize(Size.MEDIUM);
        Price price2 = new Price(id2, "INR", 3000d);
        List<Seller> sellers2 = Arrays.asList(s1,s2);
        p2.setPrice(price2);
        p2.setSellerList(sellers2);
        products.add(p2);

        String id3 = UUID.randomUUID().toString();
        Product p3 = new Product();
        p3.setName("TROUSER PANT");
        p3.setProductId(id2);
        p3.setAvailable(100);
        p3.setBrand("XYZ");
        p3.setColour(Colour.RED);
        p3.setSize(Size.LARGE);
        Price price3 = new Price(id3, "INR", 5000d);
        List<Seller> sellers3 = Arrays.asList(s1);
        p3.setPrice(price3);
        p3.setSellerList(sellers3);
        products.add(p3);

    }
}
