package com.shinobi.code.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressDTO {

    @JsonProperty("Address Line 1")
    private String addressLine1;

    @JsonProperty("Address Line 2")
    private String addressLine2;

    @JsonProperty("City")
    private String city;

    @JsonProperty("State")
    private String state;

    @JsonProperty("Zipcode")
    private String zipcode;
}
