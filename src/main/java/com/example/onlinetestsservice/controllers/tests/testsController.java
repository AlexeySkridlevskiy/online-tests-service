package com.example.onlinetestsservice.controllers.tests;

import com.example.onlinetestsservice.models.Tests;
import com.example.onlinetestsservice.repository.TestsRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tests")
public class testsController {
    private final TestsRepository testsRepository;

    public testsController(TestsRepository testsRepository){
        this.testsRepository = testsRepository;
    }

    @GetMapping("/all")
    public List<Tests> readTests(){
        return testsRepository.findAll();
    }

    @GetMapping("/findById/{id}")
    public Optional<Tests> findTestById(@PathVariable int id) {
        return testsRepository.findById(id);
    }

    @PostMapping("/save")
    public String createTest(@RequestParam String title){
        Tests test = new Tests(title);
        testsRepository.save(test);
        return "Saved test";
    }

    @GetMapping("/findByTitle/{title}")
    public Optional<Tests> findByTitle(@PathVariable String title){
        return testsRepository.findByTitle(title);
    }

    @DeleteMapping("/deleteById/{id}")
    public ResponseEntity deleteById(@PathVariable int id){
        testsRepository.deleteById(id);
        return ResponseEntity.ok("deleted");
    }
}
