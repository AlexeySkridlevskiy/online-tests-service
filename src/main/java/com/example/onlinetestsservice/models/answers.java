package com.example.onlinetestsservice.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "answers")
public class answers {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "question_id")
    private Integer question_id;

    @Column(name = "first_answer")
    private String first_answer;

    @Column(name = "second_answer")
    private String second_answer;

    @Column(name = "third_answer")
    private String third_answer;

    @Column(name = "forth_answer")
    private String forth_answer;

    @Column(name = "rightAnswer")
    private Integer right_answer;

    public answers(){
    }

    public answers(Integer question_id, String first_answer, String second_answer,
                   String third_answer, String forth_answer, Integer right_answer){
        this.question_id = question_id;
        this.first_answer = first_answer;
        this.second_answer = second_answer;
        this.third_answer = third_answer;
        this.forth_answer = forth_answer;
        this.right_answer = right_answer;
    }
}
