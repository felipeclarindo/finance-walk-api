package com.example.finance_walk_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.finance_walk_api.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    
}
