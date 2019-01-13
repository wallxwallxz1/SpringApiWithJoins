package com.company.SpringApiWithJoin.Repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.SpringApiWithJoin.model.Transactions;

@Repository
public interface TransactionsRepository extends JpaRepository<Transactions, Integer>{
	//Page<Transactions> findByCustomerId(Integer customerId, Pageable pageable);
}
