package com.example.onlinePizza.service;

import java.util.List;
import java.util.Optional;

import com.example.onlinePizza.entity.Customer;
import com.example.onlinePizza.exceptions.CustomerIdNotFoundException;

public interface ICustomerService {
	Customer addCustomer(Customer customer);

	Customer updateCustomer(Customer customer);

	void  deleteCustomer(long customerId) throws CustomerIdNotFoundException;

	List<Customer> viewCustomers();

	Customer viewCustomer(long customerId) throws CustomerIdNotFoundException;

	Customer getById(int i);
}
