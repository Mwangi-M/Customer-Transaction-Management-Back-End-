package com.example.project.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {

    @GetMapping("/public")
    public ResponseEntity<String> publicEndpoint() {
        // Endpoint logic
        String response = "This is a public endpoint";
        return ResponseEntity.ok(response);
    }

    @PostMapping("/protected")
    @PreAuthorize("hasRole('ROLE_USER')")
    public ResponseEntity<String> protectedEndpoint() {
        // Endpoint logic
        String response = "This is a protected endpoint";
        return ResponseEntity.ok(response);
    }

}
