package com.shinobi.code.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
public class BusinessDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String establishedDate;
    private String stateOfIncorporation;
    private Integer numberOfEmployees;
    private String natureOfBusiness;
    private BigDecimal amount;
    private String naicsCode;

}
