package com.shinobi.code.service;

import com.shinobi.code.models.Address;
import com.shinobi.code.models.AddressDTO;
import com.shinobi.code.repository.AddressRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService{


    private AddressRepository addressRepository;
    private ModelMapper mapper;

    @Autowired
    public AddressServiceImpl(AddressRepository addressRepository, ModelMapper mapper) {
        this.addressRepository = addressRepository;
        this.mapper = mapper;
    }

    @Override
    public Address saveAddress(AddressDTO addressDTO) {
        Address addressEntity = mapper.map(addressDTO, Address.class);
        addressEntity = addressRepository.save(addressEntity);
        return addressEntity;
    }

    @Override
    public AddressDTO getAddress(Long id) {
        Address addressEntity = addressRepository.findById(id).get();
        return mapper.map(addressEntity, AddressDTO.class);
    }
}
