package com.example.onlinePizza.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.onlinePizza.OnlinePizzaOrderApplication;
import com.example.onlinePizza.entity.Customer;
import com.example.onlinePizza.exceptions.CustomerIdNotFoundException;
import com.example.onlinePizza.repository.ICustomerRepository;




class CustomerTest {
	private ICustomerService iCustomerService;

	
	final Logger logger = LoggerFactory.getLogger(OnlinePizzaOrderApplication.class);
	@Mock
	private ICustomerRepository customerRepository;
    private CustomerServiceImpl customerServiceImplementation;

	@Test
    public void addCustomer() {

		Customer customer = new Customer();
		customer.setCustomerName("shankar");
		customer.setCustomerAddress("Bangalore");
		customer.setCustomerEmail("shankar@gmail.com");
		customer.setCustomerId(100);
		customer.setCustomerMobile(12345678);
		customer.setUserName("shankar123");
		customer.setPassword("shankar123");
		//customerRepository.save(customer);
	}
	
}
	

