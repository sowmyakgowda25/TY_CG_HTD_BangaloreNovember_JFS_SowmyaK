import { Component, OnInit } from '@angular/core';
import { FlightService } from '../flight.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-add-flight',
  templateUrl: './add-flight.component.html',
  styleUrls: ['./add-flight.component.css']
})
export class AddFlightComponent implements OnInit {

  success: string;
  failure: string;
  constructor(private flight: FlightService) { }

  addFlight(form: NgForm) {
    this.flight.addFlight(form.value).subscribe(data => {
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
