package com.sapient.testcase.CatalogSearch.model;

public enum Colour {
    RED("RED"),
    YELLOW("YELLOW"),
    GREEN("GREEN");
    private String colour;

    Colour(final String colour){
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }
}
