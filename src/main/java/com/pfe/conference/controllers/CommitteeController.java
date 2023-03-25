package com.pfe.conference.controllers;

import com.pfe.conference.entities.Committee;
import com.pfe.conference.services.CommitteeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/committees")
public class CommitteeController {

    @Autowired
    private CommitteeService committeeService;

    @GetMapping
    public List<Committee> getAllCommittees() {
        return committeeService.findAll();
    }

    @GetMapping("/{id}")
    public Committee getCommitteeById(@PathVariable Long id) {
        return committeeService.findById(id);
    }

    @PostMapping
    public Committee createCommittee(@RequestBody Committee committee) {
        return committeeService.save(committee);
    }

    @PutMapping("/{id}")
    public Committee updateCommittee(@PathVariable Long id, @RequestBody Committee committee) {
        return committeeService.update(id, committee);
    }

    @DeleteMapping("/{id}")
    public void deleteCommittee(@PathVariable Long id) {
        committeeService.deleteById(id);
    }
}
