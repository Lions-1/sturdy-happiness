package com.pfe.conference.services;

import com.pfe.conference.entities.Registration;
import com.pfe.conference.repositories.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegistrationService {

    private final RegistrationRepository registrationRepository;

    @Autowired
    public RegistrationService(RegistrationRepository registrationRepository) {
        this.registrationRepository = registrationRepository;
    }

    public List<Registration> findAll() {
        return registrationRepository.findAll();
    }

    public Registration findById(Long id) {
        Optional<Registration> registrationOptional = registrationRepository.findById(id);
        return registrationOptional.orElse(null);
    }

    public Registration save(Registration registration) {
        return registrationRepository.save(registration);
    }

    public Registration update(Long id, Registration registration) {
        if (registrationRepository.existsById(id)) {
            // Skip the setId line if it's not present in the Registration class
            return registrationRepository.save(registration);
        }
        return null;
    }

    public void deleteById(Long id) {
        registrationRepository.deleteById(id);
    }
}
