package com.shinobi.code.service;

import com.shinobi.code.models.ProductDetails;
import com.shinobi.code.models.ProductDetailsDTO;
import com.shinobi.code.repository.ProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ProductDetailsServiceImpl implements ProductDetailsService{

    private ProductRepository productRepository;
    private ModelMapper mapper;

    @Autowired
    public ProductDetailsServiceImpl(ProductRepository productRepository, ModelMapper mapper) {
        this.productRepository = productRepository;
        this.mapper = mapper;
    }

    @Override
    public ProductDetails saveProductDetails(ProductDetailsDTO productDetailsDTO) {
        ProductDetails productDetailsEntity = mapper.map(productDetailsDTO, ProductDetails.class);
        productDetailsEntity = productRepository.save(productDetailsEntity);
        return productDetailsEntity;
    }

    @Override
    public ProductDetailsDTO getProductDetails(Long id) {
        ProductDetails productDetailsEntity = productRepository.findById(id).get();
        return mapper.map(productDetailsEntity, ProductDetailsDTO.class);
    }
}
