package com.shinobi.code.service;

import com.shinobi.code.models.Guarantor;
import com.shinobi.code.models.GuarantorDTO;
import com.shinobi.code.repository.GuarantorRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class GuarantorServiceImpl implements GuarantorService{


    private GuarantorRepository guarantorRepository;
    private ModelMapper mapper;

    @Autowired
    public GuarantorServiceImpl(GuarantorRepository guarantorRepository, ModelMapper mapper) {
        this.guarantorRepository = guarantorRepository;
        this.mapper = mapper;
    }

    @Override
    public List<Guarantor> saveGuarantor(List<GuarantorDTO> guarantorDTOList) {
        List<Guarantor> guarantors = guarantorDTOList.stream()
                .map(guarantorDTO -> mapper.map(guarantorDTO, Guarantor.class))
                .collect(Collectors.toList());

        guarantors = guarantorRepository.saveAll(guarantors);

        return guarantors;
    }


    @Override
    public List<GuarantorDTO> getGuarantor(Long id) {
        List<Guarantor> guarantors  = guarantorRepository.findGuarantorById(id);
        return guarantors.stream()
                .map(guarantor -> mapper.map(guarantor, GuarantorDTO.class))
                .collect(Collectors.toList());
    }
}
