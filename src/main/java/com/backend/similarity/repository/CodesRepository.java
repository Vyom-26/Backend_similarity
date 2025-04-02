package com.backend.similarity.repository;

import com.backend.similarity.model.Codes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CodesRepository extends JpaRepository<Codes, String> {
    // Basic CRUD operations are provided by JpaRepository
}