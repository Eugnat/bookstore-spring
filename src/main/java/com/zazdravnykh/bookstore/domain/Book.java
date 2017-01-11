package com.zazdravnykh.bookstore.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.NaturalId;

@Entity(name = "Book")
public class Book {

	@Id
	@GeneratedValue
	@Column(name = "ID")
	int id;

	@Column(name = "TITLE")
	private String title;

	@Column(name = "AUTHOR")
	private String author;

	@Column(name = "PAGE_NUMBER")
	private int pageNumber;

	@Column(name = "ISBN")
	@NaturalId
	private String isbn;

	@Enumerated(EnumType.STRING)
	private Category category;

	@Column(name = "URL")
	private String imageUrl;

	@Column(name = "PUBLISHING_HOUSE")
	private String publishingHouse;

	@Column(name = "ISSUE_YEAR")
	private int issueYear;

	@Column(name = "PRICE")
	private int price;

	@Column(name = "BESTSELLER")
	private Boolean bestseller;

	@Column(name = "LANGUAGE")
	private String language;

	@Column(name = "COPY_NUMBER")
	private int copyNumber;

	public Book() {
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getPublishingHouse() {
		return publishingHouse;
	}

	public void setPublishingHouse(String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}

	public int getIssueYear() {
		return issueYear;
	}

	public void setIssueYear(int issueYear) {
		this.issueYear = issueYear;
	}

	public int getPrice() {
		return price;
	}

	public Boolean getBestseller() {
		return bestseller;
	}

	public void setBestseller(Boolean bestseller) {
		this.bestseller = bestseller;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getCopyNumber() {
		return copyNumber;
	}

	public void setCopyNumber(int copyNumber) {
		this.copyNumber = copyNumber;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		return true;
	}

}
