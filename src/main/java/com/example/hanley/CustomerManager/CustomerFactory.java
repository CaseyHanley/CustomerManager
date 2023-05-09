package com.example.hanley.CustomerManager;


import java.util.List;

public interface CustomerFactory {

    List<CustomerEntity> getCustomers();
    CustomerEntity getCustomerById(int id);
    CustomerEntity addCustomer(CustomerEntity user);

    CustomerEntity updateCustomer(CustomerEntity user);
    String DeleteCustomerById(int id);
}
