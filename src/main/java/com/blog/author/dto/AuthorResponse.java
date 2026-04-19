package com.blog.author.dto;

import java.time.LocalDate;

public class AuthorResponse {
    private Long id;
    private String username;
    private String email;
    private String bio;
    private LocalDate createdAt;

    public AuthorResponse(Long id, String username, String email, String bio, LocalDate createdAt) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.bio = bio;
        this.createdAt = createdAt;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getBio() {
        return bio;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }
}
