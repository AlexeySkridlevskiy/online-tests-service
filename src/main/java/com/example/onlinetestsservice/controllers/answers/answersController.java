package com.example.onlinetestsservice.controllers.answers;

import com.example.onlinetestsservice.models.answers;
import com.example.onlinetestsservice.repository.answersRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/answers")
public class answersController {
    private final answersRepository answersRepository;

    public answersController(answersRepository answersRepository){
        this.answersRepository = answersRepository;
    }

    @GetMapping("/all")
    public List<answers> readAnswers(){
        return answersRepository.findAll();
    }
}
