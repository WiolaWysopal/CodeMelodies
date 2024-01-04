package com.codemelodies.codemelodies.repositories;

import com.codemelodies.codemelodies.models.MediaProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MediaProfileRepository extends JpaRepository<MediaProfile, String> {
}
