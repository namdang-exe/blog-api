package com.blog.author.dto;

public class AuthorRequest {
    private String username;
    private String email;
    private String bio;

    // Constructors
    public AuthorRequest() {
        // Empty constructor for Jackson deserialization
    }

    // Getters and Setters
    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getBio() {
        return bio;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
