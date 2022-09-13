package com.example.onlinePizza.service;
import java.util.List;
import java.util.Optional;

import com.example.onlinePizza.entity.PizzaOrder;
import com.example.onlinePizza.exceptions.InvalidSizeException;
import com.example.onlinePizza.exceptions.OrderIdNotFoundException;
import com.example.onlinePizza.repository.IPizzaOrderRepository;


	import java.time.LocalDate;
	


	import org.springframework.stereotype.Service;
	import org.springframework.web.bind.annotation.PathVariable;


	@Service
	public class IPizzaOrderServiceImpl implements IPizzaOrderService
	{
		private IPizzaOrderRepository pizzaOrderRepository;
		
		public IPizzaOrderServiceImpl(IPizzaOrderRepository pizzaOrderRepository) 
		{
			super();
			this.pizzaOrderRepository = pizzaOrderRepository;
		}
		
		@Override
		public PizzaOrder bookPizzaOrder(PizzaOrder order) 
		{
			PizzaOrder newOrder= pizzaOrderRepository.save(order);
			return newOrder;
		}
		
		@Override
		public PizzaOrder updatePizzaOrder(PizzaOrder order) 
		{
			//Optional<PizzaOrder> newUpdate = pizzaOrderRepository.findById(order.getBookingOrderId());
			PizzaOrder updateOrder = pizzaOrderRepository.save(order);
			return updateOrder;
		}
		
		@Override
		public PizzaOrder cancelPizzaOrder(int bookingOrderId)  throws OrderIdNotFoundException
		{
			Optional<PizzaOrder> bookingOrderById = pizzaOrderRepository.findById(bookingOrderId);
			if(bookingOrderById.isEmpty())
			{
				throw new OrderIdNotFoundException(bookingOrderId + " Order ID not found");
			}
			
			pizzaOrderRepository.deleteById(bookingOrderId);
			return null;
		}
		
		@Override
		public PizzaOrder viewPizzaOrder(int bookingOrderId) throws OrderIdNotFoundException {
			
			return pizzaOrderRepository.findById(bookingOrderId).orElseThrow(() ->
		    new OrderIdNotFoundException("pizza not found with id-> " +bookingOrderId));
		}
		
		
		@Override
		public List<PizzaOrder> viewOrdersList() 
		{
			return pizzaOrderRepository.findAll();
		}

	

		/*@Override
		public List<PizzaOrder> viewOrdersLists(LocalDate date) 
		{
			return pizzaOrderRepository.findAll();
		}
		
			
		@Override
		public List<PizzaOrder> calculateTotal(String size, int quantity) throws InvalidSizeException 
		{
			
			
			return null;
		}*/

	}
	
	


