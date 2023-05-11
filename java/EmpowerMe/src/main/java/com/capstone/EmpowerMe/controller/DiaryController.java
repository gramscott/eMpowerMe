package com.capstone.EmpowerMe.controller;

import com.capstone.EmpowerMe.models.Diary;
import com.capstone.EmpowerMe.repositories.DiaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class DiaryController {

    @Autowired
    DiaryRepository diaryRepository;

    @GetMapping(value = "/diaries")
    public ResponseEntity<List<Diary>> getAllDiaries(){
        return new ResponseEntity<>(diaryRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/diaries/{id}")
    public ResponseEntity getDiary(@PathVariable Long id){
        return new ResponseEntity<>(diaryRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/diaries")
    public ResponseEntity<Diary> postDiary(@RequestBody Diary diary){
        diaryRepository.save(diary);
        return new ResponseEntity<>(diary, HttpStatus.CREATED);
    }

    @PutMapping("/diaries/{id}")
    public ResponseEntity<?> saveDiary(@RequestBody Diary diary, @PathVariable("id") String id) {
        diaryRepository.save(diary);
        return new ResponseEntity<>(diary, HttpStatus.OK);
    }

    @PatchMapping(value = "/diaries/{id}")
    public ResponseEntity<Diary> updatePartialDiary(@RequestBody Diary diary){
        diaryRepository.save(diary);
        return new ResponseEntity<>(diary, HttpStatus.OK);
    }

    @DeleteMapping(value = "/diaries/{id}")
    public ResponseEntity<Diary> deleteDiary(@PathVariable Long id){
        Diary found = diaryRepository.getOne(id);
        diaryRepository.delete(found);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
}
