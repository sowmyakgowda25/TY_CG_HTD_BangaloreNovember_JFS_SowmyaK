import { Component, OnInit } from '@angular/core';
import { PostsService } from '../posts.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-posts',
  templateUrl: './posts.component.html',
  styleUrls: ['./posts.component.css']
})
export class PostsComponent implements OnInit {

  message: string;
  posts: Posts[];

  constructor(private postService: PostsService , private router: Router) {
    this.getPosts();
  }

  getPosts() {
    this.postService.getData().subscribe(response => {
      console.log(response);
      this.posts = response.posts;
    }, err => {
      console.log(err);
    });
  }

  deleteProduct(post: Posts) {
    this.postService.deleteData(post).subscribe(res => {
      console.log(res);
      if (res.message === 'deleted successfully') {
        this.posts.splice(this.posts.indexOf(post), 1);
        this.message = res.message;
      }
    });
  }
  deleteMessage() {
    this.message = null;
  }

  selectPost(post) {
    this.postService.selectedProductToUpdate = post;
    this.router.navigateByUrl('/update-posts');
  }

  ngOnInit() {
  }

}
