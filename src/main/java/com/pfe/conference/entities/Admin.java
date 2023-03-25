package com.pfe.conference.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.*;
import java.util.List;
@Entity
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String login;
    private String password;

    @Column(unique = true)
    private String email;

    @OneToMany(mappedBy = "admin")
    private List<Attendee> attendees;

    @OneToOne(mappedBy = "admin", cascade = CascadeType.ALL)
    private Home home;

    @OneToMany(mappedBy = "admin")
    private List<Committee> committees;

    @OneToMany(mappedBy = "admin")
    private List<Submission> submissions;

    @OneToMany(mappedBy = "admin")
    private List<ImportantDates> importantDates;

    @OneToMany(mappedBy = "admin")
    private List<PublicationIndexation> publicationIndexations;


    // Getters, setters, and constructors

    public Admin() {
    }

    public Admin(Long id, String login, String password, String email) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Attendee> getAttendees() {
        return attendees;
    }

    public void setAttendees(List<Attendee> attendees) {
        this.attendees = attendees;
    }

    public Home getHome() {
        return home;
    }

    public void setHome(Home home) {
        this.home = home;
    }

    public List<Committee> getCommittees() {
        return committees;
    }

    public void setCommittees(List<Committee> committees) {
        this.committees = committees;
    }

    public List<Submission> getSubmissions() {
        return submissions;
    }

    public void setSubmissions(List<Submission> submissions) {
        this.submissions = submissions;
    }

    public List<ImportantDates> getImportantDates() {
        return importantDates;
    }

    public void setImportantDates(List<ImportantDates> importantDates) {
        this.importantDates = importantDates;
    }

    public List<PublicationIndexation> getPublicationIndexations() {
        return publicationIndexations;
    }

    public void setPublicationIndexations(List<PublicationIndexation> publicationIndexations) {
        this.publicationIndexations = publicationIndexations;
    }
}