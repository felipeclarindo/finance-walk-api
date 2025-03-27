package com.example.finance_walk_api.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {
    @GetMapping
    public ResponseEntity<Object> index() {
        Map<String, String> response = new HashMap<>();
        
        response.put("description", "API Rest to make the control of the costs in the project finance walk integrated with oracle database.");
        response.put("status", "Api is Running");
        response.put("github-author", "https://github.com/felipeclarindo");
        response.put("github-repository", "https://github.com/felipeclarindo/finance-walk-api");
        return ResponseEntity.status(200).body(response);
    }
}
