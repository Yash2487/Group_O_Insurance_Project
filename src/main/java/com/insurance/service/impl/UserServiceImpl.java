package com.insurance.service.impl;

/*Task 156 Design the API to store user with multiple premium details into database*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.User;
import com.insurance.repository.UserRepository;
import com.insurance.services.UserService;

@Service
public class UserServiceImpl implements UserService {
	// inject the UserRepository
	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveUser(User user) {
		User user1 = userRepository.save(user);
		return user1;
	}

}
