package com.example.onlinePizza.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.example.onlinePizza.entity.User;
import com.example.onlinePizza.service.IUserService;

@RequestMapping("/user")
@RestController
public class IUserController {

	@Autowired
	private IUserService iuserService;

	public IUserController(IUserService iuserService) {
		
		this.iuserService = iuserService;
	}

	@RequestMapping("/add")
	@PostMapping
	public ResponseEntity<User> addUser(@RequestBody User user) {
		return new ResponseEntity<User>(iuserService.addNewUser(user),HttpStatus.CREATED);
	}
}
	
	
