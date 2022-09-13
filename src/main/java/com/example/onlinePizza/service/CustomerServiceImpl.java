package com.example.onlinePizza.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onlinePizza.entity.Customer;
import com.example.onlinePizza.exceptions.CustomerIdNotFoundException;
import com.example.onlinePizza.exceptions.PizzaIdNotFoundException;
import com.example.onlinePizza.repository.ICustomerRepository;

@Service
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	private ICustomerRepository iCustomerRepository;

	public CustomerServiceImpl(ICustomerRepository iCustomerRepository) {
		super();
		this.iCustomerRepository = iCustomerRepository;
	}

	@Override
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return iCustomerRepository.save(customer);
	}
	
	@Override
	public List<Customer> viewCustomers() {
		// TODO Auto-generated method stub
		return iCustomerRepository.findAll();
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return iCustomerRepository.save(customer);
	}

	@Override
	public void deleteCustomer(long customerId) throws CustomerIdNotFoundException {
		// TODO Auto-generated method stub
		iCustomerRepository.findById(customerId).orElseThrow(() -> new CustomerIdNotFoundException("Customer not found with id" +customerId));

		iCustomerRepository.deleteById(customerId);
	
	}

	@Override
	public Customer viewCustomer(long customerId) throws CustomerIdNotFoundException {
		// TODO Auto-generated method stub
		return iCustomerRepository.findById(customerId).orElseThrow(() ->
	    new CustomerIdNotFoundException("customer not found with id-> " +customerId));
	}

	@Override
	public Customer getById(int i) {
		// TODO Auto-generated method stub
		return null;
	}	
}
