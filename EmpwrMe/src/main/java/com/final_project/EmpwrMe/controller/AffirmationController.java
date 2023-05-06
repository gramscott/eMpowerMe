package com.final_project.EmpwrMe.controller;

import com.final_project.EmpwrMe.models.Affirmation;
import com.final_project.EmpwrMe.repositories.AffirmationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AffirmationController {


    @Autowired
    AffirmationRepository affirmationRepository;


    @GetMapping(value = "/affirmations")
    public ResponseEntity<List<Affirmation>> getAllAffirmations(){
        return new ResponseEntity<>(affirmationRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/affirmations/{id}")
    public ResponseEntity getAffirmation(@PathVariable Long id){
        return new ResponseEntity<>(affirmationRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/affirmations")
    public ResponseEntity<Affirmation> postAffirmation(@RequestBody Affirmation affirmation){
        affirmationRepository.save(affirmation);
        return new ResponseEntity<>(affirmation, HttpStatus.CREATED);
    }

    @PutMapping("/affirmations/{id}")
    public ResponseEntity<?> saveAffirmation(@RequestBody Affirmation affirmation, @PathVariable("id") String id) {
        affirmationRepository.save(affirmation);
        return new ResponseEntity<>(affirmation, HttpStatus.OK);
    }

    @PatchMapping(value = "/affirmations/{id}")
    public ResponseEntity<Affirmation> updatePartialAffirmation(@RequestBody Affirmation affirmation){
        affirmationRepository.save(affirmation);
        return new ResponseEntity<>(affirmation, HttpStatus.OK);
    }

    @DeleteMapping(value = "/affirmations/{id}")
    public ResponseEntity<Affirmation> deleteAffirmation(@PathVariable Long id) {
        Affirmation found = affirmationRepository.getOne(id);
        affirmationRepository.delete(found);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }


}
