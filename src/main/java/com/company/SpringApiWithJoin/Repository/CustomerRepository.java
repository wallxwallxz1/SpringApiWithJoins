package com.company.SpringApiWithJoin.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.SpringApiWithJoin.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
