package com.shinobi.code.repository;

import com.shinobi.code.models.LoanApplication;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface LoanRepository extends JpaRepository<LoanApplication, UUID> {
    Optional<LoanApplication> findById(UUID customerID);
}
