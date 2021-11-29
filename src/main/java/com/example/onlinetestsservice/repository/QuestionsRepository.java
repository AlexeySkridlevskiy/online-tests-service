package com.example.onlinetestsservice.repository;

import com.example.onlinetestsservice.models.Questions;
import org.springframework.data.jpa.repository.JpaRepository;


public interface QuestionsRepository extends JpaRepository<Questions, Integer>  {
}