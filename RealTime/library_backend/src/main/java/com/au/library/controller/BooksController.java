package com.au.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.au.library.model.Book;
import com.au.library.repository.BookDAO;

@RestController
public class BooksController {

	@Autowired
	BookDAO booksDao;

	@GetMapping(value = "/books", produces = "application/json")
	public List<Book> getbook() {

		return booksDao.all();
	}


	@RequestMapping(value = "/books/{bookId}/get", method = RequestMethod.GET)
	public Book getBookById(@PathVariable(value = "bookId") String bookId) {
		return booksDao.get(bookId);
	}

	@PostMapping(value = "/addbook")
	public Book createBook(@RequestBody Book book) {
		return booksDao.create(book);
	}
	
	@PostMapping(value="/cart")
	public Book Addtocart(@RequestBody Book book) {
		
		System.out.println(book);

		return booksDao.addtocart(book);

	}

	@GetMapping(value = "/getcart",produces = "application/json")
	public List<Book> getthecart() {

		return booksDao.getcart();
	}
}
