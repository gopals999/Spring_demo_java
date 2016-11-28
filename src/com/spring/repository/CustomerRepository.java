package com.spring.repository;

import java.util.List;

import com.spring.module.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}