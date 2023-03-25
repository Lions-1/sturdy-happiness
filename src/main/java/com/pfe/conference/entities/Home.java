package com.pfe.conference.entities;

import jakarta.persistence.*;

@Entity
public class Home {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String conferenceTheme;
    private String venue;
    private String program;
    private String sponsors;
    @Lob
    @Column(columnDefinition = "TEXT")
    private String content;

    private String imageUrl;
    @OneToOne
    @JoinColumn(name = "admin_id")
    private Admin admin;

    // Default constructor (no-argument constructor)
    public Home() {
    }

    // Constructor with arguments

    public Home(Long id, String conferenceTheme, String venue, String program, String sponsors, String content, String imageUrl) {
        this.id = id;
        this.conferenceTheme = conferenceTheme;
        this.venue = venue;
        this.program = program;
        this.sponsors = sponsors;
        this.content = content;
        this.imageUrl = imageUrl;
    }


    // Getters, setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getConferenceTheme() {
        return conferenceTheme;
    }

    public void setConferenceTheme(String conferenceTheme) {
        this.conferenceTheme = conferenceTheme;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getSponsors() {
        return sponsors;
    }

    public void setSponsors(String sponsors) {
        this.sponsors = sponsors;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
}
