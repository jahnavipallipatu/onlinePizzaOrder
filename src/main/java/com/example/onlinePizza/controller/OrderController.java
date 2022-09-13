package com.example.onlinePizza.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.onlinePizza.entity.Order;
import com.example.onlinePizza.entity.User;
import com.example.onlinePizza.service.IUserService;
import com.example.onlinePizza.service.OrderService;

@RequestMapping("/order")
@RestController
public class OrderController {
	@Autowired
	private OrderService orderService;

	public OrderController(OrderService orderService) {
		
		this.orderService = orderService;
	}

	@RequestMapping("/add")
	@PostMapping
	public ResponseEntity<Order> addOrder(@RequestBody Order order) {
		return new ResponseEntity<Order>(orderService.addOrder(order),HttpStatus.CREATED);
	}
}
