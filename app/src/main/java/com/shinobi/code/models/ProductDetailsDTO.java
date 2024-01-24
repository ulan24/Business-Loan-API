package com.shinobi.code.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDetailsDTO {

    @JsonProperty("Product Type")
    private String productType;

    @JsonProperty("Purpose Of Loan")
    private String purposeOfLoan;

    @JsonProperty("Amount")
    private Number amount;

    @JsonProperty("Business Title")
    private String businessTitle;

    @JsonProperty("Number Of Terms")
    private Integer numberOfTerms;
}
