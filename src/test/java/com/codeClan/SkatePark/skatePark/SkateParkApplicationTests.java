package com.codeClan.SkatePark.skatePark;

import com.codeClan.SkatePark.skatePark.Models.Competition;
import com.codeClan.SkatePark.skatePark.Models.SkatePark;
import com.codeClan.SkatePark.skatePark.Models.Skater;
import com.codeClan.SkatePark.skatePark.Repositories.CompetitionRepository;
import com.codeClan.SkatePark.skatePark.Repositories.SkateparkRepository;
import com.codeClan.SkatePark.skatePark.Repositories.SkaterRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SkateParkApplicationTests {

	@Autowired
	SkaterRepository skaterRepository;

	@Autowired
	SkateparkRepository skateparkRepository;

	@Autowired
	CompetitionRepository competitionRepository;


	@Test
	public void contextLoads() {


	}

	@Test
	public void canSetupSkaterCompetitionPark(){
		SkatePark skatePark = new SkatePark("Birdhouse SkatePark", "Professional Skatepark");
		skateparkRepository.save(skatePark);
		Skater skater = new Skater("Tony", "Hawk", 35, "Professional Vert Skater", skatePark);
		skaterRepository.save(skater);
		Competition competition = new Competition("Volcom Professional Vert Comp", "Professional Vert");
		competitionRepository.save(competition);
		skater.addCompetition(competition);
		skaterRepository.save(skater);
	}

}
