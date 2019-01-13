package com.company.SpringApiWithJoin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.SpringApiWithJoin.Repository.CustomerRepository;
import com.company.SpringApiWithJoin.Repository.TransactionsRepository;
import com.company.SpringApiWithJoin.model.Customer;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerRepository customerResipotory;
	TransactionsRepository transactionsRepository ;
	
	
	@GetMapping("/alls")
	public Page <Customer> getAll(Pageable pageable){
		return customerResipotory.findAll(pageable);
		
	
	}
	
	@PostMapping("/all")
	public Customer InsertCustomer(Customer customer) {
		return customerResipotory.save(customer);
	}

}
