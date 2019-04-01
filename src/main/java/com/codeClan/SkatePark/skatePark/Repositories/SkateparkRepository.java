package com.codeClan.SkatePark.skatePark.Repositories;

import com.codeClan.SkatePark.skatePark.Models.SkatePark;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkateparkRepository extends JpaRepository<SkatePark, Long> {
}
