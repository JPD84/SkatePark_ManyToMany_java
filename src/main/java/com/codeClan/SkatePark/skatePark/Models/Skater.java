package com.codeClan.SkatePark.skatePark.Models;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "skaters")
public class Skater {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;


    @Column(name = "age")
    private int age;


    @Column(name = "level")
    private String level;


    @ManyToMany
    @JoinTable(
            name = "Skater_competition",
            joinColumns = {@JoinColumn(
                    name = "skater_id",
                    nullable = false,
                    updatable = false)
            },

            inverseJoinColumns = {@JoinColumn(
                    name = "competition_id",
                    nullable = false,
                    updatable = false)
            }
    )

    private List<Competition> competitions;

    public Skater(String firstName, String lastName, int age, String level) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.level = level;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
