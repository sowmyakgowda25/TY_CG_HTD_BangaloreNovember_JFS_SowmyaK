import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-add-user',
  templateUrl: './add-user.component.html',
  styleUrls: ['./add-user.component.css']
})
export class AddUserComponent implements OnInit {

  success: string;
  failure: string;
  constructor(private user: UserService) { }

  addUser(form: NgForm) {
    this.user.addUser(form.value).subscribe(data => {
      console.log(data);
      if (data.statusCode === 201) {
        this.success = data.description;
        setTimeout(() => {
        this.success = null;
      }, 2000);
        form.reset();
    } else {
      this.failure = data.description;
      setTimeout(() => {
        this.failure = null;
      }, 2000);
    }
    });

}

  ngOnInit() {
  }

}
