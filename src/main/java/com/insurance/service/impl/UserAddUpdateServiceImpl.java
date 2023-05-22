package com.insurance.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.UserAddUpdate;
import com.insurance.repository.UserAddUpdateRepository;
import com.insurance.service.UserAddUpdateService;

@Service
public class UserAddUpdateServiceImpl implements UserAddUpdateService {
	// create object of logger
	private static final Logger log = LoggerFactory.getLogger(UserAddUpdateServiceImpl.class);

	// inject repository here
	@Autowired
	private UserAddUpdateRepository repository;

	@Override
	public UserAddUpdate addUserDetails(UserAddUpdate user) {
		log.info("In UserServiceImpl->addUserDetails(), add user method");
		return repository.save(user);
	}

	@Override
	public UserAddUpdate updateUserDeatils(UserAddUpdate user) {
		log.info("In UserServiceImpl->updateUserDeatils(), update user method");
		UserAddUpdate user2 = repository.findById(user.getId()).orElse(null);
		if (user2 != null) {
			user2.setName(user.getName());
			user2.setCity(user.getCity());
			user2.setEmail(user.getEmail());
			repository.save(user2);
			return user2;
		}
		return null;
	}

}
