package com.shinobi.code.repository;

import com.shinobi.code.models.BorrowerDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Map;
import java.util.UUID;

public interface BorrowerRepository extends JpaRepository<BorrowerDetails, Long> {
    boolean existsByEmail(String email);
}
