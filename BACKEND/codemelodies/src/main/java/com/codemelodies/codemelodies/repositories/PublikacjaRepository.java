package com.codemelodies.codemelodies.repositories;

import com.codemelodies.codemelodies.models.Publikacja;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PublikacjaRepository extends JpaRepository<Publikacja, UUID> {
}