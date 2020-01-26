package com.data.dockertest.dockerpackage.controller;

import com.data.dockertest.dockerpackage.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class DockerController {
    @GetMapping("/docker/{id}")
    public String getMessage(@PathVariable String id) {
        return "Hello Docker"+id;
    }


    @PostMapping("/docker")
    public String PostMessage(@Valid User user) {
        System.out.println(user);
        return "ok";
    }
}
