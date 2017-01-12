package com.zazdravnykh.bookstore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zazdravnykh.bookstore.domain.Book;
import com.zazdravnykh.bookstore.domain.Category;
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

		List<Book> list = bookDAO.findAll();
		return list;
	}

	@Override
	public Book showBookById(int id) {

		Book book = bookDAO.findOne(id);

		return book;

	}

	@Override
	public void saveBook(Book book) {

		bookDAO.save(book);

	}

	@Override
	public List<Book> findByCategory(String category) {

		Category targetCategory = Category.valueOf(category.toUpperCase());

		List<Book> list = bookDAO.findByCategory(targetCategory);

		return list;
	}

	@Override
	public List<Book> findByAuthor(String author) {

		return bookDAO.findByAuthorContainingIgnoreCase(author);
	}

	@Override
	public List<Book> findByTitle(String title) {

		return bookDAO.findByTitleContainingIgnoreCase(title);
	}

	@Override
	public List<Book> findByIsbn(String isbn) {

		return bookDAO.findByIsbn(isbn);
	}

	@Override
	public List<Book> findByBestseller() {

		return bookDAO.findByBestsellerTrue();
	}

	@Override
	public List<Book> sortByPrice(List<Book> booklist, boolean asc) {

		if (asc)
			booklist.sort((a, b) -> a.getPrice() - b.getPrice());
		else
			booklist.sort((a, b) -> b.getPrice() - a.getPrice());

		return booklist;
	}

	@Override
	public List<Book> sortByTitle(List<Book> booklist, boolean asc) {

		if (asc)
			booklist.sort((a, b) -> a.getTitle().compareToIgnoreCase(b.getTitle()));
		else
			booklist.sort((a, b) -> b.getTitle().compareToIgnoreCase(a.getTitle()));

		return booklist;

	}

}
