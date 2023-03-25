package com.pfe.conference.controllers;

import com.pfe.conference.entities.Home;
import com.pfe.conference.services.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/home")
public class HomeController {

    @Autowired
    private HomeService homeService;

    @GetMapping
    public List<Home> getAllHomes() {
        return homeService.findAll();
    }

    @GetMapping("/{id}")
    public Home getHomeById(@PathVariable Long id) {
        return homeService.findById(id);
    }

    @PostMapping
    public Home createHome(@RequestBody Home home) {
        return homeService.save(home);
    }

    @PutMapping("/{id}")
    public Home updateHome(@PathVariable Long id, @RequestBody Home home) {
        return homeService.update(id, home);
    }

    @DeleteMapping("/{id}")
    public void deleteHome(@PathVariable Long id) {
        homeService.deleteById(id);
    }
}