package com.codemelodies.codemelodies.repositories;

import com.codemelodies.codemelodies.models.Uzytkownik;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<Uzytkownik, UUID> {
    Optional<Uzytkownik> findByUsername(String username);
}