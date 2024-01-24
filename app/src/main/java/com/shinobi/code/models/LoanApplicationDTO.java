package com.shinobi.code.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class LoanApplicationDTO {

    @JsonProperty("BorrowerDetails")
    private BorrowerDetailsDTO borrowerDetails;

    @JsonProperty("BusinessDetails")
    private BusinessDetailsDTO businessDetails;

    @JsonProperty("Address")
    private AddressDTO address;

    @JsonProperty("ProductDetails")
    private ProductDetailsDTO productDetails;

    @JsonProperty("Guarantor")
    private List<GuarantorDTO> guarantors;

    @JsonProperty("SecurityDetails")
    private List<SecurityDetailsDTO> securityDetails;
}
