package com.dev.register.model;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_registrations")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Registration {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String clientName;
    private String numberForEmployer;
    private String nameEmployerForClient;
    private LocalDate dateOfRegistration;
    private String statusForRegistration;
    private String reasonForRegistration;
    private String solutionForRegistration;
}
