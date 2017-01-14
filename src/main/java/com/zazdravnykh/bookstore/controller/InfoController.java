package com.zazdravnykh.bookstore.controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.zazdravnykh.bookstore.domain.Book;
import com.zazdravnykh.bookstore.service.BookService;

@Controller
@RequestMapping("/info")
public class InfoController {

	@Autowired
	BookService bookService;

	@RequestMapping("/company")
	public String companyInfo() {

		return "companyInfo";
	}

	@RequestMapping("/payment")
	public String payment() {

		return "payment";
	}

	@RequestMapping("/delivery")
	public String delivery() {

		return "delivery";
	}

	@RequestMapping("/contacts")
	public String contacts() {

		return "contacts";
	}

	@RequestMapping("/legal")
	public String legal() {

		return "legal";
	}

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String search() {

		return "searchBook";
	}

	@RequestMapping(value = "/search", method = RequestMethod.POST)
	public String search(@RequestParam("author") String author, @RequestParam("title") String title, @RequestParam("isbn") String isbn, Model model, HttpServletRequest request) throws UnsupportedEncodingException {

		request.setCharacterEncoding("UTF-8");

		String authorToFind = author.trim();
		String titleToFind = title.trim();
		String isbnToFind = isbn.trim();
		List<Book> listByAuthor = new ArrayList<>();
		List<Book> listByTitle = new ArrayList<>();
		List<Book> listByIsbn = new ArrayList<>();

		if (!authorToFind.equals("")) {
			listByAuthor = bookService.findByAuthor(authorToFind);
		}

		if (!titleToFind.equals("")) {
			listByTitle = bookService.findByTitle(titleToFind);
		}

		if (!isbnToFind.equals("")) {
			listByIsbn = bookService.findByIsbn(isbnToFind);
		}

		Set<Book> set = new HashSet<>();

		set.addAll(listByAuthor);
		set.addAll(listByTitle);
		set.addAll(listByIsbn);

		model.addAttribute("booklist", set);

		return "books";
	}

}
