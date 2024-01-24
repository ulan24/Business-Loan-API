package com.shinobi.code.service;

import com.shinobi.code.models.*;
import com.shinobi.code.repository.*;
import jakarta.persistence.EntityNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class LoanApplicationServiceImpl implements LoanApplicationService{

    private BorrowerDetailsService borrowerDetailsService;
    private BusinessDetailsService businessDetailsService;
    private AddressService addressService;
    private ProductDetailsService productDetailsService;
    private GuarantorService guarantorService;
    private SecurityDetailsService securityDetailsService;
    private LoanRepository loanRepository;
    private ModelMapper mapper;

    @Autowired
    public LoanApplicationServiceImpl(BorrowerDetailsService borrowerDetailsService,
                                      BusinessDetailsService businessDetailsService,
                                      AddressService addressService,
                                      ProductDetailsService productDetailsService,
                                      GuarantorService guarantorService,
                                      SecurityDetailsService securityDetailsService,
                                      LoanRepository loanRepository,
                                      ModelMapper mapper) {
        this.borrowerDetailsService = borrowerDetailsService;
        this.businessDetailsService = businessDetailsService;

        this.addressService = addressService;
        this.productDetailsService = productDetailsService;
        this.guarantorService = guarantorService;
        this.securityDetailsService = securityDetailsService;
        this.loanRepository = loanRepository;
        this.mapper = mapper;
    }


    @Override
    public LoanApplicationDTO saveCustomer(LoanApplicationDTO loanApplicationDTO) {
        // Save all the objects in DB using the services we've early created
//        BorrowerDetails borrowerDetails = borrowerDetailsService.saveBorrowerDetails(loanApplicationDTO.getBorrowerDetails());
//        BusinessDetails businessDetails = businessDetailsService.saveBusinessDetails(loanApplicationDTO.getBusinessDetails());
//        Address address = addressService.saveAddress(loanApplicationDTO.getAddress());
//        ProductDetails productDetails = productDetailsService.saveProductDetails(loanApplicationDTO.getProductDetails());
//        List<Guarantor> guarantors = guarantorService.saveGuarantor(loanApplicationDTO.getGuarantors());
//        List<SecurityDetails> securityDetails = securityDetailsService.saveSecurityDetails(loanApplicationDTO.getSecurityDetails());

        LoanApplication loanApplication = mapper.map(loanApplicationDTO, LoanApplication.class);
        loanApplication.setStatus("active");
        loanApplication.setVer("1.0");
        loanRepository.save(loanApplication);

        return mapper.map(loanApplication, LoanApplicationDTO.class);
    }

    @Override
    public LoanApplicationFetchDTO getCustomerById(UUID customerID) {
        Optional<LoanApplication> loanApplication = loanRepository.findById(customerID);

        if (loanApplication.isPresent()) {
            LoanApplication loanApplicationEntity = loanApplication.get();

            LoanApplicationFetchDTO loanApplicationFetchDTO = mapper.map(loanApplicationEntity, LoanApplicationFetchDTO.class);
            loanApplicationFetchDTO.setBusinessDetailsDTO(mapper.map(loanApplicationEntity.getBusinessDetails(), BusinessDetailsDTO.class));
            loanApplicationFetchDTO.setBorrowerDetailsDTO(mapper.map(loanApplicationEntity.getBorrowerDetails(), BorrowerDetailsDTO.class));
            loanApplicationFetchDTO.setAddressDTO(mapper.map(loanApplicationEntity.getAddress(), AddressDTO.class));
            loanApplicationFetchDTO.setProductDetailsDTO(mapper.map(loanApplicationEntity.getProductDetails(), ProductDetailsDTO.class));

            List<GuarantorDTO> guarantors = loanApplicationEntity.getGuarantors().stream()
                            .map(guarantor -> mapper.map(guarantor, GuarantorDTO.class))
                            .collect(Collectors.toList());
            loanApplicationFetchDTO.setGuarantorsDTO(guarantors);

            List<SecurityDetailsDTO> securityDetailsDTOList = loanApplicationEntity.getSecurityDetails().stream()
                    .map(securityDetails -> mapper.map(securityDetails, SecurityDetailsDTO.class))
                    .collect(Collectors.toList());
            loanApplicationFetchDTO.setSecurityDetailsDTO(securityDetailsDTOList);

            return loanApplicationFetchDTO;
        } else {
            throw new EntityNotFoundException("Customer details not found with ID: " + customerID);
        }

    }
}
