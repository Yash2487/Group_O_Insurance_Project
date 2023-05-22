package com.insurance.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.UserAddUpdate;
import com.insurance.service.UserAddUpdateService;

/*
 * Task 135-- Build the Restful API to update user details into database
 * @author Yash Mate
 * @see UserAddUpdateController
 * @see UserAddUpdate
 * @see UserAddUpdateRepository
 * @see UserAddUpdateService
 * @see UserAddUpdateServiceImpl
 */
@RestController
public class UserAddUpdateController {
	// create object of logger
	private static final Logger log = LoggerFactory.getLogger(UserAddUpdateController.class);

	// inject service here
	@Autowired
	private UserAddUpdateService userService;

	// Build the Restful API to add user details into database
	@PostMapping("/addUserDetails")
	public UserAddUpdate addUserDetails(@RequestBody UserAddUpdate user) {
		log.info("In RestController->addUserDetails(), adding user Data");
		return userService.addUserDetails(user);
	}

	@PutMapping("/updateUserDetail/{id}")
	public UserAddUpdate updateUserDeatils(@RequestBody UserAddUpdate user, @PathVariable("id") int id) {
		return userService.updateUserDeatils(user);
	}
}
