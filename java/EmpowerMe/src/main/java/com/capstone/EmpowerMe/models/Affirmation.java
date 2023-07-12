package com.capstone.EmpowerMe.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "affirmations")
public class Affirmation implements Serializable {


    @Column(name = "sentence", columnDefinition = "text")
    private String sentence;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnoreProperties({"affirmations"})
    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    @JsonIgnoreProperties({"affirmations"})
    @ManyToMany
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable (
            name = "affirmations_diaries",
            joinColumns = {@JoinColumn(name = "affirmation_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "diary_id", nullable = false, updatable = false)}
    )

    private List<Diary> diaries;

    public Affirmation(String sentence, Category category){
        this.sentence = sentence;
        this.category = category;
        this.diaries = new ArrayList<>();
    }

    public Affirmation(){

    }

    public List<Diary> getDiaries() {
        return diaries;
    }

    public void setDiaries(List<Diary> diaries) {
        this.diaries = diaries;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public Long getId (){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public void addDiary(Diary diary){
        this.diaries.add(diary);
    }

    public void affirmationDeleteDiary(Diary diary){
        this.diaries.remove(diary);
    }

}
