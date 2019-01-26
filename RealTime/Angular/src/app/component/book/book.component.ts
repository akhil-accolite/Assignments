import { Component, OnInit } from '@angular/core';
import { Route } from '@angular/compiler/src/core';
import { ActivatedRoute } from '@angular/router';
import { BookService } from 'src/app/providers/book.service';
import { Book } from 'src/app/model/book';

@Component({
  selector: 'app-book',
  templateUrl: './book.component.html',
  styleUrls: ['./book.component.scss']
})
export class BookComponent implements OnInit {
  book: Book;
  bookId: any;

  constructor(private route: ActivatedRoute, private bookService: BookService) { }

  ngOnInit() {
    this.bookId = this.route.snapshot.paramMap.get('id');
    console.log(this.bookId);

    this.bookService.getBookById(this.bookId).subscribe((response) => {
      if (response) {
        this.book = response;
      }
    });
  }

}
