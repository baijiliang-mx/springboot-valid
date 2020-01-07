package com.data.dockertest.dockerpackage.controller;

import com.data.dockertest.dockerpackage.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class DockerController {
    @Autowired
    private RedisTemplate redisTemplate;
    @RequestMapping("/docker")
    public String getMessage() {
        return "Hello Docker";
    }


    @PostMapping("/docker")
    public String PostMessage(@Valid User user) {
        System.out.println(user);
        return "ok";
    }
}