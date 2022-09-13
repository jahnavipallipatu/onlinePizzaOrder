package com.example.onlinePizza.controller;

import java.time.LocalDate;
import java.util.List;

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

import com.example.onlinePizza.entity.PizzaOrder;
import com.example.onlinePizza.exceptions.OrderIdNotFoundException;
import com.example.onlinePizza.service.IPizzaOrderService;


	@RequestMapping("/pizzaorder")
	@RestController
	public class IPizzaOrderController 
	{
		private IPizzaOrderService pizzaOrderService;

		public IPizzaOrderController(IPizzaOrderService pizzaOrderService) 
		{
			super();
			this.pizzaOrderService = pizzaOrderService;
		}
		
		@RequestMapping("/book")
		@PostMapping
		public ResponseEntity<PizzaOrder> bookPizzaOrder(@RequestBody PizzaOrder pizzaOrder)
		{
			return new ResponseEntity<PizzaOrder>(pizzaOrderService.bookPizzaOrder(pizzaOrder),HttpStatus.OK);
		}
		
		@RequestMapping("/update")
		@PutMapping
		public ResponseEntity<PizzaOrder> updatePizzaOrder(@RequestBody PizzaOrder pizzaOrder)
		{
			return new ResponseEntity<PizzaOrder>(pizzaOrderService.updatePizzaOrder(pizzaOrder),HttpStatus.OK);
		}
		
		@RequestMapping("/cancel/{id}")
		@DeleteMapping
		private ResponseEntity<String> cancelPizzaOrder(@PathVariable("id") int bookingOrderId) throws OrderIdNotFoundException
		{
			pizzaOrderService.cancelPizzaOrder(bookingOrderId);
			return new ResponseEntity<String>("Canceled Successfully", HttpStatus.OK);
		}
		
		@RequestMapping("/view/{id}") 
		@GetMapping
		public ResponseEntity<PizzaOrder> findById(@PathVariable("id") int pizzaId)throws OrderIdNotFoundException{
			
			return new ResponseEntity<PizzaOrder>(pizzaOrderService.viewPizzaOrder(pizzaId),HttpStatus.OK);
		}
		
		@RequestMapping("/views")
		@GetMapping
		public List<PizzaOrder> viewOrdersList(PizzaOrder pizzaOrder)
		{
			return pizzaOrderService.viewOrdersList();
		}
		
		/*@GetMapping("/views/{LocalDate}")
		public ResponseEntity<PizzaOrder> viewOrdersLists(@PathVariable("LocalDate") LocalDate orderDateL)
		{
			return new ResponseEntity<PizzaOrder>(pizzaOrderService.viewOrdersLists(orderDateL),HttpStatus.OK);
		}
		
		@PostMapping("/Total")
		public List<PizzaOrder> calculateTotal(String size, int quantity) throws InvalidSizeException {
			
			return null;
		}*/
		
		
	
	
}

	
	

	


