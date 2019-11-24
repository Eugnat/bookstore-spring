package com.zazdravnykh.bookstore.repository;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.zazdravnykh.bookstore.domain.Book;
import com.zazdravnykh.bookstore.domain.Category;
import org.springframework.data.jpa.repository.Query;

public interface BookDAO extends JpaRepository<Book, Integer> {

	List<Book> findByAuthorContainingIgnoreCase(String author);

	List<Book> findByTitleContainingIgnoreCase(String title);

	@Query("select b from Book b")
	List<Book> findFirstTenBooks(Pageable page);

	List<Book> findByIsbn(String isbn);

	List<Book> findByCategory(Category category);

	List<Book> findByBestsellerTrue();
}
