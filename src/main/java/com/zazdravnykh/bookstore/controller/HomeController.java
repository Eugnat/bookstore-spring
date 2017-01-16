package com.zazdravnykh.bookstore.controller;

import java.util.Collections;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zazdravnykh.bookstore.domain.Book;
import com.zazdravnykh.bookstore.domain.Cart;
import com.zazdravnykh.bookstore.service.BookService;

@Controller
public class HomeController {

	@Autowired
	BookService bookService;

	@RequestMapping("/")
	public String index(Model model, HttpServletRequest request) {

		if (request.getSession().getAttribute("cart") == null) {
			Cart cart = new Cart();
			request.getSession().setAttribute("cart", cart);
		}

		List<Book> bookList = bookService.showAllBooks();

		Random random = new Random();

		Collections.shuffle(bookList, random);

		bookList = bookList.subList(0, 10);

		model.addAttribute("booklist", bookList);

		return "index";
	}
}
