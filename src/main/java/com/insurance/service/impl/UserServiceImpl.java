package com.insurance.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.insurance.model.User;
import com.insurance.repository.UserRepository;
import com.insurance.service.UserService;


/*Task 167 Design Service to add user with multiple nominee details into system
 * completed By Abhijit Daware
 */

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveUser(User user) {
		User users = userRepository.save(user);
		return users;
	}

}
