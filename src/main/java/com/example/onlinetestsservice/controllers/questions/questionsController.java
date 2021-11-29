package com.example.onlinetestsservice.controllers.questions;

import com.example.onlinetestsservice.models.questions;
import com.example.onlinetestsservice.repository.questionsRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/questions")
public class questionsController {
    private final questionsRepository questionsRepository;

    public questionsController(questionsRepository questionsRepository){
        this.questionsRepository = questionsRepository;
    }

    @GetMapping("/all")
    public List<questions> readQuestions(){
        return questionsRepository.findAll();
    }

    @GetMapping("/findById/{id}")
    public Optional<questions> findQuestionsById(@PathVariable int id) {
        return questionsRepository.findById(id);
    }
}
