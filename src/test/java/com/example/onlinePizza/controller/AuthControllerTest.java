package com.example.onlinePizza.controller;
/*
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;


import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.example.onlinePizza.entity.LoginDTO;
import com.example.onlinePizza.repository.AdminRepository;

	@ExtendWith(MockitoExtension.class)
	//@RunWith(JUnitPlatform.class)
	public class AuthControllerTest {
		
		@InjectMocks
		AuthController authController;
		
	    @Mock
	    AdminRepository adminRepository;
	    
	    @Mock 
	    private AuthenticationManager authenticationManager;
	    
	    @Test
	    public void testAdminLogin() 
	    {
	        MockHttpServletRequest request = new MockHttpServletRequest();
	        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
	        
	        Authentication authentication = new UsernamePasswordAuthenticationToken(new Object(), new Object());
	         
	        when(authenticationManager.authenticate(any(UsernamePasswordAuthenticationToken.class))).thenReturn(authentication);
	         
	        LoginDTO loginDto = new LoginDTO();
	        loginDto.setUsername("admin");
	        loginDto.setPassword("admin");
	        ResponseEntity<String> responseEntity = authController.authenticateUser(loginDto);
	         
	        assertThat(responseEntity.getStatusCodeValue()).isEqualTo(200);
	    }
		

	
}*/
