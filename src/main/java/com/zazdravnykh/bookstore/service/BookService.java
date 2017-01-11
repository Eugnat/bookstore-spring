package com.zazdravnykh.bookstore.service;

import java.util.List;

import com.zazdravnykh.bookstore.domain.Book;

public interface BookService {

	List<Book> showAllBooks();

	Book showBookById(int id);

	void saveBook(Book book);

	List<Book> findByCategory(String category);

	List<Book> findByAuthor(String author);

	List<Book> findByTitle(String title);

	List<Book> findByIsbn(String isbn);

}
