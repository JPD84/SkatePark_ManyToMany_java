package com.codeClan.SkatePark.skatePark.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "skateParks")
public class SkatePark {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private String type;

    @JsonIgnoreProperties("skatePark")
    @OneToMany(mappedBy = "skatePark")
    private List<Skater> skaters;

    public SkatePark(String name, String type) {
        this.name = name;
        this.type = type;
        this.skaters = new ArrayList<Skater>();
    }

    public SkatePark() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Skater> getSkaters() {
        return skaters;
    }

    public void setSkaters(List<Skater> skaters) {
        this.skaters = skaters;
    }
}
