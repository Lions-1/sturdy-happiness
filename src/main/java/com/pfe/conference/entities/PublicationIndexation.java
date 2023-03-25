package com.pfe.conference.entities;

import jakarta.persistence.*;

@Entity
public class PublicationIndexation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String publication;
    private String index;

    @Lob
    @Column(columnDefinition = "TEXT")
    private String content;
    @ManyToOne
    @JoinColumn(name = "admin_id")
    private Admin admin;

    // Default constructor (no-argument constructor)
    public PublicationIndexation() {
    }

    // Constructor with arguments
    public PublicationIndexation(String publication, String index,String content) {
        this.publication = publication;
        this.index = index;
        this.content=content;
    }

    // Getters, setters, and constructors

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
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