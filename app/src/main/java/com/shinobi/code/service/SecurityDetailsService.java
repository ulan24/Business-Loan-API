package com.shinobi.code.service;

import com.shinobi.code.models.SecurityDetails;
import com.shinobi.code.models.SecurityDetailsDTO;

import java.util.List;
import java.util.UUID;

public interface SecurityDetailsService {
    List<SecurityDetails> saveSecurityDetails(List<SecurityDetailsDTO> securityDetailsDTOList);
    List<SecurityDetailsDTO> getSecurityDetails(Long id);
}
