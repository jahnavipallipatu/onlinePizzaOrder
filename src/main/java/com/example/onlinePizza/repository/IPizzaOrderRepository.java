package com.example.onlinePizza.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onlinePizza.entity.PizzaOrder;


public interface IPizzaOrderRepository extends JpaRepository<PizzaOrder, Integer>
{

}