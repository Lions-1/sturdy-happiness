package com.pfe.conference.entities;

import jakarta.persistence.*;

@Entity
public class Submission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String abstractText;
    private String keywords;
    private String submissionState;
    private String submissionType;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

    @ManyToOne
    @JoinColumn(name = "admin_id")
    private Admin admin;

    // Getters, setters, and constructors

    public Submission() {
    }

    public Submission(String title, String abstractText, String keywords, String submissionState, String submissionType) {
        this.title = title;
        this.abstractText = abstractText;
        this.keywords = keywords;
        this.submissionState = submissionState;
        this.submissionType = submissionType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAbstractText() {
        return abstractText;
    }

    public void setAbstractText(String abstractText) {
        this.abstractText = abstractText;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getSubmissionState() {
        return submissionState;
    }

    public void setSubmissionState(String submissionState) {
        this.submissionState = submissionState;
    }

    public String getSubmissionType() {
        return submissionType;
    }

    public void setSubmissionType(String submissionType) {
        this.submissionType = submissionType;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
}
