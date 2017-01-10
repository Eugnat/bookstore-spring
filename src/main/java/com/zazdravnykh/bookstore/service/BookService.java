package com.zazdravnykh.bookstore.service;

import java.util.List;

import com.zazdravnykh.bookstore.domain.Book;

public interface BookService {

	List<Book> showAllBooks();

	Book showBookById(int id);

	void saveBook(String title, String author);

}
