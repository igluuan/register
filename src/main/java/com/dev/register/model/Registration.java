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
    private String clientName; // Sesab
    private String numberForEmployer; // ex.: 71906-0001
    private String nameEmployerForClient; // Maria
    private String numberOsForRegistration; // ex.: OS 123456
    private LocalDate dateOfRegistration; // ex.: 01/01/2024
    private String statusForRegistration; // ex.: OK, PEND, ENC
    private String reasonForRegistration; // Atolamento interno
    private String solutionForRegistration; // Limpeza realizada
}
