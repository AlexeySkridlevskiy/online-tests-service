package com.example.onlinetestsservice.models;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "online_test")
public class onlineTest {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "title")
    private String title;

    public onlineTest(){
    }

    public onlineTest(String title){
        this.title = title;
    }
}
