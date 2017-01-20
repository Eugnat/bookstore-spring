package com.zazdravnykh.bookstore.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AdviceController {

	@ExceptionHandler(Exception.class)
	public String error() {

		return "errorPage";
	}

}
