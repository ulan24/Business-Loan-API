package com.shinobi.code.repository;

import com.shinobi.code.models.Guarantor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface GuarantorRepository extends JpaRepository<Guarantor, Long> {
    List<Guarantor> findGuarantorById(Long id);
}
