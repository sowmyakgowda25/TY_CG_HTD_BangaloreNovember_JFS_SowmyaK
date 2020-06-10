import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AdminLoginService {

  api = `http://localhost:8080`;

  constructor(private http: HttpClient) { }

  adminLogin(userDetails): Observable<any> {
    return this.http.post<any>(`${this.api}/adminLogin`, userDetails);
  }
}

