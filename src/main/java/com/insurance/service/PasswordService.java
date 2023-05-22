package com.insurance.service;

import com.insurance.model.Password;

/*
 * Task 144- Build the Restful web services to change the user password
 * by Yash
 */
public interface PasswordService {

	// method to save password first
	public Password savePassword(Password password);

	// method to update password
	public Password updatePassword(Password password);
}
