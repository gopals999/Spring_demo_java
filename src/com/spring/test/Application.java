package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.service.CustomerService;
import com.spring.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {
		
		ApplicationContext appContext=new AnnotationConfigApplicationContext(AppConfig.class);
		
		CustomerService customerSer=appContext.getBean("customerService", CustomerService.class);
//	System.out.println(customerSer); //to show the singleton differ
		
		
		System.out.println(customerSer.findAll().get(0).getFirstname());
	//System.out.println(customerSer); //to show the singleton differ
		System.out.println(customerSer.findAll().get(0).getLastname());
		
	}
}
