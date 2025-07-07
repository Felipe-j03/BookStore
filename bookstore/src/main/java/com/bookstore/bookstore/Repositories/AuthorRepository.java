package com.bookstore.bookstore.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookstore.bookstore.Entities.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
