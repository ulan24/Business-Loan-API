package com.shinobi.code.service;

import com.shinobi.code.exception.CustomerAlreadyExistsException;
import com.shinobi.code.models.BorrowerDetails;
import com.shinobi.code.models.BorrowerDetailsDTO;
import com.shinobi.code.repository.BorrowerRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BorrowerDetailsServiceImpl implements BorrowerDetailsService{

    private BorrowerRepository borrowerRepository;
    private ModelMapper mapper;

    @Autowired
    public BorrowerDetailsServiceImpl(BorrowerRepository borrowerRepository, ModelMapper mapper) {
        this.borrowerRepository = borrowerRepository;
        this.mapper = mapper;
    }

    @Override
    public BorrowerDetails saveBorrowerDetails(BorrowerDetailsDTO borrowerDetailsDTO) {
        if (borrowerRepository.existsByEmail(borrowerDetailsDTO.getEmail())) {
            throw new CustomerAlreadyExistsException("Customer with email '" + borrowerDetailsDTO.getEmail() + "' already exists.");
        }

        BorrowerDetails borrowerDetailsEntity = mapper.map(borrowerDetailsDTO, BorrowerDetails.class);
//        borrowerDetailsEntity.setAmount(borrowerDetailsDTO.getAmount().doubleValue());
        borrowerDetailsEntity = borrowerRepository.save(borrowerDetailsEntity);
        return borrowerDetailsEntity;
    }


    @Override
    public BorrowerDetailsDTO getBorrowerDetails(Long id) {
        BorrowerDetails borrowerDetailsEntity = borrowerRepository.findById(id).get();
        BorrowerDetailsDTO borrowerDetailsDTO = mapper.map(borrowerDetailsEntity, BorrowerDetailsDTO.class);
        return borrowerDetailsDTO;
    }
}
