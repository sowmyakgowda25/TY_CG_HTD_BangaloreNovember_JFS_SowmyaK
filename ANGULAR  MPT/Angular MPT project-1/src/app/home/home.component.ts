import { Component, OnInit } from '@angular/core';
import { Subscription, interval } from 'rxjs';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  mySubscription: Subscription;

  constructor(private router: Router) {
    this.mySubscription = interval(1000).subscribe(data => {
      console.log(data);
    });
  }

  goToId(id, name, url, email , phone) {
   // this.router.navigateByUrl(`/user/${id}`);
   this.router.navigate([`/user/${id}`], {
     queryParams: {userName: name, userImage: url}
   });
   this.router.navigate([`/user/${id}`],{
    queryParams: {userName: name, userEmail: email , userPhone: phone }
   });
  }

  ngOnInit() {
  }
  ngOnDestroy() {
    this.mySubscription.unsubscribe();
    }
}
