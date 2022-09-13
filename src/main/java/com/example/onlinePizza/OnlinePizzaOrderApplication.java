package com.example.onlinePizza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class OnlinePizzaOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlinePizzaOrderApplication.class, args);
	}

}
