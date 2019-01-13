package com.company.SpringApiWithJoin.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.company.SpringApiWithJoin.Repository.CustomerRepository;
import com.company.SpringApiWithJoin.Repository.TransactionsRepository;
import com.company.SpringApiWithJoin.model.Customer;


@Service
public class Services {
	
//	@Autowired
//	CustomerRepository customerRepo;
//	
//	@Autowired
//	TransactionsRepository transRepo ;
//	
//	public Page<Customer> getAll(Pageable pageable){
//		
//		return customerRepo.findAll(pageable);
//		
//	}
//	
//	public Customer insertEntity(Customer customer) {
//		return customerRepo.save(customer);
//		
//	}

}
