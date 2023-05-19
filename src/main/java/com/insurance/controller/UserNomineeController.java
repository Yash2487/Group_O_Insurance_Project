package com.insurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.insurance.model.Nominee;
import com.insurance.model.User;
import com.insurance.service.NomineeService;
import com.insurance.service.UserService;

/*Task 167 Design Service to add user with multiple nominee details into system
 * completed By Abhijit Daware
 */

@RestController

public class UserNomineeController {
	@Autowired
	private UserService userService;
	@Autowired
	private NomineeService nomineeService;

@PostMapping("/saveNominee")
	public User saveUserNominee(@RequestBody User user) {
		User user1 = userService.saveUser(user);
		List<Nominee> nominees = user.getNomineeList();
		for (Nominee nominee : nominees) {
			nominee.setUserId(user.getId());
			nomineeService.saveNominee(nominee);

		}
		return user1;
	}
}
