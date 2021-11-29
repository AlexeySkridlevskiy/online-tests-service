package com.example.onlinetestsservice.controllers.questions;

import com.example.onlinetestsservice.models.Questions;
import com.example.onlinetestsservice.repository.QuestionsRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/questions")
public class questionsController {
    private final QuestionsRepository questionsRepository;

    public questionsController(QuestionsRepository questionsRepository){
        this.questionsRepository = questionsRepository;
    }

    @GetMapping("/all")
    public List<Questions> readQuestions(){
        return questionsRepository.findAll();
    }

    @GetMapping("/findById/{id}")
    public Optional<Questions> findQuestionsById(@PathVariable int id) {
        return questionsRepository.findById(id);
    }

    @PostMapping("/save")
    public String createQuestion(@RequestParam String question){
        Questions saveQuestion = new Questions(question);
        questionsRepository.save(saveQuestion);
        return "Saved question";
    }

    @DeleteMapping("/deleteById/{id}")
    public ResponseEntity deleteById(@PathVariable int id){
        questionsRepository.deleteById(id);
        return ResponseEntity.ok("deleted");
    }
}
