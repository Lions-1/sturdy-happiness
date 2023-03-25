package com.pfe.conference.entities;

import jakarta.persistence.*;
@Entity
public class Attendee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String familyName;
    @Column(unique = true)
    private String email;
    private String affiliation;
    private String number;
    private String registerDate;


    @ManyToOne
    @JoinColumn(name = "admin_id")
    private Admin admin;

    @OneToOne(mappedBy = "attendee", cascade = CascadeType.ALL)
    private Registration register;

    // Getters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public String getEmail() {
        return email;
    }

    public String getAffiliation() {
        return affiliation;
    }

    public String getNumber() {
        return number;
    }

    public String getRegisterDate() {
        return registerDate;
    }

    public Admin getAdmin() {
        return admin;
    }

    public Registration getRegistration() {
        return register;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public void setRegister(Registration register) {
        this.register = register;
    }

    // Constructors
    public Attendee() {
    }

    public Attendee(String name, String familyName, String email, String affiliation, String number, String registerDate) {
        this.name = name;
        this.familyName = familyName;
        this.email = email;
        this.affiliation = affiliation;
        this.number = number;
        this.registerDate = registerDate;
    }
}
