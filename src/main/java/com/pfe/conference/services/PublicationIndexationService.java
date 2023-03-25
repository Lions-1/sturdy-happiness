package com.pfe.conference.services;

import com.pfe.conference.entities.PublicationIndexation;
import com.pfe.conference.repositories.PublicationIndexationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PublicationIndexationService {

    private final PublicationIndexationRepository publicationIndexationRepository;

    @Autowired
    public PublicationIndexationService(PublicationIndexationRepository publicationIndexationRepository) {
        this.publicationIndexationRepository = publicationIndexationRepository;
    }

    public List<PublicationIndexation> findAll() {
        return publicationIndexationRepository.findAll();
    }

    public PublicationIndexation findById(Long id) {
        Optional<PublicationIndexation> publicationIndexationOptional = publicationIndexationRepository.findById(id);
        return publicationIndexationOptional.orElse(null);
    }

    public PublicationIndexation save(PublicationIndexation publicationIndexation) {
        return publicationIndexationRepository.save(publicationIndexation);
    }

    public PublicationIndexation update(Long id, PublicationIndexation publicationIndexation) {
        if (publicationIndexationRepository.existsById(id)) {
            publicationIndexation.setId(id);
            return publicationIndexationRepository.save(publicationIndexation);
        }
        return null;
    }

    public void deleteById(Long id) {
        publicationIndexationRepository.deleteById(id);
    }
}
