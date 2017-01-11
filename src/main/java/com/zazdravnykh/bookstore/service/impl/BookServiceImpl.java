package com.zazdravnykh.bookstore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zazdravnykh.bookstore.domain.Book;
import com.zazdravnykh.bookstore.repository.BookDAO;
import com.zazdravnykh.bookstore.service.BookService;

@Service
@Repository
@Transactional
@Lazy
public class BookServiceImpl implements BookService {

	@Autowired
	BookDAO bookDAO;

	@Override
	public List<Book> showAllBooks() {

		List<Book> list = (List<Book>) bookDAO.findAll();
		return list;
	}

	@Override
	public Book showBookById(int id) {

		Book book = bookDAO.findOne(id);

		return book;

	}

	@Override
	public void saveBook(String title, String author) {

		bookDAO.save(new Book(title, author));

	}

	@Override
	public void saveBook(Book book) {

		bookDAO.save(book);

	}

}
