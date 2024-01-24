package com.shinobi.code.models;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@JsonPropertyOrder(value = {"id", "customerType", "tin", "firstName", "middleName", "lastName",
                        "businessLegalName", "email", "contactNo", "dob", "amount"})
public class BorrowerDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String customerType;
    private String tin;
    private String firstName;
    private String middleName;
    private String lastName;
    private String businessLegalName;
    private String email;
    private String contactNo;
    private String dob;
    private BigDecimal amount;

}
