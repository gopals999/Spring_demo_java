package com.spring.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.repository.CustomerRepository;
import com.spring.repository.CustomerRepositoryImpl;
import com.spring.service.CustomerService;
import com.spring.service.CustomerServiceImpl;

@Configuration
public class AppConfigConstructor {
	
//	@Bean(name="customerService")
//	public CustomerService getCustomerService()
//	{
//		CustomerServiceImpl customerService=new CustomerServiceImpl(getcustomerRepository());//FOR CONSTRUCTOR BASED
//	
//		return  customerService;
//	}

	@Bean(name="customerRepository")
	public CustomerRepository getcustomerRepository(){
		return new CustomerRepositoryImpl();
	}
}
