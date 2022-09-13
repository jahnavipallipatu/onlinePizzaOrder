package com.example.onlinePizza.service;

import com.example.onlinePizza.entity.User;

public interface IUserService {

	User addNewUser(User user);
	User signin(User user);
	User signout(User user);
	Boolean forgotPassword(String oldPassword, String newPassword);
}
