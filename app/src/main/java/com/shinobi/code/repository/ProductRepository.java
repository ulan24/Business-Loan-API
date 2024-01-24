package com.shinobi.code.repository;

import com.shinobi.code.models.ProductDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<ProductDetails, Long> {
}
