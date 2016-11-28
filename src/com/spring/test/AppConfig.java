package com.spring.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.spring.service.CustomerService;
import com.spring.service.CustomerServiceImpl;

@Configuration
@ComponentScan({"com.spring"})
public class AppConfig {
	
	@Bean(name="customerService")
	@Scope("singleton")
	public CustomerService getCustomerService()
	{
		CustomerServiceImpl customerService=new CustomerServiceImpl();
		//customerService.setCustomerRepository(getcustomerRepository());
		return  customerService;
	}

//	@Bean(name="customerRepository")
//	public CustomerRepository getcustomerRepository(){
//		return new CustomerRepositoryImpl();
//	}
}
