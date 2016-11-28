package com.spring.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.module.Customer;

@Repository("customerRepository")
public class CustomerRepositoryImpl implements CustomerRepository {
	
	Customer customer=new Customer();
	@Override
	public List<Customer> findAll(){
		
		List<Customer> customers=new ArrayList<Customer>();
				
		customer.setFirstname("sandeep");
		customer.setLastname("gopal");
		
		customers.add(customer);
		
		return customers;
		
		
	}

}
