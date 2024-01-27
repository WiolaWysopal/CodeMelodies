package com.codemelodies.codemelodies.repositories;

import com.codemelodies.codemelodies.models.PublicationFile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PublicationFileRepository extends JpaRepository<PublicationFile, UUID> {
}
