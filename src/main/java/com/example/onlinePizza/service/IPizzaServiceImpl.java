package com.example.onlinePizza.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.onlinePizza.entity.Customer;
import com.example.onlinePizza.entity.Pizza;
import com.example.onlinePizza.exceptions.CustomerIdNotFoundException;
import com.example.onlinePizza.exceptions.InvalidMinCostException;
import com.example.onlinePizza.exceptions.PizzaIdNotFoundException;
import com.example.onlinePizza.repository.IPizzaRepository;



@Service
public class IPizzaServiceImpl implements IPizzaService {

	private IPizzaRepository iPizzaRepository;
	

	public IPizzaServiceImpl(IPizzaRepository iPizzaRepository) {
		super();
		this.iPizzaRepository = iPizzaRepository;
	}


	@Override
	public Pizza addPizza(Pizza pizza) {
		return iPizzaRepository.save(pizza);
	}

	@Override
	public List<Pizza> viewPizzaList() {
		return iPizzaRepository.findAll();
	}


	@Override
	public Pizza updatePizza(Pizza pizza) {
		
		return iPizzaRepository.save(pizza);
	}

	@Override
	public void deletePizza(long pizzaId) throws PizzaIdNotFoundException {
		iPizzaRepository.findById(pizzaId).orElseThrow(() -> new PizzaIdNotFoundException("Pizza not found with id" +pizzaId));

		iPizzaRepository.deleteById(pizzaId);
		
	}


	@Override
	public Pizza viewPizza(long pizzaId) throws PizzaIdNotFoundException {
		return iPizzaRepository.findById(pizzaId).orElseThrow(() ->
	    new PizzaIdNotFoundException("Pizza not found with id-> " +pizzaId));
	}

	



	


	
	


	
	
}
