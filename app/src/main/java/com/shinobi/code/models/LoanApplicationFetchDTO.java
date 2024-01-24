package com.shinobi.code.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class LoanApplicationFetchDTO {

    private String ver;
    private String status;
    private String createTimestamp;

    @JsonProperty("BorrowerDetails")
    private BorrowerDetailsDTO borrowerDetailsDTO;

    @JsonProperty("BusinessDetails")
    private BusinessDetailsDTO businessDetailsDTO;

    @JsonProperty("Address")
    private AddressDTO addressDTO;

    @JsonProperty("ProductDetails")
    private ProductDetailsDTO productDetailsDTO;

    @JsonProperty("Guarantor")
    private List<GuarantorDTO> guarantorsDTO;

    @JsonProperty("SecurityDetails")
    private List<SecurityDetailsDTO> securityDetailsDTO;
}
