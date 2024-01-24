package com.shinobi.code.service;

import com.shinobi.code.models.BusinessDetails;
import com.shinobi.code.models.BusinessDetailsDTO;

import java.util.UUID;

public interface BusinessDetailsService {
    BusinessDetails saveBusinessDetails(BusinessDetailsDTO businessDetailsDTO);
    BusinessDetailsDTO getBusinessDetails(Long id);

}
