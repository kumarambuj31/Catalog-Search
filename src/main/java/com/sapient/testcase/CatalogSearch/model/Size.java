package com.sapient.testcase.CatalogSearch.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
@JsonDeserialize(as = Size.class)
public enum Size {
    SMALL("S"),
    MEDIUM("M"),
    LARGE("L"),
    XTRALARGE("XL"),
    XXTRALARGE("XXL");

    private String size;

    /*Size(String size){
        this.size = size;
    }
    public String getSize(){
        return size;
    }

     */
}
