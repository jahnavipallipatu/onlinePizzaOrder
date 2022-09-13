package com.example.onlinePizza.service;
/*
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;
import org.springframework.stereotype.Component;

@Component
public class AuthenticationEntryPoint extends BasicAuthenticationEntryPoint  
{
	@Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authEx)
      throws IOException, SecurityException{
        response.addHeader("WWW-Authenticate", "Basic realm=" +getRealmName());
        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        PrintWriter writer = response.getWriter();
        writer.println("HTTP Status 401 - " + authEx.getMessage());
    }

	@Override
    public void afterPropertiesSet() throws SecurityException{
        setRealmName("DeveloperStack");
        super.afterPropertiesSet();
    }
}

*/
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.security.core.userdetails.User;

import com.example.onlinePizza.entity.Admin;
import com.example.onlinePizza.repository.AdminRepository;
import com.example.onlinePizza.repository.ICustomerRepository;
import com.example.onlinePizza.repository.IUserRepository;



@Service
public class AuthenticationEntryService implements UserDetailsService{
	

	
	@Autowired
	AdminRepository adminRepository;

	@Override
    @Transactional
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Admin admin = adminRepository.findByUserName(userName);
        if (admin != null) {
            return new User(admin.getUserName(), admin.getPassword(), new TreeSet<GrantedAuthority>());
        } else {
            throw new UsernameNotFoundException("User not found with username: " + userName);
        }
    }
 

}
