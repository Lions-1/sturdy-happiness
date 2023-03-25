package com.pfe.conference.entities;

import jakarta.persistence.*;

@Entity
public class Committee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String familyName;
    private String img;
    private String type;
    private String function;
    @Lob
    @Column(columnDefinition = "TEXT")
    private String content;


    @ManyToOne
    @JoinColumn(name = "admin_id")
    private Admin admin;

    // Getters, setters, and constructors

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

    public String getImg() {
        return img;
    }

    public String getType() {
        return type;
    }

    public String getFunction() {
        return function;
    }

    public Admin getAdmin() {
        return admin;
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

    public void setImg(String img) {
        this.img = img;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    // Constructors
    public Committee() {
    }

    public Committee(String name, String familyName, String img, String type, String function,String content) {
        this.name = name;
        this.familyName = familyName;
        this.img = img;
        this.type = type;
        this.function = function;
        this.content=content;
    }

}
