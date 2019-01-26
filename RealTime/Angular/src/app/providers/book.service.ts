import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/internal/Observable';


@Injectable({
  providedIn: 'root'
})
export class BookService {

  constructor(private http: HttpClient) { }

  getAllBooks(): Observable<any> {
    return this.http.get('/library/books');
  }

  getBookById(id): Observable<any> {
    const url = '/library/books/' + id + '/get';
    return this.http.get(url);
  }

  addBook(book: any): Observable<any> {
    return this.http.post('/library/addbook', book);
  }

  addbtoc(book: any): Observable<any> {
    return this.http.post('/library/cart',book.id);
  }

  getbfromc():Observable<any>{
    return this.http.get('/library/getcart');
  }
}
