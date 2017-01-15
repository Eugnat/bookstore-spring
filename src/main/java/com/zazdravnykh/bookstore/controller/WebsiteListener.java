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

		session.setAttribute("cart", cart);

		System.out.println("Session started");

	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {

		HttpSession session = se.getSession();

		if (session.getAttribute("cart") != null)
			session.removeAttribute("cart");

		System.out.println("Session closed");

	}

}
