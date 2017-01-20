package com.zazdravnykh.bookstore.domain;

import java.util.HashSet;
import java.util.Set;

public class Order {

	private Set<OrderItem> itemList;
	private Customer customer;
	private ShippingAddress address;
	private CreditCard card;

	public Order() {

		itemList = new HashSet<>();
	}

	public Set<OrderItem> getItemList() {
		return itemList;
	}

	public void setItemList(Set<OrderItem> itemList) {
		this.itemList = itemList;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public ShippingAddress getAddress() {
		return address;
	}

	public void setAddress(ShippingAddress address) {
		this.address = address;
	}

	public CreditCard getCard() {
		return card;
	}

	public void setCard(CreditCard card) {
		this.card = card;
	}

}
