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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.List;


@ToString
@Getter
@Setter
@Builder
@Entity
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Product implements Serializable {
    public Product(){}
    @Id
    String productId;
    String name;
    Colour colour;
    Size size;
    String brand;
    Price price;
    int available;
}
