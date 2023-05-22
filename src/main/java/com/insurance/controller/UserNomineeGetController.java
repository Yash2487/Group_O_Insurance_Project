package com.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.UserGet;
import com.insurance.service.UserGetService;

/*
 * Task 169 Design Service to get user with multiple nominee details from system
 * @author Yash Mate
 * @see UserNomineeGetController
 * @see NomineeGet
 * @see UserGet
 * @see UserGetRepository
 * @see UserGetService
 * @see UserGetServiceImpl
 */
@RestController
//@RequestMapping(value = "/user")
public class UserNomineeGetController {
	// inject user service
	@Autowired
	private UserGetService userGetService;

	@GetMapping("/getUserNominee/{id}")
	public UserGet getUserNomineeDetails(@PathVariable("id") int id) {
		UserGet user = userGetService.getUserByID(id);
		return user;

	}
}
