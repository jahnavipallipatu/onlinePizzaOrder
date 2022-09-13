package com.example.onlinePizza.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.onlinePizza.entity.User;

public interface IUserRepository extends JpaRepository<User,Long>{
	
}
