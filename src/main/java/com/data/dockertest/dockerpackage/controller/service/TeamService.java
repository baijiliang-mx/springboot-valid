package com.data.dockertest.dockerpackage.controller.service;

import com.data.dockertest.dockerpackage.controller.entity.Team;
import com.data.dockertest.dockerpackage.dao.TeamDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {
    @Autowired
    TeamDao teamDao;
    public List<Team> getTeam() {
        List<Team> all = teamDao.findAll();
        return all;
    }
}
