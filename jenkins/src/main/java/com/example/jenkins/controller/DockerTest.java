package com.example.jenkins.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerTest {

    @GetMapping("/")
    public String hello(){
        return "hello 씨발 !";
    }

}
