package com.example.onlinetestsservice.repository;

import com.example.onlinetestsservice.models.tests;
import org.springframework.data.jpa.repository.JpaRepository;


public interface testsRepository extends JpaRepository<tests, Integer>  {
}