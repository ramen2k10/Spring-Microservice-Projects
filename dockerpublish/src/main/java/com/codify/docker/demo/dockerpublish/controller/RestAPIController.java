package com.codify.docker.demo.dockerpublish.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAPIController {
    
    @GetMapping("/app/info")
    public String getApi(){
        return "Application successfully published to Docker Hub.";
    }
}
