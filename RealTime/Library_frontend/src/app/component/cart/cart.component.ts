import { BookService } from './../../provider/book.service';
import { Book } from './../../model/book';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.scss']
})
export class CartComponent implements OnInit {

  books:any = [];
  book:any;

  constructor(private bookService:BookService) { }

  ngOnInit() {

    this.book = new Book();
    this.bookService.getcart().subscribe((Response)=>{
      if(Response && Response.length>0){
        this.books = Response;
      }
    });
  }

}
