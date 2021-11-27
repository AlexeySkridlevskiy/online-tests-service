package com.example.onlinetestsservice.models;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "questions")
public class testQuestions {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "test_id")
    private Integer testId;

    @Column(name = "question")
    private String question;

    public testQuestions(){
    }

    public testQuestions(Integer testId, String question){
        this.testId = testId;
        this.question = question;
    }
}
