package com.data.dockertest.dockerpackage.controller;

import com.data.dockertest.dockerpackage.controller.entity.Team;
import com.data.dockertest.dockerpackage.controller.service.TeamService;
import com.data.dockertest.dockerpackage.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@RestController
public class DockerController {
    @Autowired
    TeamService teamService;
    @GetMapping("/docker/{id}")
    public String getMessage(@PathVariable String id) {
        return "Hello Docker"+id;
    }


    @PostMapping("/docker")
    public String PostMessage(@Valid User user) {
        System.out.println(user);

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println(123);
            }
        });

        return "ok";
    }
    @GetMapping(value = "/getTeam")
    public List<Team> getTeam(){
        System.out.println(123);
        return teamService.getTeam();
    }
}
