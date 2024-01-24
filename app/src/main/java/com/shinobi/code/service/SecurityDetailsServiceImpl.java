package com.shinobi.code.service;

import com.shinobi.code.models.SecurityDetails;
import com.shinobi.code.models.SecurityDetailsDTO;
import com.shinobi.code.repository.SecurityRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class SecurityDetailsServiceImpl implements SecurityDetailsService{

    private SecurityRepository securityRepository;
    private ModelMapper mapper;

    @Autowired
    public SecurityDetailsServiceImpl(SecurityRepository securityRepository, ModelMapper mapper) {
        this.securityRepository = securityRepository;
        this.mapper = mapper;
    }

    @Override
    public List<SecurityDetails> saveSecurityDetails(List<SecurityDetailsDTO> securityDetailsDTOList) {
        List<SecurityDetails> securityDetails = securityDetailsDTOList.stream()
                .map(securityDetailsDTO -> mapper.map(securityDetailsDTO, SecurityDetails.class))
                .collect(Collectors.toList());

        securityDetails = securityRepository.saveAll(securityDetails);

        return securityDetails;
    }

    @Override
    public List<SecurityDetailsDTO> getSecurityDetails(Long id) {
        List<SecurityDetails> securityDetails = securityRepository.findSecurityById(id);
        return securityDetails.stream()
                .map(securityDetailsDTO -> (mapper.map(securityDetailsDTO, SecurityDetailsDTO.class)))
                .collect(Collectors.toList());
    }
}
