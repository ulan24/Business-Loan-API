package com.shinobi.code.repository;

import com.shinobi.code.models.BusinessDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BusinessRepository extends JpaRepository<BusinessDetails, Long> {
}
