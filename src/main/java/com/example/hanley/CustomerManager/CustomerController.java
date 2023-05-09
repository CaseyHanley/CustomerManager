package com.example.hanley.CustomerManager;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@RestController
@CrossOrigin
public class CustomerController implements CustomerFactory {


    @Autowired
    @Resource(name = "customerService")
    private CustomerService userService;

   @RequestMapping("/newhome")
   public RedirectView redirect(){
        String newUrl = "http://localhost:4200/home";
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl(newUrl);
        return redirectView;
    }


    @GetMapping("/customers")
    @Override
    public List<CustomerEntity> getCustomers() {
        return userService.getCustomers();
    }

    @GetMapping("/customers/{id}")
    @Override
    public CustomerEntity getCustomerById(int id) {
        return userService.getCustomerById(id);
    }

    @PostMapping("/customers")
    @Override
    public CustomerEntity addCustomer(@RequestBody CustomerEntity user) {

       System.out.println(user);
       return userService.addCustomer(user);
    }

    @PutMapping("/customers/{user}")
    @Override
    public CustomerEntity updateCustomer(CustomerEntity user) {
        return userService.updateCustomer(user);
    }

    @DeleteMapping("/customers/{id}")
    @Override
    public String DeleteCustomerById(int id) {
        return userService.DeleteCustomerById(id);
    }
}
