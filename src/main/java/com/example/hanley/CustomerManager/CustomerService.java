package com.example.hanley.CustomerManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements CustomerFactory {

    @Autowired
    private CustomerDAO customerDAO;
    @Override
    public List<CustomerEntity> getCustomers() {
        return customerDAO.findAll();
    }

    @Override
    public CustomerEntity getCustomerById(int id) {
        return customerDAO.getReferenceById(id);
    }

    @Override
    public CustomerEntity addCustomer(CustomerEntity user) {
        return customerDAO.save(user);
    }

    @Override
    public CustomerEntity updateCustomer(CustomerEntity user) {
        return customerDAO.save(user);
    }

    @Override
    public String DeleteCustomerById(int id) {
        customerDAO.deleteById(id);
        return "User with ID: " + id +" has been deleted";
    }
}
