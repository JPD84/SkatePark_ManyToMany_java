package com.codeClan.SkatePark.skatePark.Controllers;


import com.codeClan.SkatePark.skatePark.Models.SkatePark;
import com.codeClan.SkatePark.skatePark.Repositories.SkateparkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/skatepark")
public class SkateParkController {

    @Autowired
    SkateparkRepository skateparkRepository;

    @GetMapping(value = "/")
    public List<SkatePark>getAllSkatePark(){return skateparkRepository.findAll();}


}
