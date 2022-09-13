package com.example.onlinePizza.service;


import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
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
import com.example.onlinePizza.entity.User;
import com.example.onlinePizza.repository.IUserRepository;

class UserTest {
	private IUserService iuserService;
	
	final Logger logger = LoggerFactory.getLogger(OnlinePizzaOrderApplication.class);
	
	
	 @Mock
	    private IUserRepository userRepository;
	    private IUserServiceImpl userServiceImplementation;
	    

		 @Test
		    public void addUser()
			{
			 User user = new User();
			 user.setUserId(1);
			 user.setUserName("chees");
			 user.setPassword("chees");
			 //userRepository.save(user);
		    }

	
}
