package com.zazdravnykh.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zazdravnykh.bookstore.domain.Book;
import com.zazdravnykh.bookstore.service.BookService;

@Controller
public class BookController {

	@Autowired
	private BookService bookService;

	@RequestMapping("/books")
	public String showBooks(Model model) {

		Book book = bookService.showBookById(1);

		model.addAttribute("book", book);

		return "books";
	}

}
