package com.project.customerservice.controller;

import com.project.customerservice.entity.Customer;
import com.project.customerservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/getcustomerbyid/{id}")
    public Customer getCustomerById(@PathVariable int id){
        return customerService.getCustomer(id);
    }
}
