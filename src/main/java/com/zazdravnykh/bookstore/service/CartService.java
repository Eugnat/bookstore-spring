package com.zazdravnykh.bookstore.service;

import com.zazdravnykh.bookstore.domain.Cart;

public interface CartService {

	Cart addOrderItem(int itemId, Cart cart);

	Cart removeOrderItem(int itemId, Cart cart);
}
