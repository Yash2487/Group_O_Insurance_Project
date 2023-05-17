package com.insurance.service.impl;
//Task 149 Build the Restful web service to add user with multiple 
//claim details -----------> Vinayak
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.UserDetails;
import com.insurance.repository.UserRepository;
import com.insurance.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	// inject UserRepository
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails saveUserDetails(UserDetails userDetails) {
		UserDetails userd = userRepository.save(userDetails);
		return userd;
	}

}
