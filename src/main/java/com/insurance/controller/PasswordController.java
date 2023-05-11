package com.insurance.controller;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.Password;

@RestController
public class PasswordController {

	// inject service here

	// Build the Restful web services to change the user password
	@PutMapping("/changePass/{id}")
	public Password changePassword(@RequestBody Password password, @RequestParam("id") int id) {
		return password;
	}

}
