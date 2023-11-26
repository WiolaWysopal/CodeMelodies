package com.codemelodies.codemelodies.repositories;

import com.codemelodies.codemelodies.models.Obraz;
import com.codemelodies.codemelodies.models.Wydarzenie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ObrazRepository extends JpaRepository<Obraz, UUID> {

}
