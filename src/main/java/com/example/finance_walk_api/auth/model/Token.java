package com.example.finance_walk_api.auth.model;

public record Token(
    String token, 
    String type,
    String email
) {}
