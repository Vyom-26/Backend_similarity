package com.backend.similarity.repository;

import com.backend.similarity.model.Contest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContestRepository extends JpaRepository<Contest, String> {
    // Basic CRUD operations are provided by JpaRepository
}