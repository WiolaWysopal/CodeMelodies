package com.codemelodies.codemelodies.repositories;

import com.codemelodies.codemelodies.models.Biogram;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.sql.Timestamp;
import java.util.Optional;

public interface BiogramRepository extends JpaRepository<Biogram, Timestamp> {

    @Query(value = "SELECT * FROM Biograms b ORDER BY b.biogram_timestamp_id desc limit 1", nativeQuery = true)
    Optional<Biogram> findLatestBiogram();
}
