package com.shinobi.code.service;

import com.shinobi.code.models.Address;
import com.shinobi.code.models.AddressDTO;

import java.util.UUID;

public interface AddressService {
    Address saveAddress(AddressDTO addressDTO);
    AddressDTO getAddress(Long id);
}
