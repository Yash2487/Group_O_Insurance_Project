package com.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.Password;
import com.insurance.service.PasswordService;

/*
 * Task 144- Build the Restful web services to change the user password
 * by Yash
 */
@RestController
public class PasswordController {
	// inject service here
	@Autowired
	private PasswordService passwordService;

	// design a restful web service to insert password first
	@PostMapping("/savePassword")
	public Password savePassword(@RequestBody Password password) {
		return passwordService.savePassword(password);
	}

	// design a restful web service to update password first
	@PutMapping("/updatePassword/{id}")
	public Password updatePassword(@RequestBody Password password, @PathVariable("id") int id) {
		return passwordService.updatePassword(password);
	}

}
