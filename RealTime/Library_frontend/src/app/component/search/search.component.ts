import { BookService } from './../../provider/book.service';
import { Book } from './../../model/book';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.scss']
})
export class SearchComponent implements OnInit {

  books: any = [];
  book: Book;

  constructor(private bookService: BookService) { }

  ngOnInit() {
    this.book = new Book();
    this.bookService.getAllBooks().subscribe((response) => {
      if (response && response.length > 0) {
        this.books = response;
      }
    });
  }

  addToCart(book) {

    this.bookService.addToCart(book).subscribe((response) => {
      if (response && response.length > 0) {
        console.log(response);
      }
    });

  }

}