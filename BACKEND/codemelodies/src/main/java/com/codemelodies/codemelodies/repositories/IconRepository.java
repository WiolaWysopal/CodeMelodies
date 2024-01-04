package com.codemelodies.codemelodies.repositories;

import com.codemelodies.codemelodies.models.Icon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IconRepository extends JpaRepository<Icon, UUID> {
}
