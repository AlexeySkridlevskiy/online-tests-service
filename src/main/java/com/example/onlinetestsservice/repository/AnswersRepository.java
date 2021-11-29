package com.example.onlinetestsservice.repository;

import com.example.onlinetestsservice.models.Answers;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AnswersRepository extends JpaRepository<Answers, Integer>  {
}
