package com.au.library.model;

public class Book {

	private String id;
	private String bookName;
	private String authorName;
	private String description;
	private double price;

	public Book() {

	}

	public Book(String id, String bookName, String authorName, String description, double price) {
		this.id = id;
		this.bookName = bookName;
		this.authorName = authorName;
		this.description = description;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
