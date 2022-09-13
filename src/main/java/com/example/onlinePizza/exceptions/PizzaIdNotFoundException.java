package com.example.onlinePizza.exceptions;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class PizzaIdNotFoundException extends Exception {
	
	public PizzaIdNotFoundException(String message) {
		super(message);
	}
}
