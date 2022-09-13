package com.example.onlinePizza.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.onlinePizza.entity.Customer;
import com.example.onlinePizza.exceptions.CustomerIdNotFoundException;


@Repository
public interface ICustomerRepository extends JpaRepository<Customer,Long> {

	//Object viewCustomer(int i);
//	Customer addCustomer(Customer customer);

//	Customer updateCustomer(Customer customer);
//
//	Customer deleteCustomer(int customerId) throws CustomerIdNotFoundException;
//
//	List<Customer> viewCustomers();
//
//	Customer viewCustomer(int customerId) throws CustomerIdNotFoundException;

}
