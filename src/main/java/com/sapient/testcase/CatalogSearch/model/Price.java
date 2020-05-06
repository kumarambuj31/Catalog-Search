package com.sapient.testcase.CatalogSearch.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Setter
@Getter
@ToString
@AllArgsConstructor
@Builder
public class Price implements Serializable {
    public Price(){}
    @Id
    String productId;
    String currency;
    double value;

}
