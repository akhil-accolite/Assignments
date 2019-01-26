import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from 'src/app/component/home/home.component';
import { SearchComponent } from 'src/app/component/search/search.component';
import { BookComponent } from 'src/app/component/book/book.component';

const routes: Routes = [
  { path: 'home', component: HomeComponent},
  { path: 'search', component: SearchComponent},
  { path: 'book/:id', component: BookComponent },
  { path: '', redirectTo: '/home',  pathMatch: 'full' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
