package com.shinobi.code.models;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
public class ProductDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productType;
    private String purposeOfLoan;
    private BigDecimal amount;
    private String businessTitle;
    private Integer numberOfTerms;
}
