package com.zazdravnykh.bookstore.domain;

public enum Category {

	FICTION("��������������"), ESSAYS("������������"), HISTORY("�������"), CHILDREN("�������"), POETRY("������");

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
