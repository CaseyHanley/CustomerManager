import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-create-customer',
  templateUrl: './create-customer.component.html',
  styleUrls: ['./create-customer.component.css']
})
export class CreateCustomerComponent {
  apiUrl = 'localhost:9000/customers';

  constructor(private http: HttpClient) { }

  onSubmit(form: NgForm) {
    const formData = { };

    this.http.post(this.apiUrl, formData).subscribe(
      response => {
        // handle success
      },
      error => {
        // handle error
      }
    );
  }
}
