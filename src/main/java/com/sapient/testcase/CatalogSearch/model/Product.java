package com.sapient.testcase.CatalogSearch.model;

/*

1.	Group by brand / client
2.	Group by price
3.	Group by Color
4.	Group by Size
5.	Get by SKU
6.	Available number of product by seller
1.	Group by brand / client
2.	Group by price
3.	Group by Color
4.	Group by Size
5.	Get by SKU
6.	Available number of product by seller
 */

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.util.List;


@ToString
public class Product {
    String productId;
    String name;
    Enum<Colour> colour;
    Enum<Size> size;
    String brand;
    Price price;
    int available;
    List<Seller> sellerList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Enum<Colour> getColour() {
        return colour;
    }

    public void setColour(Enum<Colour> colour) {
        this.colour = colour;
    }

    public Enum<Size> getSize() {
        return size;
    }

    public void setSize(Enum<Size> size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public List<Seller> getSellerList() {
        return sellerList;
    }

    public void setSellerList(List<Seller> sellerList) {
        this.sellerList = sellerList;
    }


}
