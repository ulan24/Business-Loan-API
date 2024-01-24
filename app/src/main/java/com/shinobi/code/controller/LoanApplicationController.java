package com.shinobi.code.controller;

import com.shinobi.code.models.LoanApplication;
import com.shinobi.code.models.LoanApplicationDTO;
import com.shinobi.code.models.LoanApplicationFetchDTO;
import com.shinobi.code.service.LoanApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/customers")
public class LoanApplicationController {

    @Autowired
    private LoanApplicationService customerService;

    @PostMapping("/saveDetails")
    public ResponseEntity<LoanApplicationDTO> saveCustomerDetails(@RequestBody LoanApplicationDTO loanApplicationDTO) {
        loanApplicationDTO = customerService.saveCustomer(loanApplicationDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(loanApplicationDTO);
    }

    @GetMapping("getDetails/{customerId}")
    public ResponseEntity<LoanApplicationFetchDTO> getCustomerDetails(@PathVariable("customerId") UUID customerId) throws Exception {
        LoanApplicationFetchDTO customerFetchDTO = customerService.getCustomerById(customerId);

        if (customerId != null) {
            return ResponseEntity.ok(customerFetchDTO);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
