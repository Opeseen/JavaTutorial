package com.example.tutor.controller;

import com.example.tutor.entity.Book;
import com.example.tutor.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/books")
public class BookController {
  private final BookRepository bookRepository;

  @PostMapping
  @CacheEvict(value = "books", allEntries = true) // Invalidate the entire books cache
  public ResponseEntity<Book> addBook(@RequestBody Book book) {
    Book savedBook = bookRepository.save(book);
    return ResponseEntity.ok(savedBook);
  }
  @GetMapping("/{id}")
  public ResponseEntity<Book> getBook(@PathVariable Long id) {
    Optional<Book> book = bookRepository.findById(id);
    return book.map(ResponseEntity::ok).orElseGet(() ->
        ResponseEntity.notFound().build());
  }

}
