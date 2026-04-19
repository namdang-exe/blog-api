package com.blog.author.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.author.dto.AuthorRequest;
import com.blog.author.dto.AuthorResponse;
import com.blog.author.service.AuthorService;

@RestController
@RequestMapping("/api/authors")
public class AuthorController {
    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @PostMapping
    public AuthorResponse createAuthor(@RequestBody AuthorRequest author) {
        return this.authorService.createAuthor(author);
    }

    @GetMapping("/{id}")
    public AuthorResponse getAuthorById(@PathVariable Long id) {
        return this.authorService.getAuthorById(id);
    }

    @GetMapping("/username/{username}")
    public AuthorResponse getAuthorByUsername(@PathVariable String username) {
        return this.authorService.getAuthorByUsername(username);
    }
}
