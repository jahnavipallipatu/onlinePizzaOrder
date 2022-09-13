package com.example.onlinePizza.exceptions;

public class OrderIdNotFoundException extends Exception {
	public OrderIdNotFoundException() {

	}

	public OrderIdNotFoundException(String message) {
		super(message);
	}
}
