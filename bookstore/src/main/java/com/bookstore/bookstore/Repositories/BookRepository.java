package com.bookstore.bookstore.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookstore.bookstore.Entities.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
