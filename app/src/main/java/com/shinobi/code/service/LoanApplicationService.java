package com.shinobi.code.service;

import com.shinobi.code.models.LoanApplication;
import com.shinobi.code.models.LoanApplicationDTO;
import com.shinobi.code.models.LoanApplicationFetchDTO;

import java.util.UUID;

public interface LoanApplicationService {
    LoanApplicationDTO saveCustomer(LoanApplicationDTO loanApplicationDTO);
    LoanApplicationFetchDTO getCustomerById(UUID customerID);
}
