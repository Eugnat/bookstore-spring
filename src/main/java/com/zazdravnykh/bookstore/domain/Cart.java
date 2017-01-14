package com.zazdravnykh.bookstore.domain;

import java.util.HashSet;
import java.util.Set;

public class Cart {

	public void setItemList(Set<OrderItem> itemList) {
		this.itemList = itemList;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	private Set<OrderItem> itemList = new HashSet<>();
	private int cartQuantity;

	@Override
	public String toString() {
		return "Cart [itemList=" + itemList + ", cartQuantity=" + cartQuantity + ", total=" + total + "]";
	}

	private int total = 0;

	public Cart() {
	}

	public Set<OrderItem> getItemList() {
		return itemList;
	}

	public int getCartQuantity() {

		int setSize = this.getItemList().size();

		if (setSize == 0) {
			cartQuantity = 0;
			return cartQuantity;
		} else {

			cartQuantity = 0;
			for (OrderItem item : itemList) {
				cartQuantity += item.getItemQuantity();
			}

			return cartQuantity;
		}

	}

	public void setCartQuantity(int cartQuantity) {
		this.cartQuantity = cartQuantity;
	}

	public int getTotal() {

		total = 0;

		for (OrderItem item : itemList) {
			total += item.getItemPrice() * item.getItemQuantity();
		}

		return total;
	}

}
