package com.pfe.conference.services;

import com.pfe.conference.entities.ImportantDates;
import com.pfe.conference.repositories.ImportantDatesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImportantDatesService {

    private final ImportantDatesRepository importantDatesRepository;

    @Autowired
    public ImportantDatesService(ImportantDatesRepository importantDatesRepository) {
        this.importantDatesRepository = importantDatesRepository;
    }

    public List<ImportantDates> findAll() {
        return importantDatesRepository.findAll();
    }

    public ImportantDates findById(Long id) {
        Optional<ImportantDates> importantDatesOptional = importantDatesRepository.findById(id);
        return importantDatesOptional.orElse(null);
    }

    public ImportantDates save(ImportantDates importantDate) {
        return importantDatesRepository.save(importantDate);
    }

    public ImportantDates update(Long id, ImportantDates importantDate) {
        if (importantDatesRepository.existsById(id)) {
            importantDate.setId(id);
            return importantDatesRepository.save(importantDate);
        }
        return null;
    }

    public void deleteById(Long id) {
        importantDatesRepository.deleteById(id);
    }
}
