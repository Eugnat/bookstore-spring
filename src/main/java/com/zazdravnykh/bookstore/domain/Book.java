package com.zazdravnykh.bookstore.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

import org.hibernate.annotations.NaturalId;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.web.multipart.MultipartFile;

@Entity(name = "Book")
public class Book {

	@Id
	@GeneratedValue
	@Column(name = "ID")
	int id;

	@Column(name = "TITLE")
	@Pattern(regexp = ".{1,50}", message = "{Pattern.Book.title.validation}")
	@NotBlank(message = "{NotBlank.Book.title.validation}")
	private String title;

	@Column(name = "AUTHOR")
	@Pattern(regexp = ".{1,30}", message = "{Pattern.Book.author.validation}")
	@NotBlank(message = "{NotBlank.Book.author.validation}")
	private String author;

	@Column(name = "PAGE_NUMBER")
	@Min(value = 1, message = "{Min.Book.pageNumber.validation}")
	@Max(value = 3000, message = "{Max.Book.pageNumber.validation}")
	private int pageNumber;

	@Column(name = "ISBN")
	@NaturalId
	@NotBlank(message = "{NotBlank.Book.isbn.validation}")
	@Pattern(regexp = "[0-9]{13}", message = "{Pattern.Book.isbn.validation}")
	private String isbn;

	@Enumerated(EnumType.STRING)
	private Category category;

	@Transient
	private MultipartFile imageFile;

	@Column(name = "PUBLISHING_HOUSE")
	@NotBlank(message = "{NotEmpty.Book.publishingHouse.validation}")
	private String publishingHouse;

	@Column(name = "ISSUE_YEAR")
	@Min(value = 1950, message = "{Min.Book.issueYear.validation}")
	@Max(value = 2017, message = "{Max.Book.issueYear.validation}")
	private int issueYear;

	@Column(name = "PRICE")
	@Digits(fraction = 0, integer = 4, message = "{Digits.Book.price.validation}")
	@Min(value = 0, message = "{Min.Book.price.validation}")
	private int price;

	@Column(name = "BESTSELLER")
	private Boolean bestseller;

	@Column(name = "LANGUAGE")
	@NotBlank(message = "{NotBlank.Book.language.validation}")
	private String language;

	@Column(name = "COPY_NUMBER")
	@Min(value = 1, message = "{Min.Book.copyNumber.validation}")
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

	public MultipartFile getImageFile() {
		return imageFile;
	}

	public void setImageFile(MultipartFile imageFile) {
		this.imageFile = imageFile;
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
