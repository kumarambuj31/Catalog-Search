package com.sapient.testcase.CatalogSearch.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@ToString
@Builder
@Entity
public class Seller implements Serializable {
    public Seller(){}
    @Id
    String sellerId;
    String sellerName;
    int rating;
    String addresss;
    String pincode;
}
