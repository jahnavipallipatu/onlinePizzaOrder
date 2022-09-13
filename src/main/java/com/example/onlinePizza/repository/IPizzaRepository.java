package com.example.onlinePizza.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.web.bind.annotation.RequestMapping;

import com.example.onlinePizza.entity.Pizza;

public interface IPizzaRepository extends JpaRepository<Pizza,Long>{
	
	 List<Pizza> findBypizzaType(String pizzaType);



}
