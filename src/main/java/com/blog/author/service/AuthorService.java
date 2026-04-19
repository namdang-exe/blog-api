package com.blog.author.service;

import org.springframework.stereotype.Service;

import com.blog.author.dao.AuthorRepository;
import com.blog.author.dto.AuthorMapper;
import com.blog.author.dto.AuthorRequest;
import com.blog.author.dto.AuthorResponse;

@Service
public class AuthorService {
    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public AuthorResponse createAuthor(AuthorRequest author) {
        return AuthorMapper.toResponse(this.authorRepository.save(AuthorMapper.toEntity(author)));
    }

    public AuthorResponse getAuthorById(Long id) {
        return AuthorMapper.toResponse(this.authorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Author not found with id: " + id)));
    }

    public AuthorResponse getAuthorByUsername(String username) {
        return AuthorMapper.toResponse(this.authorRepository.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("Author not found with username: " + username)));
    }
}