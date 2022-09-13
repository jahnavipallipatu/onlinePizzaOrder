package com.example.onlinePizza.service;

import java.time.LocalDate;
import java.util.List;

import com.example.onlinePizza.entity.PizzaOrder;
import com.example.onlinePizza.exceptions.OrderIdNotFoundException;



public interface IPizzaOrderService 
{
	    
	   PizzaOrder bookPizzaOrder(PizzaOrder order);

		PizzaOrder updatePizzaOrder(PizzaOrder order);

		PizzaOrder cancelPizzaOrder(int bookingOrderId) throws OrderIdNotFoundException;

		PizzaOrder viewPizzaOrder(int bookingOrderId) throws OrderIdNotFoundException;
		
		List<PizzaOrder> viewOrdersList();
		
		
		//
		
		//List<PizzaOrder> viewOrdersLists(LocalDate date);
		
		//List<PizzaOrder> calculateTotal(String size, int quantity) throws InvalidSizeException;
}