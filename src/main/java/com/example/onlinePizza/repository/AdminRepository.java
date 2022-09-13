package com.example.onlinePizza.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.onlinePizza.entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer>{
	
	@Query(value = "select * from ADMIN a where a.USERNAME = :userName", nativeQuery = true)
	Admin findByUserName(@Param("userName") String userName);
}