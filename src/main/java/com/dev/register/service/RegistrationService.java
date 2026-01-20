package com.dev.register.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.dev.register.model.Registration;
import com.dev.register.repository.RegistrationRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RegistrationService {
    private final RegistrationRepository registrationRepository;
    // Log para monitoramento
    private static final Logger log = LoggerFactory.getLogger(RegistrationService.class);

    // Método para salvar um registro, verificando se já existe uma OS igual
    public Registration saveRegistration(Registration registration) {
        log.info("Salvando o registro para a OS: {}", registration.getNumberOsForRegistration());
        if (registrationRepository.findByNumberOsForRegistration(registration.getNumberOsForRegistration()) != null) {
            log.warn("Registro para a OS {} já existe", registration.getNumberOsForRegistration());
            throw new RuntimeException("Registration already exists");
        }
        log.info("Registro salvo com sucesso para a OS: {}", registration.getNumberOsForRegistration());
        return registrationRepository.save(registration);
    }

    // Método para buscar todos os registros
    public List<Registration> getAllRegistrations() {
        log.info("Buscando todos os registros");
        return registrationRepository.findAll();
    }
}
