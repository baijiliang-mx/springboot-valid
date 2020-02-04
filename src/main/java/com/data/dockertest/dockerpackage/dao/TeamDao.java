package com.data.dockertest.dockerpackage.dao;

import com.data.dockertest.dockerpackage.controller.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamDao extends JpaRepository<Team,Integer> {
}
