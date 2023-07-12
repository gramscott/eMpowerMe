package com.capstone.EmpowerMe.models;


import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @JsonBackReference
    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
    private List<Affirmation> affirmations;

    public Category(String title) {
        this.title = title;
        this.affirmations = new ArrayList<>();
    }

    public Category(){

    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Affirmation> getAffirmations() {
        return affirmations;
    }

    public void setAffirmations(List<Affirmation> affirmations) {
        this.affirmations = affirmations;
    }

    public void addAffirmation(Affirmation affirmation){
        this.affirmations.add(affirmation);
    }

    public void categoryRemoveAffirmation(Affirmation affirmation){
        this.affirmations.remove(affirmation);
    }


}
