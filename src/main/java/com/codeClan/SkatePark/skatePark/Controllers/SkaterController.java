package com.codeClan.SkatePark.skatePark.Controllers;


import com.codeClan.SkatePark.skatePark.Models.Skater;
import com.codeClan.SkatePark.skatePark.Repositories.SkaterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/skaters")
public class SkaterController {

    @Autowired
    SkaterRepository skaterRepository;

    @GetMapping(value = "/")
    public List<Skater>getAllSkaters(){
        return skaterRepository.findAll();
    }

    @GetMapping("{id}")
    public Optional<Skater>getSkater(@PathVariable Long id){return skaterRepository.findById(id);}


}
