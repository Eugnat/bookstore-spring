package com.zazdravnykh.bookstore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zazdravnykh.bookstore.domain.Book;
import com.zazdravnykh.bookstore.domain.Category;

public interface BookDAO extends JpaRepository<Book, Integer> {

	List<Book> findByAuthorContainingIgnoreCase(String author);

	List<Book> findByTitleContainingIgnoreCase(String title);

	List<Book> findByIsbn(String isbn);

	List<Book> findByCategory(Category category);
}
