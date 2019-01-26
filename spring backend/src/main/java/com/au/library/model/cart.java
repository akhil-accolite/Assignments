package com.au.library.model;

public class cart {

	private String cartid;
	private String bookid;

	public cart() {
	}

	public String getCheckoutid() {
		return cartid;
	}

	public void setCheckoutid(String checkoutid) {
		this.cartid = checkoutid;
	}

	public String getBookid() {
		return bookid;
	}

	public void setBookid(String bookid) {
		this.bookid = bookid;
	}

}
