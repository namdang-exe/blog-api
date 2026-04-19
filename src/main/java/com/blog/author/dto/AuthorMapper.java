package com.blog.author.dto;

import com.blog.author.dao.Author;

public class AuthorMapper {
    public static Author toEntity(AuthorRequest request) {
        Author author = new Author();
        author.setUsername(request.getUsername());
        author.setEmail(request.getEmail());
        author.setBio(request.getBio());
        return author;
    }

    public static AuthorResponse toResponse(Author author) {
        return new AuthorResponse(
                author.getId(),
                author.getUsername(),
                author.getEmail(),
                author.getBio(),
                author.getCreatedAt());
    }
}
