package com.insurance.service.impl;

/*Task 156 Design the API to store user with multiple premium details into database*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.UserPremium;
import com.insurance.repository.UserPremiumRepository;
import com.insurance.services.UserPremiumService;

@Service
public class UserPremumServiceImpl implements UserPremiumService {
	// inject the UserRepository
	@Autowired
	private UserPremiumRepository userRepository;

	@Override
	public UserPremium saveUser(UserPremium user) {
		UserPremium user1 = userRepository.save(user);
		return user1;
	}

}
