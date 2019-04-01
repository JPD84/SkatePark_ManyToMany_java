package com.codeClan.SkatePark.skatePark.Repositories;


import com.codeClan.SkatePark.skatePark.Models.Skater;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkaterRepository extends JpaRepository<Skater, Long> {
}
