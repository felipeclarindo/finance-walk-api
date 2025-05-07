package com.example.finance_walk_api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.finance_walk_api.model.Category;
import com.example.finance_walk_api.auth.model.User;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    List<Category> findByUser(User user);

}
