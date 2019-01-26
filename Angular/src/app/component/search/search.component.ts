import { Component, OnInit } from '@angular/core';
import { BookService } from 'src/app/providers/book.service';
import { Book } from 'src/app/model/book';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.scss']
})
export class SearchComponent implements OnInit {
  books: any = [];
  book: any;

  constructor(private bookService: BookService) { }

  ngOnInit() {
    this.bookService.getBookById(Book).subscribe((response) => {
      if (response) {
        this.book = response;
      }
    });

    this.bookService.getAllBooks().subscribe((response) => {
      if (response && response.length > 0) {
        this.books = response;
      }
    });
  }
    sendbtoc(obj){

      console.log(obj);

      this.bookService.addbtoc(obj).subscribe((response)=>{

        if (response && response.length > 0) {
          this.books = response;
          alert("added a book");
        }
      });
      
    }
  }
