package com.sapient.testcase.CatalogSearch.controller;

import com.sapient.testcase.CatalogSearch.model.Product;
import com.sapient.testcase.CatalogSearch.model.Seller;
import com.sapient.testcase.CatalogSearch.model.Stock;
import com.sapient.testcase.CatalogSearch.service.CatalogService;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.xml.ws.Response;
import javax.xml.xpath.XPath;
import java.net.URI;
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

    @RequestMapping(path = "/product",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Product> createProuct(@RequestBody @NonNull Product product){
        final Product product1 = catalogService.createProduct(product);
        return new ResponseEntity<Product>(product1, HttpStatus.CREATED);
    }

    @RequestMapping(path = "/product/{productId}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Product getProductById(@PathVariable String productId){
        return catalogService.getProductById(productId);
    }


    @RequestMapping(path = "/seller",
    method = RequestMethod.POST,
    consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Seller> createSeller(@RequestBody Seller seller){
        return new ResponseEntity<>(catalogService.createSeller(seller),HttpStatus.CREATED);
    }

    @RequestMapping(path = "/stock",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Stock> createStock(@RequestBody Stock stock){
        return new ResponseEntity<>(catalogService.createStock(stock),HttpStatus.CREATED);
    }


    @RequestMapping(path = "/products",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Product>> getAllProduct(){
        return new ResponseEntity<>(catalogService.getAllProduct(), HttpStatus.OK);
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
