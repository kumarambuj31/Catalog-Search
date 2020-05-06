package com.sapient.testcase.CatalogSearch.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
public class Price {
    String productId;
    String currency;
    double value;

    public Price(String productId, String currency, double value) {
        this.productId = productId;
        this.currency = currency;
        this.value = value;
    }


    public double getValue() {
        return this.value;
    }
}
