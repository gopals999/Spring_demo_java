package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.module.Customer;
import com.spring.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	public CustomerServiceImpl(){
		
	}

	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
	
	// when u wanna u use constructor configuration use this by AppConfigConstructor class
//	public CustomerServiceImpl(CustomerRepository customerRepository) {
//		super();
//		this.customerRepository = customerRepository;
//	}


	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();

	}

}
