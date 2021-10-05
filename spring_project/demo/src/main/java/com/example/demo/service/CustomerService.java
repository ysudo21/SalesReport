package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository repository;
 
    public Customer search(java.lang.String rsv_id) {
        Customer customer = repository.findByRsv_id(rsv_id);
        return customer;
    }
}
