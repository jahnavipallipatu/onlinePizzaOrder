package com.example.onlinePizza.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onlinePizza.entity.User;

import com.example.onlinePizza.repository.IUserRepository;
	@Service
	public class IUserServiceImpl implements IUserService {

		@Autowired
		private IUserRepository IUserRepository;

		public IUserServiceImpl(IUserRepository IUserRepository) {
			super();
			this.IUserRepository = IUserRepository;
		}

		@Override
		public User addNewUser(User user) {
			return IUserRepository.save(user);
		}
	@Override
	public User signin(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User signout(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean forgotPassword(String oldPassword, String newPassword) {
		// TODO Auto-generated method stub
		return null;
	}


}