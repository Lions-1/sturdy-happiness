package com.pfe.conference.entities;

import jakarta.persistence.*;

@Entity
public class Registration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long registrationId;

    private String registrationStatus;
    private String registrationType;

    @OneToOne
    @JoinColumn(name = "attendee_id")
    private Attendee attendee;

    // Getters, setters, and constructors

    public Registration() {
    }

    public Registration(String registrationStatus, String registrationType, Attendee attendee) {
        this.registrationStatus = registrationStatus;
        this.registrationType = registrationType;
        this.attendee = attendee;
    }

    public Long getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(Long registrationId) {
        this.registrationId = registrationId;
    }

    public String getRegistrationStatus() {
        return registrationStatus;
    }

    public void setRegistrationStatus(String registrationStatus) {
        this.registrationStatus = registrationStatus;
    }

    public String getRegistrationType() {
        return registrationType;
    }

    public void setRegistrationType(String registrationType) {
        this.registrationType = registrationType;
    }

    public Attendee getAttendee() {
        return attendee;
    }

    public void setAttendee(Attendee attendee) {
        this.attendee = attendee;
    }
}