package com.zazdravnykh.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String index(Model model) {

		model.addAttribute("tagline", "Welcome to the webstore");

		return "index";
	}
}
