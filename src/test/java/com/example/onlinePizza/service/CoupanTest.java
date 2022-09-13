package com.example.onlinePizza.service;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

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
import com.example.onlinePizza.controller.CoupanController;
import com.example.onlinePizza.entity.Coupan;
import com.example.onlinePizza.entity.User;
import com.example.onlinePizza.repository.ICoupanRepository;
import com.example.onlinePizza.repository.IUserRepository;


class CoupanTest {

private ICoupanService icoupanService;
	
	final Logger logger = LoggerFactory.getLogger(OnlinePizzaOrderApplication.class);
	
	
	 @Mock
	    private ICoupanRepository coupanRepository;
	    private CoupanServiceImpl coupanServiceImpl;
	    

		 @Test
		    public void addCoupans()
			{
			 Coupan coupan = new Coupan();
			 coupan.setCoupanId(1);
			 coupan.setCoupanName("chees");
			 coupan.setCoupanType("chees");
			 coupan.setCoupanDescription("chees");
			 coupan.setCoupanPizzaId(1);
			// coupanRepository.save(coupan);

			}
	
}
