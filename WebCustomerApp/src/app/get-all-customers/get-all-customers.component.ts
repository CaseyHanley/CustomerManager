import { Component, OnInit } from '@angular/core';
import { Customer } from '../customer';
import { CustomerService } from '../customer.service';

@Component({
  selector: 'app-get-all-customers',
  templateUrl: './get-all-customers.component.html',
  styleUrls: ['./get-all-customers.component.css']
})
export class GetAllCustomersComponent implements OnInit {
  customers!: Customer[];
  

  constructor(private customerService: CustomerService) { }

  ngOnInit(): void {

    this.getCustomers();}

  private getCustomers() {
    this.customerService.getAllCustomers().subscribe((data) => { this.customers = data; });

  }

  public returnCustomers() {
    this.getCustomers();
    return this.customers;
  }


}
