package com.zazdravnykh.bookstore.repository;

import java.util.List;

import com.zazdravnykh.bookstore.domain.Book;

public interface BookDAO {

	Book findById(int id);

	List<Book> findByAuthor(String author);

	List<Book> findByTitle(String title);

	List<Book> findAll();

	void saveBook(Book book);

	void saveBook(String title, String author);

}
