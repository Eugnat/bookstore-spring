package com.zazdravnykh.bookstore.domain;

public enum Category {

	FICTION("Художественная"), ESSAYS("Публицистика"), HISTORY("История"), CHILDREN("Детская"), POETRY("Поэзия");

	String categoryName;

	Category(String categoryName) {

		this.categoryName = categoryName;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

}
