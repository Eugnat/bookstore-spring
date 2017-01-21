package com.zazdravnykh.bookstore.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.zazdravnykh.bookstore.domain.Cart;
import com.zazdravnykh.bookstore.service.CartService;

@Controller
@RequestMapping("/cart")
public class CartController {

	@Autowired
	CartService cartService;

	@RequestMapping(value = "/overview", method = RequestMethod.GET)
	public String showCart() {

		return "cart";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updateCart(@RequestParam("itemId") String itemId, @RequestParam("itemQuantity") String itemQuantity, HttpServletRequest request) {

		int id;
		int quantity;

		Cart cart = (Cart) request.getSession().getAttribute("cart");

		try {
			id = Integer.parseInt(itemId);
			quantity = Integer.parseInt(itemQuantity);
		} catch (NumberFormatException e) {
			return "redirect:/errorPage";
		}

		cart = cartService.updateOrderItem(id, quantity, cart);

		request.getSession().setAttribute("cart", cart);

		return "redirect:/cart/overview";

	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String removeOrderItem(@RequestParam("itemId") String itemId, HttpServletRequest request) {

		int id;

		Cart cart = (Cart) request.getSession().getAttribute("cart");

		try {
			id = Integer.parseInt(itemId);

		} catch (NumberFormatException e) {
			return "redirect:/errorPage";
		}

		cart = cartService.removeOrderItem(id, cart);

		return "redirect:/cart/overview";

	}

	@RequestMapping(value = "/checkout", method = RequestMethod.POST)
	public String checkout(HttpServletRequest request) {

		Cart cart = (Cart) request.getSession().getAttribute("cart");

		if (cart == null || cart.getCartQuantity() == 0) {
			return "redirect:/cart/overview";
		}

		return "checkout";
	}

	@RequestMapping(value = "/payment", method = RequestMethod.POST)
	public String payment() {

		return "paymentFinal";
	}

}
