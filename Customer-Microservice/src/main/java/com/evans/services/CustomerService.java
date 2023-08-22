package com.evans.services;

import com.evans.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CustomerEventService customerEventService;

    public Customer save(Customer customer) {
        System.out.println("Received " + customer);
        customerEventService.publish(customer);
        return customer;
    }
}
