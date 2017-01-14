package com.zazdravnykh.bookstore.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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

		return "index";
	}
}
