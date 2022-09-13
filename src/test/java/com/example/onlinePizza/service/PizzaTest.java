package com.example.onlinePizza.service;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.onlinePizza.OnlinePizzaOrderApplication;
import com.example.onlinePizza.entity.Customer;
import com.example.onlinePizza.entity.Pizza;
import com.example.onlinePizza.exceptions.PizzaIdNotFoundException;
import com.example.onlinePizza.repository.ICustomerRepository;
import com.example.onlinePizza.repository.IPizzaRepository;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.assertj.core.api.Assertions;
@ExtendWith(MockitoExtension.class)

class PizzaTest {
	
	private IPizzaService iPizzaService;
	
	final Logger logger = LoggerFactory.getLogger(OnlinePizzaOrderApplication.class);
	
	
	 @Mock
	    private IPizzaRepository pizzaRepository;
	    private IPizzaServiceImpl pizzaServiceImplementation;

	 @Test
	    public void addPizza()
		{
			Pizza pizza = new Pizza();
			pizza.setPizzaId(1);
			pizza.setPizzaType("chees");
			pizza.setPizzaName("swt");
			pizza.setPizzaDescription("100");
			pizza.setPizzaCost(123);
			pizza.setPizzaCostAfterCoupan(123);
			pizzaRepository.save(pizza);			
	    }
	  
}




   