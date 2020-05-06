package com.sapient.testcase.CatalogSearch.model;

public enum Size {
    SMALL("S"),
    MEDIUM("M"),
    LARGE("L"),
    XTRALARGE("XL"),
    XXTRALARGE("XXL");

    private String size;

    Size(String size){
        this.size = size;
    }
    public String getSize(){
        return size;
    }
}
