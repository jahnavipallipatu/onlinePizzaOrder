package com.example.onlinePizza.service;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.onlinePizza.OnlinePizzaOrderApplication;
import com.example.onlinePizza.entity.Coupan;
import com.example.onlinePizza.entity.PizzaOrder;
import com.example.onlinePizza.repository.ICoupanRepository;
import com.example.onlinePizza.repository.IPizzaOrderRepository;

class PizzaOrderTest {

private IPizzaOrderService iPizzaOrderService;
	
	final Logger logger = LoggerFactory.getLogger(OnlinePizzaOrderApplication.class);
	
	
	 @Mock
	    private IPizzaOrderRepository ipizzaorderRepository;
	    private IPizzaOrderServiceImpl ipizzaordderServiceImpl;
	    

	    @Test
	    public void bookPizzaOrder()
		{
	    	PizzaOrder pizzaorder = new PizzaOrder();
	    	pizzaorder.setBookingOrderId(1);
	    	pizzaorder.setTransactionMode("chees");
	    	pizzaorder.setQuantity(3);
	    	pizzaorder.setSizes("10");
	    	pizzaorder.setTotalCosts(56);

					
	    }

}
