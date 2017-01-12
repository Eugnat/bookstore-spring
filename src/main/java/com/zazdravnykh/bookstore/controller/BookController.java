package com.zazdravnykh.bookstore.controller;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.zazdravnykh.bookstore.domain.Book;
import com.zazdravnykh.bookstore.domain.Category;
import com.zazdravnykh.bookstore.service.BookService;

@Controller
@RequestMapping("/books")
public class BookController {

	@Autowired
	BookService bookService;

	@RequestMapping("/category")
	public String showCategory(@RequestParam("cat") String category, Model model) {

		List<Book> list = bookService.findByCategory(category);

		model.addAttribute("booklist", list);

		return "showCategory";

	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addBook(Model model) {

		Book book = new Book();
		Category[] categoryList = Category.values();

		model.addAttribute("categoryList", categoryList);
		model.addAttribute("newBook", book);

		return "addBook";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String processAddBookForm(@ModelAttribute("newBook") Book newBook, HttpServletRequest request) {

		MultipartFile bookImage = newBook.getImageFile();

		String rootDirectory = request.getServletContext().getRealPath("/");

		if (bookImage != null && !bookImage.isEmpty()) {
			try {
				bookImage.transferTo(new File(rootDirectory + "resources\\images\\" + newBook.getIsbn() + ".jpg"));
			} catch (Exception e) {
				throw new RuntimeException("Product Image saving failed", e);
			}
		}

		bookService.saveBook(newBook);

		return "bookAdded";
	}

}
