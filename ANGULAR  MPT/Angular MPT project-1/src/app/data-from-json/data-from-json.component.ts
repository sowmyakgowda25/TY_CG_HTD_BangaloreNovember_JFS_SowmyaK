import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-data-from-json',
  templateUrl: './data-from-json.component.html',
  styleUrls: ['./data-from-json.component.css']
})
export class DataFromJsonComponent implements OnInit {

  products: Product[];
  customers: Customer [];

  constructor(private http: HttpClient) {
    this.getDataFromJSON();
  }

  getDataFromJSON() {
    this.http.get<Product[]>('../../assets/products.json').subscribe(response => {
      console.log(response);
      this.products = response;
    });
    this.http.get<Customer[]>('../../assets/customers.json').subscribe(response => {
      console.log(response);
      this.customers = response;
    });
  }


  ngOnInit() {
  }
}

interface Product {
    name: string;
    url: string;
    price: number;
  }

interface Customer {
  name: string;
  email: string;
  phone: number;
}


