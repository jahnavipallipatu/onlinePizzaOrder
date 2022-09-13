package com.example.onlinePizza.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onlinePizza.entity.Order;

public interface OrderRepository extends JpaRepository<Order,Long>{

}
