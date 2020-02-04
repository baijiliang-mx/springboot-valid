package com.data.dockertest.dockerpackage.controller.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_group")
public class Team {
    @Id
    private Integer gid;
    private String gname;

    public Team(Integer gid, String gname) {
        this.gid = gid;
        this.gname = gname;
    }

    public Team() {
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }
}
