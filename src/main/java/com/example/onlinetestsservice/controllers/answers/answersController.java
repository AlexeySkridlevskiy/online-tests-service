package com.example.onlinetestsservice.controllers.answers;

import com.example.onlinetestsservice.models.Answers;
import com.example.onlinetestsservice.repository.AnswersRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/answers")
public class answersController {
    private final AnswersRepository answersRepository;

    public answersController(AnswersRepository answersRepository){
        this.answersRepository = answersRepository;
    }

    @GetMapping("/all")
    public List<Answers> readAnswers(){
        return answersRepository.findAll();
    }

    @GetMapping("/findById/{id}")
    public Optional<Answers> findAnswersById(@PathVariable int id) {
        return answersRepository.findById(id);
    }

    @PostMapping("/save")
    public String createAnswers(@RequestParam String first_answer, @RequestParam String second_answer,
                                @RequestParam String third_answer, @RequestParam String forth_answer,
                                @RequestParam Integer right_answer){
        Answers answer = new Answers(first_answer, second_answer, third_answer, forth_answer, right_answer);
        answersRepository.save(answer);
        return "Saved";
    }
}
