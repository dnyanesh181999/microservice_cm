package com.cjc.loanapplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.loanapplication.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{
public List<Customer> findByStatus(String status);

}
