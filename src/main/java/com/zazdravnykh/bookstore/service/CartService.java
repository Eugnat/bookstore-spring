package com.zazdravnykh.bookstore.service;

import com.zazdravnykh.bookstore.domain.Cart;

public interface CartService {

	Cart addOrderItem(int itemId, Cart cart);

	Cart updateOrderItem(int itemId, int itemQuantity, Cart cart);

	Cart removeOrderItem(int itemId, Cart cart);
}
