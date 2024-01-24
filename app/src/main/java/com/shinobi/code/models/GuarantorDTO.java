package com.shinobi.code.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GuarantorDTO {

    @JsonProperty("TIN")
    private String tin;

    @JsonProperty("Legal Name")
    private String legalName;

    @JsonProperty("Guranter Type")
    private String guranterType;

    @JsonProperty("Ownership Percentage")
    private Number ownershipPercentage;
}
