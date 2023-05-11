package com.capstone.EmpowerMe.controller;

import com.capstone.EmpowerMe.models.Category;
import com.capstone.EmpowerMe.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    CategoryRepository categoryRepository;

    @GetMapping(value = "/categories")
    public ResponseEntity<List<Category>> getAllCategories(){
        return new ResponseEntity<>(categoryRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/categories/{id}")
    public ResponseEntity getCategory(@PathVariable Long id){
        return new ResponseEntity<>(categoryRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/categories")
    public ResponseEntity<Category> postCategory(@RequestBody Category category){
        categoryRepository.save(category);
        return new ResponseEntity<>(category, HttpStatus.CREATED);
    }

    @PutMapping("/categories/{id}")
    public ResponseEntity<?> saveCategory(@RequestBody Category category, @PathVariable("id") String id) {
        categoryRepository.save(category);
        return new ResponseEntity<>(category, HttpStatus.OK);
    }

    @PatchMapping(value = "/categories/{id}")
    public ResponseEntity<Category> updatePartialCategory(@RequestBody Category category){
        categoryRepository.save(category);
        return new ResponseEntity<>(category, HttpStatus.OK);
    }

    @DeleteMapping(value = "/categories/{id}")
    public ResponseEntity<Category> deleteCategory(@PathVariable Long id) {
        Category found = categoryRepository.getOne(id);
        categoryRepository.delete(found);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
}
