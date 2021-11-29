package com.example.onlinetestsservice.models;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "online_test")
public class Tests {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "title")
    private String title;

    public Tests(){
    }

    public Tests(String title){
        this.title = title;
    }
}
