package com.sapient.testcase.CatalogSearch.controller;

import com.sapient.testcase.CatalogSearch.model.Product;
import com.sapient.testcase.CatalogSearch.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.xpath.XPath;
import java.util.List;

/*

1.	Group by brand / client
2.	Group by price
3.	Group by Color
4.	Group by Size
5.	Get by SKU
6.	Available number of product by seller

 */
@RestController
public class Catalog {
    @Autowired
    CatalogService catalogService;

    @RequestMapping(path = "/product/{productId}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Product> getProduct(){

        return null;
    }

    @RequestMapping(path = "/products/{group}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Product> getAllProduct(@PathVariable String group){
        switch (group){
            case "price":{
                return catalogService.getAllProductByPriceOrder();
            }
            case "color":{
                catalogService.getAllProductByColorOrder();
            }
            case "size":{
                catalogService.getAllProductBySizeOrder();
            }
            default:{
                return catalogService.getAllProduct();
            }
        }

    }

}
