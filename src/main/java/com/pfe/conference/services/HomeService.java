package com.pfe.conference.services;

import com.pfe.conference.entities.Home;
import com.pfe.conference.repositories.HomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HomeService {

    private final HomeRepository homeRepository;

    @Autowired
    public HomeService(HomeRepository homeRepository) {
        this.homeRepository = homeRepository;
    }

    public List<Home> findAll() {
        return homeRepository.findAll();
    }

    public Home findById(Long id) {
        Optional<Home> homeOptional = homeRepository.findById(id);
        return homeOptional.orElse(null);
    }

    public Home save(Home home) {
        return homeRepository.save(home);
    }

    public Home update(Long id, Home home) {
        if (homeRepository.existsById(id)) {
            home.setId(id);
            return homeRepository.save(home);
        }
        return null;
    }

    public void deleteById(Long id) {
        homeRepository.deleteById(id);
    }
}
