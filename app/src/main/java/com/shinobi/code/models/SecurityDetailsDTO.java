package com.shinobi.code.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SecurityDetailsDTO {

    @JsonProperty("Collateral Type")
    private String collateralType;

    @JsonProperty("Collateral Details")
    private String collateralDetails;

    @JsonProperty("Amount")
    private Number amount;
}
