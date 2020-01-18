import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { AddPostsComponent } from './add-posts/add-posts.component';
import { PostsComponent } from './posts/posts.component';
import { AddPostComponent } from './add-post/add-post.component';
import { GetPostComponent } from './get-post/get-post.component';
import { HeaderComponent } from './header/header.component';
import { UpdatePostsComponent } from './update-posts/update-posts.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    AddPostsComponent,
    PostsComponent,
    AddPostComponent,
    GetPostComponent,
    HeaderComponent,
    UpdatePostsComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot([
      {path: '', component: HomeComponent},
      {path: 'add-post', component: AddPostComponent},
      {path: 'get-post', component: GetPostComponent},
      {path: 'posts', component: PostsComponent}
    ]),
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
