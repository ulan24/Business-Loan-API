package com.shinobi.code.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
public class LoanApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID customerID;
    private String ver;
    private String status;
    @CreationTimestamp
    private String createTimestamp;

    @OneToOne(cascade = CascadeType.ALL)
    @OrderColumn(name = "borrower_order")
    private BorrowerDetails borrowerDetails;

    @OneToOne(cascade = CascadeType.ALL)
    private BusinessDetails businessDetails;

    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    @OneToOne(cascade = CascadeType.ALL)
    private ProductDetails productDetails;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Guarantor> guarantors;

    @OneToMany(cascade = CascadeType.ALL)
    private List<SecurityDetails> securityDetails;


}
