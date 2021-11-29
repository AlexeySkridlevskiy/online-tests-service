package com.example.onlinetestsservice.models;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "questions")
public class questions {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "test_id")
    private Integer testId;

    @Column(name = "question")
    private String question;

    public questions(){
    }

    public questions(Integer testId, String question){
        this.testId = testId;
        this.question = question;
    }
}
