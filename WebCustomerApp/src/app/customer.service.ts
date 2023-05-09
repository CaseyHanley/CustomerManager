import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Customer } from './customer';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  private URL = 'http://localhost:9000/customers';
 
  constructor(private httpClient: HttpClient) { }

  createCustomer(customer: Customer): Observable<Customer> {
    return this.httpClient.post(this.URL, customer, );
  }


  getAllCustomers() {
    return this.httpClient.get<Customer[]>(this.URL);
  }

  deleteCustomer(id:number) {

    return this.httpClient.delete('${this.URL}/${id}');
  }


}




