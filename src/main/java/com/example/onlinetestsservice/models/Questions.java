package com.example.onlinetestsservice.models;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "questions")
public class Questions {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "test_id")
    private Integer testId;

    @Column(name = "question")
    private String question;

    public Questions(){
    }

    public Questions(String question){
        this.question = question;
    }
}
