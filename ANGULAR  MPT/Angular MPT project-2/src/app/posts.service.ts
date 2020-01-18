import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PostsService {

  selectedProductToUpdate: Posts;

  api = `http://localhost:8080`;

  constructor(private http: HttpClient) { }

  postData(post): Observable<any> {
    return this.http.post<any>(`${this.api}/add-post`, post);
  }

  getData(): Observable<any> {
    return this.http.get<any>(`${this.api}/view-allpost`);
  }

  deleteData(post: Posts): Observable<any> {
    return this.http.delete<any>(
      `${this.api}/delete-post/${post.id}`
    );
  }
  updateData(post): Observable<any> {
    return this.http.put<any>(
      `${this.api}/update-post/${post.id}`,
      post
    );
  }
}
