import { Component, OnInit } from '@angular/core';
import { Customer } from '../customer';
import { GetAllCustomersComponent } from '../get-all-customers/get-all-customers.component';

@Component({
  selector: 'app-delete-customer',
  templateUrl: './delete-customer.component.html',
  styleUrls: ['./delete-customer.component.css']
})
export class DeleteCustomerComponent implements OnInit {
  ngOnInit(): void {
    this.setCustomers();
  }
  customers !: Customer[]; 
  


  setCustomers() { }


}
