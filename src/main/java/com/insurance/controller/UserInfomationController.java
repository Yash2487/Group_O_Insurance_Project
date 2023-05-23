package com.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.service.UserInformationService;

/*
 * Task- 138 Build the Restful API to delete the user details from database----------> Completed by Abhijeet
 */

@RestController
public class UserInfomationController {

	@Autowired
	private UserInformationService userInformationService;

	@DeleteMapping("/deletedata/{id}")
	public void DeleteUserInfomationDetailsId(@PathVariable("id") Integer id) {
		userInformationService.DeletedById(id);
	}
}
