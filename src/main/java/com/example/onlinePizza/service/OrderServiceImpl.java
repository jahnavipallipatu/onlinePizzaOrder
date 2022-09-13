package com.example.onlinePizza.service;



import org.springframework.stereotype.Service;

import com.example.onlinePizza.entity.Order;

import com.example.onlinePizza.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {
private OrderRepository orderRepository;
	

	public OrderServiceImpl(OrderRepository orderRepository) {
		super();
		this.orderRepository = orderRepository;
	}



	@Override
	public Order addOrder(Order order) {
		// TODO Auto-generated method stub
		return orderRepository.save(order);
	}




}
