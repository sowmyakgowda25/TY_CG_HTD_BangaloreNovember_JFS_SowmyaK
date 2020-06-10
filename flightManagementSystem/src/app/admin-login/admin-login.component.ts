import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';
import { AdminLoginService } from '../admin-login.service';

@Component({
  selector: 'app-admin-login',
  templateUrl: './admin-login.component.html',
  styleUrls: ['./admin-login.component.css']
})
export class AdminLoginComponent implements OnInit {

  success: string;
  failure: string;
  error: any;

  constructor(private admin: AdminLoginService,
              private router: Router) { }

  adminLogin(form: NgForm) {
    this.admin.adminLogin(form.value).subscribe(data => {
      console.log(data);
      if (data.statusCode === 201) {
        localStorage.setItem('userDetails', JSON.stringify(data));
        console.log('user Details stored n local storage');
        this.router.navigateByUrl('/');
      }
    } , err => {
      console.log(err);
      this.error = err.error.message;
      setTimeout(() => {
        this.error = null;
      }, 4000);
    });
    }
  ngOnInit() {
  }
}
