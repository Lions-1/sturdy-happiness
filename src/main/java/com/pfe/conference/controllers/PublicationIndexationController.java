package com.pfe.conference.controllers;


import com.pfe.conference.entities.PublicationIndexation;
import com.pfe.conference.services.PublicationIndexationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/publication-indexations")
public class PublicationIndexationController {

    @Autowired
    private PublicationIndexationService publicationIndexationService;

    @GetMapping
    public List<PublicationIndexation> getAllPublicationIndexations() {
        return publicationIndexationService.findAll();
    }

    @GetMapping("/{id}")
    public PublicationIndexation getPublicationIndexationById(@PathVariable Long id) {
        return publicationIndexationService.findById(id);
    }

    @PostMapping
    public PublicationIndexation createPublicationIndexation(@RequestBody PublicationIndexation publicationIndexation) {
        return publicationIndexationService.save(publicationIndexation);
    }

    @PutMapping("/{id}")
    public PublicationIndexation updatePublicationIndexation(@PathVariable Long id, @RequestBody PublicationIndexation publicationIndexation) {
        return publicationIndexationService.update(id, publicationIndexation);
    }

    @DeleteMapping("/{id}")
    public void deletePublicationIndexation(@PathVariable Long id) {
        publicationIndexationService.deleteById(id);
    }
}