package com.project.customerservice.service;

import com.project.customerservice.entity.Customer;
import com.project.customerservice.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepo customerRepo;

    @Override
    public Customer getCustomer(int id) {
        return customerRepo.findById(id).get();
    }
}
