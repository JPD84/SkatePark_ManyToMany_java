package com.codeClan.SkatePark.skatePark.Repositories;

import com.codeClan.SkatePark.skatePark.Models.Competition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompetitionRepository extends JpaRepository<Competition, Long> {
}
