package com.shinobi.code.repository;

import com.shinobi.code.models.SecurityDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface SecurityRepository extends JpaRepository<SecurityDetails, Long> {
    List<SecurityDetails> findSecurityById(Long id);
}
