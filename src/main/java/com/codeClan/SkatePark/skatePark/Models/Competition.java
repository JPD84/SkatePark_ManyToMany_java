package com.codeClan.SkatePark.skatePark.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "competitions")

public class Competition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private String type;



    @JsonIgnore
    @ManyToMany
    @JoinTable(
            name = "Skater_competition",
            joinColumns = {@JoinColumn(
                    name = "competition_id",
                    nullable = false,
                    updatable = false)
            },

            inverseJoinColumns = {@JoinColumn(
                    name = "skater_id",
                    nullable = false,
                    updatable = false)
            }

    )
    private List<Skater> skaters;

    public Competition( String name, String type) {
        this.name = name;
        this.type = type;
        this.skaters = new ArrayList<Skater>();
    }

    public Competition() {
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

    public void addSkater(Skater skater){
        this.skaters.add(skater);
    }
}
