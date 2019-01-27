package com.au.library.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.au.library.model.Book;

@Repository
public class BookDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Book> all() {
		return jdbcTemplate.query("select * from book", (rs, i) -> {
			return new Book(rs.getString("id"), rs.getString("title"), rs.getString("author"),
					rs.getString("description"), rs.getDouble("price"));
		});

	}

	public Book get(String id) {
		List<Book>  books = jdbcTemplate.query("select * from book where id="+id, (rs, i) -> {
			return new Book(rs.getString("id"), 
					rs.getString("title"), 
					rs.getString("author"),
					rs.getString("description"), 
					rs.getDouble("price"));
		});
		return books.get(0);
	}

	public Book create(Book book) {
		jdbcTemplate.update("insert into book (id, description, title, author, price)" + "values(?, ?, ?, ?, ?)",
				new Object[] { Integer.parseInt(book.getId()), book.getDescription(), book.getBookName(),
						book.getAuthorName(), book.getPrice() });
		return book;
	}

	public Book addtocart(Book book) {
		jdbcTemplate.update("insert into cart values(?,?);", 1, book.getId());
		System.out.println(book.getId());
		return book;
	}
	
	public List<Book> getcart(){
		return jdbcTemplate.query("select * from book b , cart c where b.id = c.bookid", (rs, i) -> {
			return new Book(rs.getString("id"), rs.getString("title"), rs.getString("author"),
					rs.getString("description"), rs.getDouble("price"));
		});
	}
}
