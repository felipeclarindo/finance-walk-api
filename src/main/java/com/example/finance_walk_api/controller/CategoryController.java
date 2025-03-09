package com.example.finance_walk_api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.finance_walk_api.model.Category;

@RestController
public class CategoryController {

    private List<Category> repository = new ArrayList<>();

    @GetMapping("/categories")
    public List<Category> getAll() {
        return repository;
    }

    @PostMapping("/categories")
    public ResponseEntity<Category> create(@RequestBody Category category) {
        repository.add(category);
        System.out.println("Adding Category: " + category.getName());
        return ResponseEntity.status(201).body(category);
    }

    @GetMapping("/categories/{id}")
    public ResponseEntity<Category> getById(@PathVariable Long id) {
        System.out.println("Getting category that id is: " + id);
        var category = repository.stream()
            .filter(c -> c.getId().equals(id))
            .findFirst();

        if (category.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(category.get());
    }
}