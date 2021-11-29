package com.example.onlinetestsservice.controllers.tests;

import com.example.onlinetestsservice.models.tests;
import com.example.onlinetestsservice.repository.testsRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tests")
public class testsController {
    private final testsRepository testsRepository;

    public testsController(testsRepository testsRepository){
        this.testsRepository = testsRepository;
    }

    @GetMapping("/all")
    public List<tests> readTests(){
        return testsRepository.findAll();
    }

    @GetMapping("/findById/{id}")
    public Optional<tests> findTestById(@PathVariable int id) {
        return testsRepository.findById(id);
    }
}
