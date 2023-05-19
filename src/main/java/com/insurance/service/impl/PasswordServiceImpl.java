package com.insurance.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.Password;
import com.insurance.repository.PasswordRepository;
import com.insurance.service.PasswordService;

/*
 * Task 144- Build the Restful web services to change the user password
 * by Yash
 */
@Service
public class PasswordServiceImpl implements PasswordService {

	// inject repo here
	@Autowired
	private PasswordRepository passwordRepository;

	@Override
	public Password savePassword(Password password) {
		return passwordRepository.save(password);
	}

	@Override
	public Password updatePassword(Password password) {
		Password updatePassword = passwordRepository.findById(password.getId()).orElse(null);
		if (updatePassword != null) {
			updatePassword.setNewPassword(password.getNewPassword());
			passwordRepository.save(updatePassword);
			return updatePassword;
		}
		return null;
	}

}
