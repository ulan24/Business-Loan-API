package com.shinobi.code.service;

import com.shinobi.code.models.BorrowerDetails;
import com.shinobi.code.models.BorrowerDetailsDTO;

import java.util.UUID;

public interface BorrowerDetailsService {
    BorrowerDetails saveBorrowerDetails(BorrowerDetailsDTO borrowerDetailsDTO);
    BorrowerDetailsDTO getBorrowerDetails(Long id);
}
