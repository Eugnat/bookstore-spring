package com.zazdravnykh.bookstore.controller;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import com.zazdravnykh.bookstore.domain.Cart;

public class WebsiteListener implements HttpSessionListener {

	public WebsiteListener() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sessionCreated(HttpSessionEvent se) {

		HttpSession session = se.getSession();

		Cart cart = new Cart();

		String login = "false";

		session.setAttribute("cart", cart);
		session.setAttribute("login", login);

		System.out.println("Session started");

	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {

		HttpSession session = se.getSession();

		Cart cart = new Cart();
		if (session.getAttribute("cart") != null)
			session.setAttribute("cart", cart);

		String login = "false";
		session.setAttribute("login", login);

		System.out.println("Session closed, user logout");

	}

}
