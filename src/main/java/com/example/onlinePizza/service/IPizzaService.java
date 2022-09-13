package com.example.onlinePizza.service;

import java.util.List;
import java.util.Optional;

import com.example.onlinePizza.entity.Pizza;
import com.example.onlinePizza.exceptions.InvalidMinCostException;
import com.example.onlinePizza.exceptions.PizzaIdNotFoundException;

public interface IPizzaService {

	Pizza addPizza(Pizza pizza);
	
	List<Pizza> viewPizzaList();
		
	Pizza updatePizza(Pizza pizza);
	
	void deletePizza(long pizzaId) throws PizzaIdNotFoundException;
	
	Pizza viewPizza(long pizzaId) throws PizzaIdNotFoundException;


	

	
}
