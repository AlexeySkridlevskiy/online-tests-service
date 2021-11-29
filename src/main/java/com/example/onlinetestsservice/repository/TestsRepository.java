package com.example.onlinetestsservice.repository;

import com.example.onlinetestsservice.models.Tests;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface TestsRepository extends JpaRepository<Tests, Integer>  {
    Optional<Tests> findByTitle(String title);
}