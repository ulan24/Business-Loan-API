package com.shinobi.code.service;

import com.shinobi.code.models.ProductDetails;
import com.shinobi.code.models.ProductDetailsDTO;

import java.util.UUID;

public interface ProductDetailsService {

    ProductDetails saveProductDetails(ProductDetailsDTO productDetailsDTO);
    ProductDetailsDTO getProductDetails(Long id);
}
