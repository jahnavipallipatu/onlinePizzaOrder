package com.example.onlinePizza.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.onlinePizza.entity.Customer;
import com.example.onlinePizza.entity.Pizza;
import com.example.onlinePizza.exceptions.CustomerIdNotFoundException;
import com.example.onlinePizza.repository.ICustomerRepository;
import com.example.onlinePizza.service.ICustomerService;

@RequestMapping("/cust")
@RestController
public class ICustomerController {

	@Autowired
	private ICustomerService iCustomerService;

	public ICustomerController(ICustomerService iCustomerService) {
		
		this.iCustomerService = iCustomerService;
	}

	@RequestMapping("/add")
	@PostMapping
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer) {
		return new ResponseEntity<Customer>(iCustomerService.addCustomer(customer),HttpStatus.CREATED);
	}
	
	@RequestMapping("/view")
	@GetMapping
	public List<Customer> viewCustomers(Customer customer) {
		return iCustomerService.viewCustomers();
	}
	
	@RequestMapping("/view-all/{id}")
	@GetMapping
	public ResponseEntity<Customer> viewCustomer(@PathVariable("id") long customerId) throws CustomerIdNotFoundException {
		return new ResponseEntity<Customer>(iCustomerService.viewCustomer(customerId),HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer){
		return new ResponseEntity<Customer>(iCustomerService.updateCustomer(customer),HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{customerId}")  
	private ResponseEntity<String> deleteCustomer(@PathVariable("customerId") long customerId) throws CustomerIdNotFoundException{  
		iCustomerService.deleteCustomer(customerId);
		return new ResponseEntity<String>(" deleted successfully", HttpStatus.OK);
	}
}
