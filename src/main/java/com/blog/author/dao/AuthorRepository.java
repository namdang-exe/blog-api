package com.blog.author.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
    Optional<Author> findByUsername(String username);

    Optional<Author> findByEmail(String email);
}
