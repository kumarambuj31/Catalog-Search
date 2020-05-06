package com.sapient.testcase.CatalogSearch.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@JsonDeserialize(as = Colour.class)
public enum Colour {
    RED("RED"),
    YELLOW("YELLOW"),
    BLACK("BLACK"),
    BLUE("BLUE"),
    PURPLE("PURPLE"),
    PINK("PINK"),
    GREEN("GREEN");
    private String colour;

    /*Colour(final String colour){
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }*/
}
