package com.zazdravnykh.bookstore.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AdviceController {

	@ExceptionHandler(Exception.class)
	public String error(HttpServletRequest request, Model model, Exception exception) {

		model.addAttribute("exception", exception);
		model.addAttribute("url", request.getRequestURL());
		return "errorPage";
	}

}
