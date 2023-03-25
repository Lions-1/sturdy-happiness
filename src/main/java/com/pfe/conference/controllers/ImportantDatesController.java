package com.pfe.conference.controllers;

import com.pfe.conference.entities.ImportantDates;
import com.pfe.conference.services.ImportantDatesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/important-dates")
public class ImportantDatesController {

    @Autowired
    private ImportantDatesService importantDatesService;

    @GetMapping
    public List<ImportantDates> getAllImportantDates() {
        return importantDatesService.findAll();
    }

    @GetMapping("/{id}")
    public ImportantDates getImportantDateById(@PathVariable Long id) {
        return importantDatesService.findById(id);
    }

    @PostMapping
    public ImportantDates createImportantDate(@RequestBody ImportantDates importantDate) {
        return importantDatesService.save(importantDate);
    }

    @PutMapping("/{id}")
    public ImportantDates updateImportantDate(@PathVariable Long id, @RequestBody ImportantDates importantDate) {
        return importantDatesService.update(id, importantDate);
    }

    @DeleteMapping("/{id}")
    public void deleteImportantDate(@PathVariable Long id) {
        importantDatesService.deleteById(id);
    }
}
