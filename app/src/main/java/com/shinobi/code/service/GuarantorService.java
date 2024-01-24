package com.shinobi.code.service;

import com.shinobi.code.models.Guarantor;
import com.shinobi.code.models.GuarantorDTO;

import java.util.List;
import java.util.UUID;

public interface GuarantorService {
    List<Guarantor> saveGuarantor(List<GuarantorDTO> guarantorDTOList);
    List<GuarantorDTO> getGuarantor(Long id);
}
