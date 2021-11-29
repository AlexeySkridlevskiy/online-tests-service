package com.example.onlinetestsservice.repository;

import com.example.onlinetestsservice.models.questions;
import org.springframework.data.jpa.repository.JpaRepository;


public interface questionsRepository extends JpaRepository<questions, Integer>  {
}