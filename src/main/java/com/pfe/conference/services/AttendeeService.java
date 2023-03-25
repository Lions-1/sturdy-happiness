package com.pfe.conference.services;

import com.pfe.conference.entities.Attendee;
import com.pfe.conference.repositories.AttendeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AttendeeService {

    private final AttendeeRepository attendeeRepository;

    @Autowired
    public AttendeeService(AttendeeRepository attendeeRepository) {
        this.attendeeRepository = attendeeRepository;
    }

    public List<Attendee> findAll() {
        return attendeeRepository.findAll();
    }

    public Attendee findById(Long id) {
        Optional<Attendee> attendeeOptional = attendeeRepository.findById(id);
        return attendeeOptional.orElse(null);
    }

    public Attendee save(Attendee attendee) {
        return attendeeRepository.save(attendee);
    }

    public Attendee update(Long id, Attendee attendee) {
        if (attendeeRepository.existsById(id)) {
            attendee.setId(id);
            return attendeeRepository.save(attendee);
        }
        return null;
    }

    public void deleteById(Long id) {
        attendeeRepository.deleteById(id);
    }
}
