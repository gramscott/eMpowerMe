package com.capstone.EmpowerMe.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "diaries")
public class Diary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "post", columnDefinition = "text")
    private String post;

    @JsonBackReference
    @ManyToMany
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            name = "affirmations_diaries",
            joinColumns = {@JoinColumn(name = "diary_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "affirmation_id", nullable = false, updatable = false)}
    )

    private List<Affirmation> affirmations;

    public Diary(String post){
        this.post = post;
        this.affirmations = new ArrayList<Affirmation>();
    }

    public Diary(){

    }

    public List<Affirmation> getAffirmations() {
        return affirmations;
    }

    public void setAffirmations(List<Affirmation> affirmations) {
        this.affirmations = affirmations;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public void addAffirmation(Affirmation affirmation){
        this.affirmations.add(affirmation);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
