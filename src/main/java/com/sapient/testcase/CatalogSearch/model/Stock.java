package com.sapient.testcase.CatalogSearch.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Builder
@Entity
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Stock implements Serializable {
    public Stock(){}
    @Id
    String productId;
    String sellerId;
    int totalQty;
    int soldQty;
}
