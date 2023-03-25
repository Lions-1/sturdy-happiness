package com.pfe.conference.services;

import com.pfe.conference.entities.Committee;
import com.pfe.conference.repositories.CommitteeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommitteeService {

    private final CommitteeRepository committeeRepository;

    @Autowired
    public CommitteeService(CommitteeRepository committeeRepository) {
        this.committeeRepository = committeeRepository;
    }

    public List<Committee> findAll() {
        return committeeRepository.findAll();
    }

    public Committee findById(Long id) {
        Optional<Committee> committeeOptional = committeeRepository.findById(id);
        return committeeOptional.orElse(null);
    }

    public Committee save(Committee committee) {
        return committeeRepository.save(committee);
    }

    public Committee update(Long id, Committee committee) {
        if (committeeRepository.existsById(id)) {
            committee.setId(id);
            return committeeRepository.save(committee);
        }
        return null;
    }

    public void deleteById(Long id) {
        committeeRepository.deleteById(id);
    }
}
