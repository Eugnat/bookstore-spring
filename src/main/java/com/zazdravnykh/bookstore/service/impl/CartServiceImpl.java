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

		cart.getItemList().add(orderItem);

		return cart;
	}

	@Override
	public Cart updateOrderItem(int itemId, int itemQuantity, Cart cart) {

		Book book = bookDAO.findOne(itemId);

		Set<OrderItem> set = cart.getItemList();

		Iterator<OrderItem> iterator = set.iterator();

		while (iterator.hasNext()) {
			OrderItem item = iterator.next();
			if (item.getItemId() == itemId) {
				iterator.remove();
				break;
			}

		}

		OrderItem orderItem = new OrderItem();

		orderItem.setItemId(book.getId());
		orderItem.setAuthorName(book.getAuthor());
		orderItem.setItemName(book.getTitle());
		orderItem.setItemPrice(book.getPrice());
		orderItem.setItemQuantity(itemQuantity);

		cart.getItemList().add(orderItem);

		return cart;

	}

	@Override
	public Cart removeOrderItem(int itemId, Cart cart) {

		Iterator<OrderItem> iterator = cart.getItemList().iterator();

		while (iterator.hasNext()) {
			OrderItem item = iterator.next();
			if (item.getItemId() == itemId) {
				iterator.remove();
				break;
			}
		}

		return cart;
	}

}
