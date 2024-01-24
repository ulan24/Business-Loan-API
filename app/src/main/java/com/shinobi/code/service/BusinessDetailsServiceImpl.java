package com.shinobi.code.service;


import com.shinobi.code.models.BusinessDetails;
import com.shinobi.code.models.BusinessDetailsDTO;
import com.shinobi.code.repository.BusinessRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BusinessDetailsServiceImpl implements BusinessDetailsService{

    private BusinessRepository businessRepository;
    private ModelMapper mapper;

    @Autowired
    public BusinessDetailsServiceImpl(BusinessRepository businessRepository, ModelMapper mapper) {
        this.businessRepository = businessRepository;
        this.mapper = mapper;
    }

    @Override
    public BusinessDetails saveBusinessDetails(BusinessDetailsDTO businessDetailsDTO) {
        BusinessDetails businessDetailsEntity = mapper.map(businessDetailsDTO, BusinessDetails.class);
        businessDetailsEntity = businessRepository.save(businessDetailsEntity);
        return businessDetailsEntity;
    }


    @Override
    public BusinessDetailsDTO getBusinessDetails(Long id) {
        BusinessDetails businessDetailsEntity = businessRepository.findById(id).get();
        return mapper.map(businessDetailsEntity, BusinessDetailsDTO.class);
    }
}
