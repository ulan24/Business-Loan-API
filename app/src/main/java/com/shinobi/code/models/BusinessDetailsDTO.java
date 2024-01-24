package com.shinobi.code.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BusinessDetailsDTO {

    @JsonProperty("Established Date")
    private String establishedDate;

    @JsonProperty("State Of Incorporation")
    private String stateOfIncorporation;

    @JsonProperty("Number Of Employees")
    private Integer numberOfEmployees;

    @JsonProperty("Nature Of Business")
    private String natureOfBusiness;

    @JsonProperty("Amount")
    private Number amount;

    @JsonProperty("NAICS Code")
    private String naicsCode;
}
