package com.shinobi.code.models;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BorrowerDetailsDTO {

    @JsonProperty("Customer Type")
    private String customerType;

    @JsonProperty("TIN")
    private String tin;

    @JsonProperty("First Name")
    private String firstName;

    @JsonProperty("Middle Name")
    private String middleName;

    @JsonProperty("Last Name")
    private String lastName;

    @JsonProperty("Business Legal Name")
    private String businessLegalName;

    @JsonProperty("Email")
    private String email;

    @JsonProperty("Contact No")
    private String contactNo;

    @JsonProperty("Date of Birth")
    private String dob;

    @JsonProperty("Amount")
    private Number amount;
}
