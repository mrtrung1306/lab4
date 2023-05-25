package com.example.demo3.repository;

import com.example.demo3.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepository extends JpaRepository<Book,Long> {
}
