import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { Customer } from '../customer';
import { CustomerService } from '../customer.service';

@Component({
  selector: 'app-create-customer',
  templateUrl: './create-customer.component.html',
  styleUrls: ['./create-customer.component.css']
})
export class CreateCustomerComponent implements OnInit{
  customer: Customer = new Customer();
  constructor(private customerService: CustomerService, private router: Router) { }
  ngOnInit(): void { }
  addCustomer() {
    this.customerService.createCustomer(this.customer).subscribe(
      (data) => {
        console.log(data);
        this.goToCustomer();
      },
      (error) => console.log(error)

    );
  }

  goToCustomer() { this.router.navigate(['/viewcustomer']); }

  onSubmit(form: NgForm) {
    const formData = form.value;
    this.customer.fName = formData.fName;
    this.customer.lName = formData.lName;
    this.customer.phoneNum = formData.phoneNum;

    console.log(this.customer); this.addCustomer();
  }

 
}
