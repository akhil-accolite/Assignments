import { Component, OnInit } from '@angular/core';
import { BookService } from 'src/app/providers/book.service';
import { Book } from 'src/app/model/book';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {

  books: any = [];
  book: Book;


  constructor(private bookService: BookService) { }

  ngOnInit() {
    // this.bookService.getAllBooks().subscribe((response) => {
    //   if (response && response.length > 0) {
    //     this.books = response;
    //   }
    // });

    this.book = new Book();
  }

  postData() {
    // const book = new Book(this.id, this.title, this.desc, this.author, this.price); 
    this.bookService.addBook(this.book).subscribe((response) => {
      console.log(response);
    });
  }

}
