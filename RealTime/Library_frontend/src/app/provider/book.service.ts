import { Book } from './../model/book';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/internal/Observable';

@Injectable({
  providedIn: 'root'
})
export class BookService {

  constructor(private httpClient: HttpClient) { }

  getAllBooks(): Observable<any> {
    return this.httpClient.get("/library/books/");
  }

  getBookById(id: Book["id"]): Observable<any> {

    const url = "/library/books/" + id + "/get";
    return this.httpClient.get(url);
  }

  postBook(Book: any): Observable<any> {
    return this.httpClient.post("/library/addbook", Book);
  }

  addToCart(Book: any): Observable<any> {
    return this.httpClient.post("/library/cart", Book);
  }

  getcart():Observable<any>{
    return this.httpClient.get("/library/getcart");
  }
}
