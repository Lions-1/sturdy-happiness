package com.pfe.conference.controllers;

import com.pfe.conference.entities.Attendee;
import com.pfe.conference.services.AttendeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/api/attendees")
public class AttendeeController {

    @Autowired
    private AttendeeService attendeeService;

    @GetMapping
    public List<Attendee> getAllAttendees() {
        return attendeeService.findAll();
    }

    @GetMapping("/{id}")
    public Attendee getAttendeeById(@PathVariable Long id) {
        return attendeeService.findById(id);
    }

    @PostMapping
    public Attendee createAttendee(@RequestBody Attendee attendee) {
        return attendeeService.save(attendee);
    }

    @PutMapping("/{id}")
    public Attendee updateAttendee(@PathVariable Long id, @RequestBody Attendee attendee) {
        return attendeeService.update(id, attendee);
    }

    @DeleteMapping("/{id}")
    public void deleteAttendee(@PathVariable Long id) {
        attendeeService.deleteById(id);
    }
}