package com.insurance.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.Password;
import com.insurance.repository.PasswordRepository;
import com.insurance.service.PasswordService;

@Service
public class PasswordServiceImpl implements PasswordService {

	// inject repository here
	@Autowired
	private PasswordRepository passwordRepository;

	@Override
	public Password changePassword(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Password getPassword(int id) {

		return null;
	}

}
