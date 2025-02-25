package com.example.finance_walk_api.controller;

import com.example.finance_walk_api.model.Category;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {

    @GetMapping("/categories")
    public List<Category> listAll(){
        return List.of(
                new Category(1L, "Education", "book"),
                new Category(1L, "Education", "book"),
                new Category(1L, "Education", "book")

        );
    }
}