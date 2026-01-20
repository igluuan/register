package com.dev.register.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.register.model.Registration;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration, UUID> {
    String findByNumberOsForRegistration(String numberOsForRegistration);
}
