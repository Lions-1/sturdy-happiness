package com.pfe.conference.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Author extends Attendee {

    private String titleOfPaper;
    private String abstractText;
    private String keywords;

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    private List<Submission> submissions;

    // Getters, setters, and constructors

    public Author() {
        super();
    }

    public Author(String name, String familyName, String email, String affiliation, String number, String registerDate) {
        super(name, familyName, email, affiliation, number, registerDate);
    }

    public Author(String name, String familyName, String email, String affiliation, String number, String registerDate, List<Submission> submissions) {
        super(name, familyName, email, affiliation, number, registerDate);

        this.submissions=submissions;
    }


    public List<Submission> getSubmissions() {
        return submissions;
    }



    public void setSubmissions(List<Submission> submissions) {
        this.submissions = submissions;
    }
}