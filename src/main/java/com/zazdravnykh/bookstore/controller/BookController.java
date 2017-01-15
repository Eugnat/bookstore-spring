package com.zazdravnykh.bookstore.controller;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.zazdravnykh.bookstore.domain.Book;
import com.zazdravnykh.bookstore.domain.Cart;
import com.zazdravnykh.bookstore.domain.Category;
import com.zazdravnykh.bookstore.service.BookService;
import com.zazdravnykh.bookstore.service.CartService;

@Controller
@RequestMapping("/books")
public class BookController {

	@Autowired
	private BookService bookService;

	@Autowired
	private CartService cartService;

	@InitBinder
	public void initialiseBinder(WebDataBinder binder) {
	}

	@RequestMapping(value = "/category", method = RequestMethod.GET)
	public String showCategory(@RequestParam("cat") String category, Model model) {

		List<Book> list = bookService.findByCategory(category);

		model.addAttribute("booklist", list);

		return "showCategory";

	}

	@RequestMapping(value = "/addToCart", method = RequestMethod.POST)
	public String showCategory(@RequestParam("itemId") String id, HttpServletRequest request) {

		int itemId = Integer.parseInt(id);

		Cart cart = (Cart) request.getSession().getAttribute("cart");

		Cart updatedCart = cartService.addOrderItem(itemId, cart);

		request.getSession().setAttribute("cart", updatedCart);

		return "redirect:/cart/overview";
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
	public String processAddBookForm(@ModelAttribute("newBook") @Valid Book newBook, BindingResult result, HttpServletRequest request) throws UnsupportedEncodingException {

		if (result.hasErrors())
			return "addBook";

		request.setCharacterEncoding("UTF-8");

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

	@RequestMapping(value = "/book")
	public String showBook(@RequestParam("id") String id, Model model) {

		int bookId = Integer.parseInt(id);

		Book book = bookService.findOne(bookId);

		model.addAttribute("book", book);

		return "showBook";

	}

	@RequestMapping(value = "/bestsellers")
	public String showBook(Model model) {

		List<Book> list = bookService.findByBestseller();

		model.addAttribute("booklist", list);

		return "books";
	}

}
