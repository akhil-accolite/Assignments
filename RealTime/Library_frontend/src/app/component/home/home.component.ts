import { BookService } from './../../provider/book.service';
import { Book } from './../../model/book';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {

  books: any = []
  book: Book;

  constructor(private bookService: BookService) { }

  ngOnInit() {
    this.book = new Book();
  }

  postBook(){
    this.bookService.postBook(this.book).subscribe((Response) => {
      if (Response) {
        console.log(Response);
      }
    });
  }

}
