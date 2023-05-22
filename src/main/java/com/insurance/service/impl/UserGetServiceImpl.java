package com.insurance.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.UserGet;
import com.insurance.repository.UserGetRepository;
import com.insurance.service.UserGetService;

@Service
public class UserGetServiceImpl implements UserGetService {
	// inject repository here
	@Autowired
	private UserGetRepository getRepository;

	@Override
	public UserGet getUserByID(int id) {
		UserGet userGet = getRepository.getUserById(id);
		return userGet;
	}

}
