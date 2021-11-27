package com.example.onlinetestsservice.controllers;

import com.example.onlinetestsservice.models.User;
import com.example.onlinetestsservice.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class SignController {

    private final UserRepository userRepository;

    public SignController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/save")
    public String create(@RequestParam String name, @RequestParam String email){
        User user = new User(name, email);
        userRepository.save(user);
        return "Saved";
    }

    @GetMapping("/all")
    public List<User> readUsers(){
        return userRepository.findAll();
    }

    @GetMapping("/findById/{id}")
    public Optional<User> findUserById(@PathVariable int id) {
        return userRepository.findById(id);
    }

    @GetMapping("/findByName/{name}")
    public Optional<User> findByName(@PathVariable String name){
        return userRepository.findByName(name);
    }

    @Transactional
    @GetMapping("/update")
    public String update(@RequestParam String name, @RequestParam String newName){
        Optional<User> userOptional = userRepository.findByName(name);
        if(userOptional.isPresent()){
            User user = userOptional.get();
            user.setName(newName);
            //when transaction close, repository save object automatically
            return "Updated";
        }
        return "Not updated!";
    }

    @DeleteMapping("/deleteById")
    public ResponseEntity deleteById(@RequestParam int id){
        userRepository.deleteById(id);
        return ResponseEntity.ok("deleted");
    }
}