package com.pfe.conference.entities;

import jakarta.persistence.*;

@Entity
public class ImportantDates {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String submissionDeadline;
    private String reviewDeadline;
    private String registrationDeadline;
    @Lob
    @Column(columnDefinition = "TEXT")
    private String content;
    @ManyToOne
    @JoinColumn(name = "admin_id")
    private Admin admin;

    // Default constructor (no-argument constructor)
    public ImportantDates() {
    }

    // Constructor with arguments
    public ImportantDates(String submissionDeadline, String reviewDeadline, String registrationDeadline,String content) {
        this.submissionDeadline = submissionDeadline;
        this.reviewDeadline = reviewDeadline;
        this.registrationDeadline = registrationDeadline;
        this.content=content;
    }

    // Getters, setters, and constructors

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubmissionDeadline() {
        return submissionDeadline;
    }

    public void setSubmissionDeadline(String submissionDeadline) {
        this.submissionDeadline = submissionDeadline;
    }

    public String getReviewDeadline() {
        return reviewDeadline;
    }

    public void setReviewDeadline(String reviewDeadline) {
        this.reviewDeadline = reviewDeadline;
    }

    public String getRegistrationDeadline() {
        return registrationDeadline;
    }

    public void setRegistrationDeadline(String registrationDeadline) {
        this.registrationDeadline = registrationDeadline;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
}