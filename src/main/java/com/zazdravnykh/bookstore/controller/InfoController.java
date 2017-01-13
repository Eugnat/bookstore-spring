package com.zazdravnykh.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/info")
public class InfoController {

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

	@RequestMapping("/search")
	public String search() {

		return "searchBook";
	}

}
