package com.example.onlinePizza.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.onlinePizza.entity.Admin;
import com.example.onlinePizza.entity.LoginDTO;
import com.example.onlinePizza.repository.AdminRepository;

@RestController
@RequestMapping("/api/auth")


public class AuthController {

   @Autowired
    private AuthenticationManager authenticationManager;
   
	
	@Autowired
	AdminRepository adminRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;

    @PostMapping("/login")
    public ResponseEntity<String> authenticateUser(@RequestBody LoginDTO loginDTO){
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                loginDTO.getUsername(), loginDTO.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);
        return new ResponseEntity<>("User signed-in successfully!.", HttpStatus.OK);
    }
    
    @PostMapping("/signup")
    public ResponseEntity<?> registerUser(@RequestBody LoginDTO LoginDTO){

        // create user object
        Admin admin = new Admin();
        admin.setUserName(LoginDTO.getUsername());
        admin.setPassword(passwordEncoder.encode(LoginDTO.getPassword()));


        adminRepository.save(admin);

        return new ResponseEntity<>("User registered successfully", HttpStatus.OK);

    }
}

