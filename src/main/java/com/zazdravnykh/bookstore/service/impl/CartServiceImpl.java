package com.zazdravnykh.bookstore.service.impl;

import java.util.Iterator;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.zazdravnykh.bookstore.domain.Book;
import com.zazdravnykh.bookstore.domain.Cart;
import com.zazdravnykh.bookstore.domain.OrderItem;
import com.zazdravnykh.bookstore.repository.BookDAO;
import com.zazdravnykh.bookstore.service.CartService;

@Service
@Repository
public class CartServiceImpl implements CartService {

	@Autowired
	BookDAO bookDAO;

	@Override
	public Cart addOrderItem(int itemId, Cart cart) {

		Book book = bookDAO.findOne(itemId);
		int itemQuantity = 0;

		Set<OrderItem> set = cart.getItemList();

		Iterator<OrderItem> iterator = set.iterator();

		while (iterator.hasNext()) {
			OrderItem item = iterator.next();
			if (item.getItemId() == itemId) {
				itemQuantity = item.getItemQuantity();
				iterator.remove();
				break;
			}

		}

		++itemQuantity;

		OrderItem orderItem = new OrderItem();

		orderItem.setItemId(book.getId());
		orderItem.setAuthorName(book.getAuthor());
		orderItem.setItemName(book.getTitle());
		orderItem.setItemPrice(book.getPrice());
		orderItem.setItemQuantity(itemQuantity);

		System.out.println("Order item: " + orderItem);

		cart.getItemList().add(orderItem);

		System.out.println("New cart: " + cart);

		return cart;
	}

	@Override
	public Cart removeOrderItem(int itemId, Cart cart) {

		OrderItem orderItem = new OrderItem();

		orderItem.setItemId(itemId);

		cart.getItemList().remove(orderItem);

		return cart;
	}

}
