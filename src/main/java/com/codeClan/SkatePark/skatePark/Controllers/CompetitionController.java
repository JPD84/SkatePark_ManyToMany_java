package com.codeClan.SkatePark.skatePark.Controllers;

import com.codeClan.SkatePark.skatePark.Models.Competition;
import com.codeClan.SkatePark.skatePark.Repositories.CompetitionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/competitions")
public class CompetitionController {

    @Autowired
    CompetitionRepository competitionRepository;

    @GetMapping(value = "/")
    public List<Competition> getAllCompetitions(){
        return competitionRepository.findAll();
    }
}
